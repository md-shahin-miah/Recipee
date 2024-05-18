package com.shahin.androidflow.roomDB.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.shahin.androidflow.models.ResultEntity;
import com.shahin.androidflow.models.ResultListing;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;

@androidx.room.Database(entities = {com.shahin.androidflow.roomDB.entity.FavoritesEntity.class, com.shahin.androidflow.models.ResultListing.class, com.shahin.androidflow.models.ResultEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getFoodRecipeDao", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "app_debug"})
public abstract class FoodDatabase extends androidx.room.RoomDatabase {
    
    public FoodDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.shahin.androidflow.roomDB.dao.FoodRecipeDao getFoodRecipeDao();
}