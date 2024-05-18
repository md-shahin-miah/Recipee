package com.shahin.androidflow.repository


import android.util.Log

import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject


@ActivityRetainedScoped
class RecipesRepository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {
    val remote = remoteDataSource
    val local = localDataSource
}