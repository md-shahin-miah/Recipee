package com.shahin.androidflow.repository;

import android.util.Log;
import androidx.lifecycle.LiveData;
import com.shahin.androidflow.models.ResultListing;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u0018J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/shahin/androidflow/repository/LocalDataSource;", "", "recipesDAO", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "(Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;)V", "deleteAllFavoriteRecipes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteRecipe", "favoritesEntity", "Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;", "(Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavoriteRecipes", "insertRecipes", "recipesEntity", "", "Lcom/shahin/androidflow/models/ResultListing;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "", "recipeId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFavoriteRecipes", "Lkotlinx/coroutines/flow/Flow;", "readRecipes", "app_debug"})
public final class LocalDataSource {
    private final com.shahin.androidflow.roomDB.dao.FoodRecipeDao recipesDAO = null;
    
    @javax.inject.Inject
    public LocalDataSource(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.dao.FoodRecipeDao recipesDAO) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shahin.androidflow.models.ResultListing>> readRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity>> readFavoriteRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertRecipes(@org.jetbrains.annotations.NotNull
    java.util.List<com.shahin.androidflow.models.ResultListing> recipesEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertFavoriteRecipes(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.entity.FavoritesEntity favoritesEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object isFavorite(int recipeId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.entity.FavoritesEntity favoritesEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteAllFavoriteRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}