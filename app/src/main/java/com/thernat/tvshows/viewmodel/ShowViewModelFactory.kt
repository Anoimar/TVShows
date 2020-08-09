package com.thernat.tvshows.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.thernat.tvshows.data.repository.ShowRepository

class ShowViewModelFactory(
    private val repository: ShowRepository
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShowsViewModel(repository) as T
    }
}