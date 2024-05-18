package com.shahin.androidflow.viewmodel;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.*;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.shahin.androidflow.Utlis.DataStoreRepository;
import com.shahin.androidflow.Utlis.NetworkResult;
import com.shahin.androidflow.models.FoodRecipe;
import com.shahin.androidflow.models.ResultListing;
import com.shahin.androidflow.pagining.MainPagingSource;
import com.shahin.androidflow.repository.RecipesRepository;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020 J\u0006\u00100\u001a\u00020-J\u0011\u00101\u001a\u000202H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\'0&2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\'06H\u0002J\b\u00107\u001a\u00020\fH\u0002J\u000e\u00108\u001a\u00020-2\u0006\u0010/\u001a\u00020 J\u0016\u00109\u001a\u00020-2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fH\u0002J\u001b\u0010;\u001a\u0004\u0018\u00010\f2\u0006\u0010<\u001a\u00020=H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u0016\u0010?\u001a\u0002022\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fH\u0002J\u0010\u0010A\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010B\u001a\u000202R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001f0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "postRepository", "Lcom/shahin/androidflow/repository/RecipesRepository;", "foodRecipeDao", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "dataStoreRepository", "Lcom/shahin/androidflow/Utlis/DataStoreRepository;", "(Landroid/app/Application;Lcom/shahin/androidflow/repository/RecipesRepository;Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;Lcom/shahin/androidflow/Utlis/DataStoreRepository;)V", "backOnline", "", "getBackOnline", "()Z", "setBackOnline", "(Z)V", "getDataFromRoomWithOffset", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/shahin/androidflow/models/ResultListing;", "getGetDataFromRoomWithOffset", "()Lkotlinx/coroutines/flow/Flow;", "networkStatus", "getNetworkStatus", "setNetworkStatus", "readBackOnline", "Landroidx/lifecycle/LiveData;", "getReadBackOnline", "()Landroidx/lifecycle/LiveData;", "readFavoriteRecipes", "", "Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;", "getReadFavoriteRecipes", "readRecipes", "getReadRecipes", "recipesResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shahin/androidflow/Utlis/NetworkResult;", "Lcom/shahin/androidflow/models/FoodRecipe;", "getRecipesResponse", "()Landroidx/lifecycle/MutableLiveData;", "setRecipesResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "deleteAllFavoriteRecipes", "Lkotlinx/coroutines/Job;", "deleteFavoriteRecipe", "favoritesEntity", "getRecipes", "getRecipesSafeCall", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFoodRecipesResponse", "response", "Lretrofit2/Response;", "hasInternetConnection", "insertFavoriteRecipe", "insertRecipes", "recipesEntity", "isFavorite", "recipeId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offlineCacheRecipes", "foodRecipe", "saveBackOnline", "showNetworkStatus", "app_debug"})
public final class RecipesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.shahin.androidflow.repository.RecipesRepository postRepository = null;
    private final com.shahin.androidflow.roomDB.dao.FoodRecipeDao foodRecipeDao = null;
    private final com.shahin.androidflow.Utlis.DataStoreRepository dataStoreRepository = null;
    private boolean networkStatus = false;
    private boolean backOnline = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> readBackOnline = null;
    
    /**
     * Retrofit
     */
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.shahin.androidflow.Utlis.NetworkResult<com.shahin.androidflow.models.FoodRecipe>> recipesResponse;
    
    /**
     * Room Database
     */
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.shahin.androidflow.models.ResultListing>> readRecipes = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity>> readFavoriteRecipes = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.shahin.androidflow.models.ResultListing>> getDataFromRoomWithOffset = null;
    
    @javax.inject.Inject
    public RecipesViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.repository.RecipesRepository postRepository, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.dao.FoodRecipeDao foodRecipeDao, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.Utlis.DataStoreRepository dataStoreRepository) {
        super(null);
    }
    
    public final boolean getNetworkStatus() {
        return false;
    }
    
    public final void setNetworkStatus(boolean p0) {
    }
    
    public final boolean getBackOnline() {
        return false;
    }
    
    public final void setBackOnline(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getReadBackOnline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.shahin.androidflow.Utlis.NetworkResult<com.shahin.androidflow.models.FoodRecipe>> getRecipesResponse() {
        return null;
    }
    
    public final void setRecipesResponse(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.shahin.androidflow.Utlis.NetworkResult<com.shahin.androidflow.models.FoodRecipe>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getRecipes() {
        return null;
    }
    
    private final java.lang.Object getRecipesSafeCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.shahin.androidflow.models.ResultListing>> getReadRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity>> getReadFavoriteRecipes() {
        return null;
    }
    
    private final void offlineCacheRecipes(java.util.List<com.shahin.androidflow.models.ResultListing> foodRecipe) {
    }
    
    private final kotlinx.coroutines.Job insertRecipes(java.util.List<com.shahin.androidflow.models.ResultListing> recipesEntity) {
        return null;
    }
    
    private final com.shahin.androidflow.Utlis.NetworkResult<com.shahin.androidflow.models.FoodRecipe> handleFoodRecipesResponse(retrofit2.Response<com.shahin.androidflow.models.FoodRecipe> response) {
        return null;
    }
    
    private final boolean hasInternetConnection() {
        return false;
    }
    
    private final kotlinx.coroutines.Job saveBackOnline(boolean backOnline) {
        return null;
    }
    
    public final void showNetworkStatus() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteAllFavoriteRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.entity.FavoritesEntity favoritesEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object isFavorite(int recipeId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.entity.FavoritesEntity favoritesEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.shahin.androidflow.models.ResultListing>> getGetDataFromRoomWithOffset() {
        return null;
    }
}