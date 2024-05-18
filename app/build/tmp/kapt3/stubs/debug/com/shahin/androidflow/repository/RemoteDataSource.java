package com.shahin.androidflow.repository;

import android.util.Log;
import com.shahin.androidflow.models.FoodRecipe;
import com.shahin.androidflow.network.ApiService;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/shahin/androidflow/repository/RemoteDataSource;", "", "apiService", "Lcom/shahin/androidflow/network/ApiService;", "(Lcom/shahin/androidflow/network/ApiService;)V", "getRecipesFromServer", "Lretrofit2/Response;", "Lcom/shahin/androidflow/models/FoodRecipe;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataSource {
    private final com.shahin.androidflow.network.ApiService apiService = null;
    
    @javax.inject.Inject
    public RemoteDataSource(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRecipesFromServer(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.shahin.androidflow.models.FoodRecipe>> continuation) {
        return null;
    }
}