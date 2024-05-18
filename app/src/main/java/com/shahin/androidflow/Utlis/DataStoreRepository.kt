package com.shahin.androidflow.Utlis



import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import com.shahin.androidflow.network.NetworkingConstants.PREFERENCES_BACK_ONLINE
import com.shahin.androidflow.network.NetworkingConstants.PREFERENCES_NAME

import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject


@ActivityRetainedScoped
class DataStoreRepository @Inject constructor(@ApplicationContext private val context: Context) {

    private object PreferenceKeys {
        val backOnline = booleanPreferencesKey(PREFERENCES_BACK_ONLINE)
    }

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
        name = PREFERENCES_NAME
    )


    suspend fun saveBackOnline(backOnline: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[PreferenceKeys.backOnline] = backOnline
        }
    }



    val readBackOnline: Flow<Boolean> = context.dataStore.data
        .catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }
        .map { preferences ->
            val backOnline = preferences[PreferenceKeys.backOnline] ?: false
            backOnline
        } as Flow<Boolean>
}

