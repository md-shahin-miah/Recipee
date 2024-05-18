package com.shahin.androidflow.Utlis;

import androidx.recyclerview.widget.DiffUtil;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/shahin/androidflow/Utlis/RecipesDiffUtil;", "T", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_debug"})
public final class RecipesDiffUtil<T extends java.lang.Object> extends androidx.recyclerview.widget.DiffUtil.Callback {
    private final java.util.List<T> oldList = null;
    private final java.util.List<T> newList = null;
    
    public RecipesDiffUtil(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> oldList, @org.jetbrains.annotations.NotNull
    java.util.List<? extends T> newList) {
        super();
    }
    
    @java.lang.Override
    public int getOldListSize() {
        return 0;
    }
    
    @java.lang.Override
    public int getNewListSize() {
        return 0;
    }
    
    @java.lang.Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @java.lang.Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
}