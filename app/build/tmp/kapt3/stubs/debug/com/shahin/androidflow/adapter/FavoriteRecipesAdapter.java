package com.shahin.androidflow.adapter;

import android.content.Context;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.shahin.androidflow.R;
import com.shahin.androidflow.Utlis.RecipesDiffUtil;
import com.shahin.androidflow.databinding.FavoriteRecipeRowLayoutBinding;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import com.shahin.androidflow.roomDB.entity.FavoritesEntity;
import com.shahin.androidflow.viewmodel.RecipesViewModel;
import org.jsoup.Jsoup;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001:B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J \u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0002J\u0006\u0010\"\u001a\u00020\u0018J\b\u0010#\u001a\u00020\u001eH\u0016J\u001c\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001eH\u0016J\u001c\u0010*\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010+H\u0016J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001eH\u0016J\u0012\u00100\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u00101\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010+H\u0016J\u0018\u00102\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J\u001c\u00103\u001a\u00020\u00182\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u000209H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter$MyViewHolder;", "Landroid/view/ActionMode$Callback;", "requireActivity", "Landroidx/fragment/app/FragmentActivity;", "mainViewModel", "Lcom/shahin/androidflow/viewmodel/RecipesViewModel;", "(Landroidx/fragment/app/FragmentActivity;Lcom/shahin/androidflow/viewmodel/RecipesViewModel;)V", "context", "Landroid/content/Context;", "favoriteRecipes", "", "Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;", "mActionMode", "Landroid/view/ActionMode;", "multiSelection", "", "myViewHolders", "Ljava/util/ArrayList;", "rootView", "Landroid/view/View;", "selectedRecipes", "applyActionModeTitle", "", "applySelection", "holder", "currentRecipe", "applyStatusBarColor", "color", "", "changeRecipeStyle", "backgroundColor", "strokeColor", "clearContextualActionMode", "getItemCount", "onActionItemClicked", "actionMode", "menu", "Landroid/view/MenuItem;", "onBindViewHolder", "position", "onCreateActionMode", "Landroid/view/Menu;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDestroyActionMode", "onPrepareActionMode", "saveItemStateOnScroll", "setData", "newFavoriteRecipes", "db", "Lcom/shahin/androidflow/roomDB/dao/FoodRecipeDao;", "showSnackBar", "message", "", "MyViewHolder", "app_debug"})
public final class FavoriteRecipesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder> implements android.view.ActionMode.Callback {
    private final androidx.fragment.app.FragmentActivity requireActivity = null;
    private final com.shahin.androidflow.viewmodel.RecipesViewModel mainViewModel = null;
    private boolean multiSelection = false;
    private android.view.ActionMode mActionMode;
    private android.view.View rootView;
    private java.util.ArrayList<com.shahin.androidflow.roomDB.entity.FavoritesEntity> selectedRecipes;
    private java.util.ArrayList<com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder> myViewHolders;
    private java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity> favoriteRecipes;
    private android.content.Context context;
    
    public FavoriteRecipesAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity requireActivity, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.viewmodel.RecipesViewModel mainViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    private final void saveItemStateOnScroll(com.shahin.androidflow.roomDB.entity.FavoritesEntity currentRecipe, com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder holder) {
    }
    
    private final void applySelection(com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder holder, com.shahin.androidflow.roomDB.entity.FavoritesEntity currentRecipe) {
    }
    
    private final void changeRecipeStyle(com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder holder, int backgroundColor, int strokeColor) {
    }
    
    private final void applyActionModeTitle() {
    }
    
    @java.lang.Override
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable
    android.view.ActionMode actionMode, @org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onPrepareActionMode(@org.jetbrains.annotations.Nullable
    android.view.ActionMode actionMode, @org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable
    android.view.ActionMode actionMode, @org.jetbrains.annotations.Nullable
    android.view.MenuItem menu) {
        return false;
    }
    
    @java.lang.Override
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable
    android.view.ActionMode actionMode) {
    }
    
    private final void applyStatusBarColor(int color) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.shahin.androidflow.roomDB.entity.FavoritesEntity> newFavoriteRecipes, @org.jetbrains.annotations.NotNull
    com.shahin.androidflow.roomDB.dao.FoodRecipeDao db) {
    }
    
    private final void showSnackBar(java.lang.String message) {
    }
    
    public final void clearContextualActionMode() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/shahin/androidflow/databinding/FavoriteRecipeRowLayoutBinding;", "(Lcom/shahin/androidflow/databinding/FavoriteRecipeRowLayoutBinding;)V", "getBinding", "()Lcom/shahin/androidflow/databinding/FavoriteRecipeRowLayoutBinding;", "applyVeganColor", "", "view", "Landroid/view/View;", "vegan", "", "bind", "result", "Lcom/shahin/androidflow/roomDB/entity/FavoritesEntity;", "parseHtml", "textView", "Landroid/widget/TextView;", "description", "", "Companion", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.shahin.androidflow.databinding.FavoriteRecipeRowLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder.Companion Companion = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.shahin.androidflow.databinding.FavoriteRecipeRowLayoutBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.shahin.androidflow.databinding.FavoriteRecipeRowLayoutBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.shahin.androidflow.roomDB.entity.FavoritesEntity result) {
        }
        
        private final void applyVeganColor(android.view.View view, boolean vegan) {
        }
        
        private final void parseHtml(android.widget.TextView textView, java.lang.String description) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter$MyViewHolder$Companion;", "", "()V", "from", "Lcom/shahin/androidflow/adapter/FavoriteRecipesAdapter$MyViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.shahin.androidflow.adapter.FavoriteRecipesAdapter.MyViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}