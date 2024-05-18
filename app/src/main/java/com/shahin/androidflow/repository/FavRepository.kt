package com.shahin.androidflow.repository


import com.shahin.androidflow.roomDB.entity.FavoritesEntity
import kotlinx.coroutines.flow.Flow


interface FavRepository {
    fun getFavouriteFromRoom(): Flow<List<FavoritesEntity>>

}
