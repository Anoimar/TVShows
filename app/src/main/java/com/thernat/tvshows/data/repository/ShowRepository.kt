package com.thernat.tvshows.data.repository

import com.thernat.tvshows.api.ShowsService
import com.thernat.tvshows.data.model.Show
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class ShowRepository(private val api: ShowsService) {

    fun getStartingMovies(): Flow<List<Show>> {
        return flow {
            api.searchMovies(START_QUERY)
                .map {
                    it.show
                }.apply {
                    emit(this)
                }
        }.flowOn(Dispatchers.IO)
    }

    companion object {
        private const val START_QUERY = "Star Trek"
    }
}