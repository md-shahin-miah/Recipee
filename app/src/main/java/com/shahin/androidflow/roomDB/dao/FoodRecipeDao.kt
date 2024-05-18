package com.shahin.androidflow.roomDB.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.shahin.androidflow.models.ResultListing
import com.shahin.androidflow.roomDB.entity.FavoritesEntity

import kotlinx.coroutines.flow.Flow


@Dao
interface FoodRecipeDao {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipes(resultListing: List<ResultListing>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavorite(model: FavoritesEntity)

    @Query("SELECT * FROM favorite_recipes_table")
    fun getAllFavouriteData(): Flow<List<FavoritesEntity>>


    @Query("SELECT EXISTS (SELECT 1 FROM favorite_recipes_table WHERE recipeId = :id)")
    fun isFavorite(id: Int): Boolean

    @Query("DELETE FROM favorite_recipes_table WHERE recipeId = :id")
    fun deleteData(id: Int)

    @Query("DELETE FROM recipes_table")
    fun deleteAllData()

    @Query("SELECT COUNT (recipeId) FROM recipes_table")
    fun getRowCount(): Int



    @Query("SELECT * FROM recipes_table ORDER BY recipeId ASC LIMIT :limit OFFSET :offset")
    suspend fun getPagedList(limit: Int, offset: Int): List<ResultListing>
/*====================================================================================*/

    @Query("SELECT * FROM recipes_table ORDER BY AUTOid ASC")
    fun readRecipes(): Flow<List<ResultListing>>

    @Query("SELECT * FROM favorite_recipes_table ORDER BY recipeId ASC")
    fun readFavoriteRecipes(): Flow<List<FavoritesEntity>>

    @Delete
    suspend fun deleteFavoriteRecipe(favoritesEntity: FavoritesEntity)

    @Query("DELETE FROM favorite_recipes_table")
    suspend fun deleteAllFavoriteRecipes()


}