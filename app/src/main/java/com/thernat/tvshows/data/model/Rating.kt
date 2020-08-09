package com.thernat.tvshows.data.model


import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("average")
    val average: Any
)