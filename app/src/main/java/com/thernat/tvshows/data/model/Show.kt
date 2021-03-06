package com.thernat.tvshows.data.model


import com.google.gson.annotations.SerializedName

data class Show(
    @SerializedName("externals")
    val externals: Externals,
    @SerializedName("genres")
    val genres: List<String>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: Image,
    @SerializedName("language")
    val language: String,
    @SerializedName("_links")
    val links: Links,
    @SerializedName("name")
    val name: String,
    @SerializedName("network")
    val network: Any,
    @SerializedName("officialSite")
    val officialSite: Any,
    @SerializedName("premiered")
    val premiered: Any,
    @SerializedName("rating")
    val rating: Rating,
    @SerializedName("runtime")
    val runtime: Any,
    @SerializedName("schedule")
    val schedule: Schedule,
    @SerializedName("status")
    val status: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("updated")
    val updated: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("webChannel")
    val webChannel: WebChannel,
    @SerializedName("weight")
    val weight: Int
)