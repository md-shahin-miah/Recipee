package com.shahin.androidflow.repository


import com.shahin.androidflow.roomDB.dao.FoodRecipeDao
import com.shahin.androidflow.roomDB.entity.FavoritesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class FavRepositoryImpl @Inject constructor(
    private val foodRecipeDao: FoodRecipeDao
) : FavRepository {
    override fun getFavouriteFromRoom(): Flow<List<FavoritesEntity>> = foodRecipeDao.getAllFavouriteData()
/*
    override fun getFavouriteFromRoom(): Flow<List<FavouriteEntity>> {
        return flow<List<FavouriteEntity>> {

            // get the comment Data from the api
            val comment=postDao.getAllFavouriteData()

            // Emit this data wrapped in
            // the helper class [CommentApiState]
            emit(comment)
        }.flowOn(Dispatchers.IO)
    }
*/

}
