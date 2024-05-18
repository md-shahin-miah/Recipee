package com.shahin.androidflow.models;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlinx.parcelize.Parcelize;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u001dH\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/shahin/androidflow/models/ExtendedIngredient;", "Landroid/os/Parcelable;", "amount", "", "consistency", "", "image", "name", "original", "unit", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getConsistency", "()Ljava/lang/String;", "getImage", "getName", "getOriginal", "getUnit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shahin/androidflow/models/ExtendedIngredient;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ExtendedIngredient implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "amount")
    private final java.lang.Double amount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "consistency")
    private final java.lang.String consistency = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "image")
    private final java.lang.String image = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "original")
    private final java.lang.String original = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "unit")
    private final java.lang.String unit = null;
    public static final android.os.Parcelable.Creator<com.shahin.androidflow.models.ExtendedIngredient> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.shahin.androidflow.models.ExtendedIngredient copy(@org.jetbrains.annotations.Nullable
    java.lang.Double amount, @org.jetbrains.annotations.Nullable
    java.lang.String consistency, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String original, @org.jetbrains.annotations.Nullable
    java.lang.String unit) {
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
    
    public ExtendedIngredient(@org.jetbrains.annotations.Nullable
    java.lang.Double amount, @org.jetbrains.annotations.Nullable
    java.lang.String consistency, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String original, @org.jetbrains.annotations.Nullable
    java.lang.String unit) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getConsistency() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUnit() {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.shahin.androidflow.models.ExtendedIngredient> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.shahin.androidflow.models.ExtendedIngredient createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.shahin.androidflow.models.ExtendedIngredient[] newArray(int size) {
            return null;
        }
    }
}