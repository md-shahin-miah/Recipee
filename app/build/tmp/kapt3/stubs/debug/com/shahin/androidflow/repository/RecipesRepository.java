package com.shahin.androidflow.repository;

import android.util.Log;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;
import javax.inject.Inject;

@dagger.hilt.android.scopes.ActivityRetainedScoped
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/shahin/androidflow/repository/RecipesRepository;", "", "remoteDataSource", "Lcom/shahin/androidflow/repository/RemoteDataSource;", "localDataSource", "Lcom/shahin/androidflow/repository/LocalDataSource;", "(Lcom/shahin/androidflow/repository/RemoteDataSource;Lcom/shahin/androidflow/repository/LocalDataSource;)V", "local", "getLocal", "()Lcom/shahin/androidflow/repository/LocalDataSource;", "remote", "getRemote", "()Lcom/shahin/androidflow/repository/RemoteDataSource;", "app_debug"})
public final class RecipesRepository {
    @org.jetbrains.annotations.NotNull
    private final com.shahin.androidflow.repository.RemoteDataSource remote = null;
    @org.jetbrains.annotations.NotNull
    private final com.shahin.androidflow.repository.LocalDataSource local = null;
    
    @javax.inject.Inject
    public RecipesRepository(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.repository.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.repository.LocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.repository.RemoteDataSource getRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.repository.LocalDataSource getLocal() {
        return null;
    }
}