package com.shahin.androidflow.viewmodel

import androidx.lifecycle.*
import com.shahin.androidflow.repository.FavRepositoryImpl
import com.shahin.androidflow.roomDB.entity.FavoritesEntity

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject


@HiltViewModel
class FavViewModel @Inject constructor(private val favRepository: FavRepositoryImpl) : ViewModel() {
    fun getFullListFav(): Flow<List<FavoritesEntity>> = favRepository.getFavouriteFromRoom()


}