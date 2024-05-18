package com.shahin.androidflow.activites;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.shahin.androidflow.R;
import com.shahin.androidflow.adapter.RecipesAdapter;
import com.shahin.androidflow.databinding.ActivityMainBinding;
import com.shahin.androidflow.roomDB.database.FoodDatabase;
import com.shahin.androidflow.viewmodel.RecipesViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0004J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001aH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/shahin/androidflow/activites/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/shahin/androidflow/databinding/ActivityMainBinding;", "getBinding", "()Lcom/shahin/androidflow/databinding/ActivityMainBinding;", "setBinding", "(Lcom/shahin/androidflow/databinding/ActivityMainBinding;)V", "db", "Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "getDb", "()Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "setDb", "(Lcom/shahin/androidflow/roomDB/database/FoodDatabase;)V", "postAdapter", "Lcom/shahin/androidflow/adapter/RecipesAdapter;", "postViewModel", "Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "getPostViewModel", "()Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "postViewModel$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "appExit", "", "exitByBackKey", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.shahin.androidflow.adapter.RecipesAdapter postAdapter;
    private final kotlin.Lazy postViewModel$delegate = null;
    public com.shahin.androidflow.databinding.ActivityMainBinding binding;
    @javax.inject.Inject
    public com.shahin.androidflow.roomDB.database.FoodDatabase db;
    
    public MainActivity() {
        super();
    }
    
    private final com.shahin.androidflow.viewmodel.RecipesViewModel getPostViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.databinding.ActivityMainBinding p0) {
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
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    public final void appExit() {
    }
    
    protected final void exitByBackKey() {
    }
}