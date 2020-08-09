package com.thernat.tvshows.data.model


import com.google.gson.annotations.SerializedName

data class SearchShowResponseItem(
    @SerializedName("score")
    val score: Double,
    @SerializedName("show")
    val show: Show
)