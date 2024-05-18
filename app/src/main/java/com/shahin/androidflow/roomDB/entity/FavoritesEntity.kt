package com.shahin.androidflow.roomDB.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters

import com.google.gson.annotations.SerializedName


@Entity(tableName = "favorite_recipes_table")
class FavoritesEntity
    (
    @PrimaryKey(autoGenerate = true)
    var AUTOid: Int = 0,
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int,
    @SerializedName("cheap")
    val cheap: Boolean,
    @SerializedName("dairyFree")
    val dairyFree: Boolean,
    @SerializedName("glutenFree")
    val glutenFree: Boolean,
    @SerializedName("id")
    var recipeId: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("readyInMinutes")
    val readyInMinutes: Int,
    @SerializedName("sourceName")
    val sourceName: String?,
    @SerializedName("sourceUrl")
    val sourceUrl: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("vegan")
    val vegan: Boolean,
    @SerializedName("vegetarian")
    val vegetarian: Boolean,
    @SerializedName("veryHealthy")
    val veryHealthy: Boolean,
)