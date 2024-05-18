package com.shahin.androidflow.Utlis;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/shahin/androidflow/Utlis/NetworkListener;", "Landroid/net/ConnectivityManager$NetworkCallback;", "()V", "isNetworkAvailable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "checkNetworkAvailability", "context", "Landroid/content/Context;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "app_debug"})
public final class NetworkListener extends android.net.ConnectivityManager.NetworkCallback {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isNetworkAvailable = null;
    
    public NetworkListener() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> checkNetworkAvailability(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    public void onAvailable(@org.jetbrains.annotations.NotNull
    android.net.Network network) {
    }
    
    @java.lang.Override
    public void onLost(@org.jetbrains.annotations.NotNull
    android.net.Network network) {
    }
}