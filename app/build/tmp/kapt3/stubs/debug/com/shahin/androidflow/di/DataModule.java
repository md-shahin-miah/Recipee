package com.shahin.androidflow.di;

import android.content.Context;
import androidx.room.Room;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.database.FoodDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/shahin/androidflow/di/DataModule;", "", "()V", "providePostDAO", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "foodDb", "Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "providePostDb", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class DataModule {
    @org.jetbrains.annotations.NotNull
    public static final com.shahin.androidflow.di.DataModule INSTANCE = null;
    
    private DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.shahin.androidflow.roomDB.database.FoodDatabase providePostDb(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.shahin.androidflow.roomDB.dao.FoodRecipeDao providePostDAO(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.database.FoodDatabase foodDb) {
        return null;
    }
}