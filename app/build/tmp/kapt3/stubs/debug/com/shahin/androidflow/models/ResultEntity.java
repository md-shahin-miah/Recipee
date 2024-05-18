package com.shahin.androidflow.models;

import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import kotlinx.parcelize.Parcelize;
import kotlinx.parcelize.RawValue;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0014J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\u000bH\u00c6\u0003J\t\u00100\u001a\u00020\u000bH\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00106\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00107\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u00b0\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001J\t\u0010A\u001a\u00020\u000bH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010*\u00a8\u0006B"}, d2 = {"Lcom/shahin/androidflow/models/ResultEntity;", "", "AUTOid", "", "aggregateLikes", "cheap", "", "dairyFree", "glutenFree", "recipeId", "image", "", "readyInMinutes", "sourceName", "sourceUrl", "summary", "title", "vegan", "vegetarian", "veryHealthy", "(ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getAUTOid", "()I", "setAUTOid", "(I)V", "getAggregateLikes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCheap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDairyFree", "getGlutenFree", "getImage", "()Ljava/lang/String;", "getReadyInMinutes", "getRecipeId", "getSourceName", "getSourceUrl", "getSummary", "getTitle", "getVegan", "()Z", "getVegetarian", "getVeryHealthy", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/shahin/androidflow/models/ResultEntity;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ResultEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int AUTOid;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "aggregateLikes")
    private final java.lang.Integer aggregateLikes = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "cheap")
    private final java.lang.Boolean cheap = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "dairyFree")
    private final java.lang.Boolean dairyFree = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "glutenFree")
    private final java.lang.Boolean glutenFree = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer recipeId = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "image")
    private final java.lang.String image = null;
    @com.google.gson.annotations.SerializedName(value = "readyInMinutes")
    private final int readyInMinutes = 0;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "sourceName")
    private final java.lang.String sourceName = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "sourceUrl")
    private final java.lang.String sourceUrl = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "summary")
    private final java.lang.String summary = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @com.google.gson.annotations.SerializedName(value = "vegan")
    private final boolean vegan = false;
    @com.google.gson.annotations.SerializedName(value = "vegetarian")
    private final boolean vegetarian = false;
    @com.google.gson.annotations.SerializedName(value = "veryHealthy")
    private final boolean veryHealthy = false;
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.models.ResultEntity copy(int AUTOid, @org.jetbrains.annotations.Nullable
    java.lang.Integer aggregateLikes, @org.jetbrains.annotations.Nullable
    java.lang.Boolean cheap, @org.jetbrains.annotations.Nullable
    java.lang.Boolean dairyFree, @org.jetbrains.annotations.Nullable
    java.lang.Boolean glutenFree, @org.jetbrains.annotations.Nullable
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull
    java.lang.String image, int readyInMinutes, @org.jetbrains.annotations.Nullable
    java.lang.String sourceName, @org.jetbrains.annotations.NotNull
    java.lang.String sourceUrl, @org.jetbrains.annotations.NotNull
    java.lang.String summary, @org.jetbrains.annotations.NotNull
    java.lang.String title, boolean vegan, boolean vegetarian, boolean veryHealthy) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ResultEntity(int AUTOid, @org.jetbrains.annotations.Nullable
    java.lang.Integer aggregateLikes, @org.jetbrains.annotations.Nullable
    java.lang.Boolean cheap, @org.jetbrains.annotations.Nullable
    java.lang.Boolean dairyFree, @org.jetbrains.annotations.Nullable
    java.lang.Boolean glutenFree, @org.jetbrains.annotations.Nullable
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull
    java.lang.String image, int readyInMinutes, @org.jetbrains.annotations.Nullable
    java.lang.String sourceName, @org.jetbrains.annotations.NotNull
    java.lang.String sourceUrl, @org.jetbrains.annotations.NotNull
    java.lang.String summary, @org.jetbrains.annotations.NotNull
    java.lang.String title, boolean vegan, boolean vegetarian, boolean veryHealthy) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getAUTOid() {
        return 0;
    }
    
    public final void setAUTOid(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAggregateLikes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getCheap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getDairyFree() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getGlutenFree() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRecipeId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImage() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getReadyInMinutes() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSourceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSourceUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getVegan() {
        return false;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getVegetarian() {
        return false;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getVeryHealthy() {
        return false;
    }
}