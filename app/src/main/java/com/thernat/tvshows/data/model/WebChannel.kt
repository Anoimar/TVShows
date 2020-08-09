package com.thernat.tvshows.data.model


import com.google.gson.annotations.SerializedName
import com.thernat.tvshows.data.model.Country

data class WebChannel(
    @SerializedName("country")
    val country: Country,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)