package com.shahin.androidflow.Utlis;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.*;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;
import javax.inject.Inject;

@dagger.hilt.android.scopes.ActivityRetainedScoped
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/shahin/androidflow/Utlis/DataStoreRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "readBackOnline", "Lkotlinx/coroutines/flow/Flow;", "", "getReadBackOnline", "()Lkotlinx/coroutines/flow/Flow;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "saveBackOnline", "", "backOnline", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreferenceKeys", "app_debug"})
public final class DataStoreRepository {
    private final android.content.Context context = null;
    private final kotlin.properties.ReadOnlyProperty dataStore$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> readBackOnline = null;
    
    @javax.inject.Inject
    public DataStoreRepository(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context $this$dataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveBackOnline(boolean backOnline, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getReadBackOnline() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/shahin/androidflow/Utlis/DataStoreRepository$PreferenceKeys;", "", "()V", "backOnline", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getBackOnline", "()Landroidx/datastore/preferences/core/Preferences$Key;", "app_debug"})
    static final class PreferenceKeys {
        @org.jetbrains.annotations.NotNull
        public static final com.shahin.androidflow.Utlis.DataStoreRepository.PreferenceKeys INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> backOnline = null;
        
        private PreferenceKeys() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getBackOnline() {
            return null;
        }
    }
}