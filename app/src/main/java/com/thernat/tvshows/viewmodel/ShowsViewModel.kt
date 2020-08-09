package com.thernat.tvshows.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.thernat.tvshows.data.model.Show
import com.thernat.tvshows.data.repository.ShowRepository

class ShowsViewModel internal constructor(
    repository: ShowRepository
) : ViewModel() {
    val shows: LiveData<List<Show>> =
        repository.getStartingMovies().asLiveData()

}