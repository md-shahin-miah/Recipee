package com.shahin.androidflow.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.shahin.androidflow.R;
import com.shahin.androidflow.adapter.FavoriteRecipesAdapter;
import com.shahin.androidflow.databinding.FragmentFavoriteRecipesBinding;
import com.shahin.androidflow.roomDB.database.FoodDatabase;
import com.shahin.androidflow.viewmodel.RecipesViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/shahin/androidflow/fragments/FavoriteRecipesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/shahin/androidflow/databinding/FragmentFavoriteRecipesBinding;", "binding", "getBinding", "()Lcom/shahin/androidflow/databinding/FragmentFavoriteRecipesBinding;", "db", "Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "getDb", "()Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "setDb", "(Lcom/shahin/androidflow/roomDB/database/FoodDatabase;)V", "mAdapter", "Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter;", "getMAdapter", "()Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mainViewModel", "Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "getMainViewModel", "()Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "mainViewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "readDatabase", "setUpRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FavoriteRecipesFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private com.shahin.androidflow.databinding.FragmentFavoriteRecipesBinding _binding;
    @javax.inject.Inject
    public com.shahin.androidflow.roomDB.database.FoodDatabase db;
    
    public FavoriteRecipesFragment() {
        super();
    }
    
    private final com.shahin.androidflow.viewmodel.RecipesViewModel getMainViewModel() {
        return null;
    }
    
    private final com.shahin.androidflow.adapter.FavoriteRecipesAdapter getMAdapter() {
        return null;
    }
    
    private final com.shahin.androidflow.databinding.FragmentFavoriteRecipesBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.roomDB.database.FoodDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.database.FoodDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void readDatabase() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}