package com.shahin.androidflow.di;

import com.shahin.androidflow.network.ApiService;
import com.shahin.androidflow.network.NetworkingConstants;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\bH\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/shahin/androidflow/di/NetworkingModule;", "", "()V", "provideConverterFactory", "Lretrofit2/Converter$Factory;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideRestApiService", "Lcom/shahin/androidflow/network/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofitClient", "okHttpClient", "baseUrl", "", "converterFactory", "providesBaseUrl", "providesLoggingInterceptor", "app_debug"})
@dagger.Module
public final class NetworkingModule {
    @org.jetbrains.annotations.NotNull
    public static final com.shahin.androidflow.di.NetworkingModule INSTANCE = null;
    
    private NetworkingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final java.lang.String providesBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final okhttp3.logging.HttpLoggingInterceptor providesLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final retrofit2.Converter.Factory provideConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofitClient(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull
    retrofit2.Converter.Factory converterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.shahin.androidflow.network.ApiService provideRestApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}