package com.shahin.androidflow.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.shahin.androidflow.R;
import com.shahin.androidflow.Utlis.RecipesDiffUtil;
import com.shahin.androidflow.databinding.RecipesRowLayoutBinding;
import com.shahin.androidflow.models.ResultListing;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;
import com.shahin.androidflow.viewmodel.RecipesViewModel;
import org.jsoup.Jsoup;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J$\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/shahin/androidflow/adapter/RecipesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shahin/androidflow/adapter/RecipesAdapter$MyViewHolder;", "()V", "favoriteDao", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "mainViewModel", "Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "mcontext", "Landroid/content/Context;", "recipeSaved", "", "recipes", "", "Lcom/shahin/androidflow/models/ResultListing;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "foodRecipe", "recipesViewModel", "foodRecipeDao", "MyViewHolder", "app_debug"})
public final class RecipesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shahin.androidflow.adapter.RecipesAdapter.MyViewHolder> {
    private java.util.List<com.shahin.androidflow.models.ResultListing> recipes;
    private com.shahin.androidflow.viewmodel.RecipesViewModel mainViewModel;
    private android.content.Context mcontext;
    private boolean recipeSaved = false;
    private com.shahin.androidflow.roomDB.dao.FoodRecipeDao favoriteDao;
    
    public RecipesAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.shahin.androidflow.adapter.RecipesAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.adapter.RecipesAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.shahin.androidflow.models.ResultListing> foodRecipe, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.viewmodel.RecipesViewModel recipesViewModel, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.dao.FoodRecipeDao foodRecipeDao) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/shahin/androidflow/adapter/RecipesAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/shahin/androidflow/databinding/RecipesRowLayoutBinding;", "(Lcom/shahin/androidflow/databinding/RecipesRowLayoutBinding;)V", "applyVeganColor", "", "view", "Landroid/view/View;", "vegan", "", "bind", "result", "Lcom/shahin/androidflow/models/ResultListing;", "mainViewModel", "Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "holder", "favoriteDao", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "parseHtml", "textView", "Landroid/widget/TextView;", "description", "", "showSnackBar", "message", "Companion", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.shahin.androidflow.databinding.RecipesRowLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.shahin.androidflow.adapter.RecipesAdapter.MyViewHolder.Companion Companion = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.shahin.androidflow.databinding.RecipesRowLayoutBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.shahin.androidflow.models.ResultListing result, @org.jetbrains.annotations.NotNull
        com.shahin.androidflow.viewmodel.RecipesViewModel mainViewModel, @org.jetbrains.annotations.NotNull
        com.shahin.androidflow.adapter.RecipesAdapter.MyViewHolder holder, @org.jetbrains.annotations.Nullable
        com.shahin.androidflow.roomDB.dao.FoodRecipeDao favoriteDao) {
        }
        
        private final void showSnackBar(java.lang.String message) {
        }
        
        private final void parseHtml(android.widget.TextView textView, java.lang.String description) {
        }
        
        private final void applyVeganColor(android.view.View view, boolean vegan) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/shahin/androidflow/adapter/RecipesAdapter$MyViewHolder$Companion;", "", "()V", "from", "Lcom/shahin/androidflow/adapter/RecipesAdapter$MyViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.shahin.androidflow.adapter.RecipesAdapter.MyViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}