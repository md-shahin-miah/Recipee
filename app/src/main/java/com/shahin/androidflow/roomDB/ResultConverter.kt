package com.shahin.androidflow.roomDB

import android.util.Log
import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.shahin.androidflow.models.ResultListing
import java.lang.reflect.Type
import java.util.Collections

@ProvidedTypeConverter
class ResultConverter {
    @TypeConverter
    fun toDetailList(value: String): ResultListing {
        Log.d("DBINFO_FROMJSON", "Extracted>>${value}") /* just for demonstration */
        return Gson().fromJson(value, ResultListing::class.java)
    }

    @TypeConverter
    fun fromDetailList(value: ResultListing): String {
        return Gson().toJson(value)
    }
}