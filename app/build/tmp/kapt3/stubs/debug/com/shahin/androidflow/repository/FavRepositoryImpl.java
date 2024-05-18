package com.shahin.androidflow.repository;

import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/shahin/androidflow/repository/FavRepositoryImpl;", "Lcom/shahin/androidflow/repository/FavRepository;", "foodRecipeDao", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "(Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;)V", "getFavouriteFromRoom", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;", "app_debug"})
public final class FavRepositoryImpl implements com.shahin.androidflow.repository.FavRepository {
    private final com.shahin.androidflow.roomDB.dao.FoodRecipeDao foodRecipeDao = null;
    
    @javax.inject.Inject
    public FavRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.dao.FoodRecipeDao foodRecipeDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity>> getFavouriteFromRoom() {
        return null;
    }
}