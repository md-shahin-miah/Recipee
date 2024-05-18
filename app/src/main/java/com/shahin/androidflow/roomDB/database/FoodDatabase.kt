package com.shahin.androidflow.roomDB.database

import androidx.room.Database
import androidx.room.RoomDatabase

import com.shahin.androidflow.models.ResultEntity
import com.shahin.androidflow.models.ResultListing
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao
import com.shahin.androidflow.roomDB.entity.FavoritesEntity

@Database(
    entities = [FavoritesEntity::class, ResultListing::class, ResultEntity::class],
    version = 1,
    exportSchema = false
)

abstract class FoodDatabase : RoomDatabase() {

    abstract fun getFoodRecipeDao(): FoodRecipeDao

}