package com.thernat.tvshows.api

import com.thernat.tvshows.data.model.SearchShowResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ShowsService {

    @GET("search/shows")
    suspend fun searchMovies(
        @Query("q") query: String
    ): SearchShowResponse

    companion object {
        private const val BASE_URL = "http://api.tvmaze.com/"

        fun create(): ShowsService {
            val logger = HttpLoggingInterceptor().apply { level =  HttpLoggingInterceptor.Level.BODY}

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(
                    OkHttpClient.Builder()
                        .addInterceptor(logger)
                        .build()
                )
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ShowsService::class.java)
        }
    }
}