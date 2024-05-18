package com.shahin.androidflow.viewmodel

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.*
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.shahin.androidflow.Utlis.DataStoreRepository

import com.shahin.androidflow.Utlis.NetworkResult
import com.shahin.androidflow.models.FoodRecipe
import com.shahin.androidflow.models.ResultListing
import com.shahin.androidflow.pagining.MainPagingSource
import com.shahin.androidflow.repository.RecipesRepository
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao
import com.shahin.androidflow.roomDB.entity.FavoritesEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(
    application: Application,
    private val postRepository: RecipesRepository,
    private val foodRecipeDao: FoodRecipeDao,
    private val dataStoreRepository: DataStoreRepository,
) : AndroidViewModel(application) {

    var networkStatus = false
    var backOnline = false

    val readBackOnline = dataStoreRepository.readBackOnline.asLiveData()

    /**  Retrofit  */
    var recipesResponse: MutableLiveData<NetworkResult<FoodRecipe>> = MutableLiveData()


    fun getRecipes() = viewModelScope.launch {
        getRecipesSafeCall()
    }

    private suspend fun getRecipesSafeCall() {
        recipesResponse.value = NetworkResult.Loading()
        if (hasInternetConnection()) {
            try {
                val response = postRepository.remote.getRecipesFromServer()
                Log.e("TAG_response", "getRecipesSafeCall: " + response)
                recipesResponse.value = handleFoodRecipesResponse(response)

                val foodRecipe = recipesResponse.value!!.data?.results
                if (foodRecipe != null) {
                    offlineCacheRecipes(foodRecipe)
                }
            } catch (e: Exception) {
                recipesResponse.value = NetworkResult.Error("Ops!,Recipes not found.....")
            }
        } else {
            recipesResponse.value = NetworkResult.Error("No Internet Connection.")
        }
    }


    /**  Room Database  */

    val readRecipes: LiveData<List<ResultListing>> = postRepository.local.readRecipes().asLiveData()
    val readFavoriteRecipes: LiveData<List<FavoritesEntity>> =
        postRepository.local.readFavoriteRecipes().asLiveData()


    private fun offlineCacheRecipes(foodRecipe: List<ResultListing>) {
        insertRecipes(foodRecipe)
    }

    private fun insertRecipes(recipesEntity: List<ResultListing>) =
        viewModelScope.launch(Dispatchers.IO) {
            postRepository.local.insertRecipes(recipesEntity)
        }

    private fun handleFoodRecipesResponse(response: Response<FoodRecipe>): NetworkResult<FoodRecipe> {
        when {
            response.message().toString().contains("timeout") -> {
                return NetworkResult.Error("Timeout")
            }

            response.code() == 402 -> {
                return NetworkResult.Error("API Key Limited.")
            }

            response.body()!!.results.isNullOrEmpty() -> {
                return NetworkResult.Error("Recipes not found.")
            }

            response.isSuccessful -> {
                val foodRecipes = response.body()
                return NetworkResult.Success(foodRecipes!!)
            }

            else -> {
                return NetworkResult.Error(response.message())
            }
        }
    }


    private fun hasInternetConnection(): Boolean {
        val connectivityManager = getApplication<Application>().getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager
        val activeNetwork = connectivityManager.activeNetwork ?: return false
        val capabilities = connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false
        return when {
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false
        }
    }

    private fun saveBackOnline(backOnline: Boolean) = viewModelScope.launch(Dispatchers.IO) {
        dataStoreRepository.saveBackOnline(backOnline)
    }

    fun showNetworkStatus() {
        if (!networkStatus) {
            Toast.makeText(getApplication(), "No Internet Connection.", Toast.LENGTH_SHORT).show()
            saveBackOnline(true)
        } else if (networkStatus) {
            if (backOnline) {
                Toast.makeText(getApplication(), "We're back online.", Toast.LENGTH_SHORT).show()
                saveBackOnline(false)
            }
        }
    }

    fun deleteAllFavoriteRecipes() =
        viewModelScope.launch(Dispatchers.IO) {
            postRepository.local.deleteAllFavoriteRecipes()
        }


    fun insertFavoriteRecipe(favoritesEntity: FavoritesEntity) =
        viewModelScope.launch(Dispatchers.IO) {
            postRepository.local.insertFavoriteRecipes(favoritesEntity)
        }

   /* fun isFavorite(recipeId: Int): LiveData<Boolean> {
        val mutableData: MutableLiveData<Boolean> = MutableLiveData(false)
        viewModelScope.launch(Dispatchers.IO) {
             mutableData.postValue(postRepository.local.isFavorite(recipeId))
           // mutableData.value = postRepository.local.isFavorite(recipeId)
            Log.e("TAG_mutableData", "isFavorite: " + mutableData.value)
        }
        return mutableData
    }*/
      suspend fun isFavorite(recipeId: Int): Boolean? {
          val mutableData = Boolean
          return postRepository.local.isFavorite(recipeId)
      }

    fun deleteFavoriteRecipe(favoritesEntity: FavoritesEntity) =
        viewModelScope.launch(Dispatchers.IO) {
            postRepository.local.deleteFavoriteRecipe(favoritesEntity)
        }
    val getDataFromRoomWithOffset = Pager(
        PagingConfig(
            pageSize = 5,
            enablePlaceholders = false,
            initialLoadSize = 5
        ),
    ) {
        MainPagingSource(foodRecipeDao)
    }.flow.cachedIn(viewModelScope)


}

