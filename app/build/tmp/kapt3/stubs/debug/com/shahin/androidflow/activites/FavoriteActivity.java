package com.shahin.androidflow.activites;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.shahin.androidflow.adapter.FavoriteRecipesAdapter;
import com.shahin.androidflow.databinding.ActivityFavoriteBinding;
import com.shahin.androidflow.roomDB.database.FoodDatabase;
import com.shahin.androidflow.viewmodel.FavViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006$"}, d2 = {"Lcom/shahin/androidflow/activites/FavoriteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/shahin/androidflow/databinding/ActivityFavoriteBinding;", "getBinding", "()Lcom/shahin/androidflow/databinding/ActivityFavoriteBinding;", "setBinding", "(Lcom/shahin/androidflow/databinding/ActivityFavoriteBinding;)V", "db", "Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "getDb", "()Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "setDb", "(Lcom/shahin/androidflow/roomDB/database/FoodDatabase;)V", "favViewModel", "Lcom/shahin/androidflow/viewmodel/FavViewModel;", "getFavViewModel", "()Lcom/shahin/androidflow/viewmodel/FavViewModel;", "favViewModel$delegate", "Lkotlin/Lazy;", "postAdapter", "Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "goneProgress", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUi", "showProgress", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FavoriteActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.shahin.androidflow.databinding.ActivityFavoriteBinding binding;
    private com.shahin.androidflow.adapter.FavoriteRecipesAdapter postAdapter;
    private final kotlin.Lazy favViewModel$delegate = null;
    public android.widget.ProgressBar progressBar;
    @javax.inject.Inject
    public com.shahin.androidflow.roomDB.database.FoodDatabase db;
    
    public FavoriteActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.databinding.ActivityFavoriteBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.databinding.ActivityFavoriteBinding p0) {
    }
    
    private final com.shahin.androidflow.viewmodel.FavViewModel getFavViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.roomDB.database.FoodDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.database.FoodDatabase p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUi() {
    }
    
    private final void showProgress() {
    }
    
    private final void goneProgress() {
    }
}