package com.shahin.androidflow.roomDB;

import android.util.Log;
import androidx.room.ProvidedTypeConverter;
import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.shahin.androidflow.models.ResultListing;
import java.lang.reflect.Type;
import java.util.Collections;

@androidx.room.ProvidedTypeConverter
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/shahin/androidflow/roomDB/ResultConverter;", "", "()V", "fromDetailList", "", "value", "Lcom/shahin/androidflow/models/ResultListing;", "toDetailList", "app_debug"})
public final class ResultConverter {
    
    public ResultConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final com.shahin.androidflow.models.ResultListing toDetailList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String fromDetailList(@org.jetbrains.annotations.NotNull
    com.shahin.androidflow.models.ResultListing value) {
        return null;
    }
}