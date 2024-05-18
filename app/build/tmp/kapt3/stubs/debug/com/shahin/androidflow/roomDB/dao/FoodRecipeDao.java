package com.shahin.androidflow.roomDB.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import com.shahin.androidflow.models.ResultListing;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0011\u0010\u0004\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000eH\'J\'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\bH\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000bH\'J\u001f\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000eH\'J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000f0\u000eH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "", "deleteAllData", "", "deleteAllFavoriteRecipes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteData", "id", "", "deleteFavoriteRecipe", "favoritesEntity", "Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;", "(Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavouriteData", "Lkotlinx/coroutines/flow/Flow;", "", "getPagedList", "Lcom/shahin/androidflow/models/ResultListing;", "limit", "offset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRowCount", "insertFavorite", "model", "insertRecipes", "resultListing", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "", "readFavoriteRecipes", "readRecipes", "app_debug"})
public abstract interface FoodRecipeDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    @androidx.room.Transaction
    public abstract java.lang.Object insertRecipes(@org.jetbrains.annotations.NotNull
    java.util.List<com.shahin.androidflow.models.ResultListing> resultListing, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertFavorite(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.entity.FavoritesEntity model);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM favorite_recipes_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity>> getAllFavouriteData();
    
    @androidx.room.Query(value = "SELECT EXISTS (SELECT 1 FROM favorite_recipes_table WHERE recipeId = :id)")
    public abstract boolean isFavorite(int id);
    
    @androidx.room.Query(value = "DELETE FROM favorite_recipes_table WHERE recipeId = :id")
    public abstract void deleteData(int id);
    
    @androidx.room.Query(value = "DELETE FROM recipes_table")
    public abstract void deleteAllData();
    
    @androidx.room.Query(value = "SELECT COUNT (recipeId) FROM recipes_table")
    public abstract int getRowCount();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM recipes_table ORDER BY recipeId ASC LIMIT :limit OFFSET :offset")
    public abstract java.lang.Object getPagedList(int limit, int offset, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.shahin.androidflow.models.ResultListing>> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM recipes_table ORDER BY AUTOid ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shahin.androidflow.models.ResultListing>> readRecipes();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM favorite_recipes_table ORDER BY recipeId ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity>> readFavoriteRecipes();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.entity.FavoritesEntity favoritesEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM favorite_recipes_table")
    public abstract java.lang.Object deleteAllFavoriteRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}