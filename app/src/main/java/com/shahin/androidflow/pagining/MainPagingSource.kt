package com.shahin.androidflow.pagining

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.shahin.androidflow.models.ResultListing
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao
import kotlinx.coroutines.delay

class MainPagingSource(
    private val dao: FoodRecipeDao
) : PagingSource<Int, ResultListing>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResultListing> {
        val page = params.key ?: 0

        return try {
            val entities = dao.getPagedList(params.loadSize, page * params.loadSize)

            // simulate page loading
            if (page != 0) delay(1000)

            LoadResult.Page(
                data = entities,
                prevKey = if (page == 0) null else page - 1,
                nextKey = if (entities.isEmpty()) null else page + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ResultListing>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}