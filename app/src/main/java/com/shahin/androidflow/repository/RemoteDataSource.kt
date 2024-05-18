package com.shahin.androidflow.repository

import android.util.Log
import com.shahin.androidflow.models.FoodRecipe
import com.shahin.androidflow.network.ApiService

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val apiService: ApiService,
) {


    suspend fun getRecipesFromServer(): Response<FoodRecipe> {
        return apiService.getRecipes()
    }


}