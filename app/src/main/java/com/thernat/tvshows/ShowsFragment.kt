package com.thernat.tvshows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.thernat.tvshows.adapter.ShowsAdapter
import com.thernat.tvshows.databinding.FragmentShowsListBinding
import com.thernat.tvshows.utils.InjectorUtils
import com.thernat.tvshows.viewmodel.ShowsViewModel

class ShowsFragment: Fragment() {

    private val viewModel: ShowsViewModel by viewModels{
        InjectorUtils.provideShowsViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentShowsListBinding.inflate(inflater,container, false).apply {
            rvShows.adapter = ShowsAdapter(arrayListOf()).also {
                subscribeForUpdates(it)
            }
        }
        return binding.root
    }

    private fun subscribeForUpdates(adapter: ShowsAdapter) {
        viewModel.shows.observe(viewLifecycleOwner) {
            shows -> adapter.refreshData(shows)
        }
    }
}