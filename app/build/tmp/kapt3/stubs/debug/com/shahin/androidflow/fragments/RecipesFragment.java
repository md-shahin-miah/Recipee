package com.shahin.androidflow.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.shahin.androidflow.R;
import com.shahin.androidflow.Utlis.NetworkListener;
import com.shahin.androidflow.Utlis.NetworkResult;
import com.shahin.androidflow.adapter.RecipesAdapter;
import com.shahin.androidflow.databinding.FragmentRecipesBinding;
import com.shahin.androidflow.roomDB.database.FoodDatabase;
import com.shahin.androidflow.viewmodel.RecipesViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010\'\u001a\u00020\u001aH\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/shahin/androidflow/fragments/RecipesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/shahin/androidflow/databinding/FragmentRecipesBinding;", "binding", "getBinding", "()Lcom/shahin/androidflow/databinding/FragmentRecipesBinding;", "db", "Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "getDb", "()Lcom/shahin/androidflow/roomDB/database/FoodDatabase;", "setDb", "(Lcom/shahin/androidflow/roomDB/database/FoodDatabase;)V", "mAdapter", "Lcom/shahin/androidflow/adapter/RecipesAdapter;", "getMAdapter", "()Lcom/shahin/androidflow/adapter/RecipesAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "networkListener", "Lcom/shahin/androidflow/Utlis/NetworkListener;", "getNetworkListener$annotations", "recipesViewModel", "Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "hideShimmerEffect", "", "loadDataFromCache", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "readDatabase", "requestApiData", "setUpRecyclerView", "showShimmerEffect", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class RecipesFragment extends androidx.fragment.app.Fragment {
    private com.shahin.androidflow.databinding.FragmentRecipesBinding _binding;
    private com.shahin.androidflow.viewmodel.RecipesViewModel recipesViewModel;
    private final kotlin.Lazy mAdapter$delegate = null;
    private com.shahin.androidflow.Utlis.NetworkListener networkListener;
    @javax.inject.Inject
    public com.shahin.androidflow.roomDB.database.FoodDatabase db;
    
    public RecipesFragment() {
        super();
    }
    
    private final com.shahin.androidflow.databinding.FragmentRecipesBinding getBinding() {
        return null;
    }
    
    private final com.shahin.androidflow.adapter.RecipesAdapter getMAdapter() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated
    private static void getNetworkListener$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.roomDB.database.FoodDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.database.FoodDatabase p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void readDatabase() {
    }
    
    private final void requestApiData() {
    }
    
    private final void loadDataFromCache() {
    }
    
    private final void showShimmerEffect() {
    }
    
    private final void hideShimmerEffect() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}