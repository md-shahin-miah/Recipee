package com.shahin.androidflow.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.shahin.androidflow.models.ResultListing
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao
import com.shahin.androidflow.roomDB.entity.FavoritesEntity

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDAO: FoodRecipeDao,
) {
    fun readRecipes(): Flow<List<ResultListing>> {
        return recipesDAO.readRecipes()
    }

    fun readFavoriteRecipes(): Flow<List<FavoritesEntity>> {
        return recipesDAO.readFavoriteRecipes()
    }

    suspend fun insertRecipes(recipesEntity: List<ResultListing>) {
        recipesDAO.insertRecipes(recipesEntity)
        recipesEntity?.forEach() { it ->
            Log.e("TAG_ROOMDATABASE", "insertRecipes: "+it )
            //recipesDAO.insertRecipes(recipesEntity)
        }

    }

    suspend fun insertFavoriteRecipes(favoritesEntity: FavoritesEntity) {
       recipesDAO.insertFavorite(favoritesEntity)
    }
  suspend fun isFavorite(recipeId:Int) : Boolean? {
     return  recipesDAO.isFavorite(recipeId)
    }


    suspend fun deleteFavoriteRecipe(favoritesEntity: FavoritesEntity) {
        recipesDAO.deleteFavoriteRecipe(favoritesEntity)
    }

    suspend fun deleteAllFavoriteRecipes() {
        recipesDAO.deleteAllFavoriteRecipes()
    }
}