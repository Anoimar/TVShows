package com.thernat.tvshows.utils

import com.thernat.tvshows.api.ShowsService
import com.thernat.tvshows.data.repository.ShowRepository
import com.thernat.tvshows.viewmodel.ShowViewModelFactory

object InjectorUtils {

    fun provideShowsViewModelFactory(): ShowViewModelFactory {
        return ShowViewModelFactory(ShowRepository(ShowsService.create()))
    }
}