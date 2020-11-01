package com.thernat.tvshows.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thernat.tvshows.data.model.Show
import com.thernat.tvshows.databinding.ListItemShowBinding

class ShowsAdapter(private var shows: List<Show>) :
    RecyclerView.Adapter<ShowsAdapter.ShowViewHolder>() {

    override fun getItemCount() = shows.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemShowBinding.inflate(inflater)
        return ShowViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) =
        holder.bind(shows[position])

    class ShowViewHolder(
        private val binding: ListItemShowBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(show: Show) {
            binding.apply {
                this.show = show
                executePendingBindings()
            }
        }
    }

    fun refreshData(shows: List<Show>) {
        this.shows = shows
        notifyDataSetChanged()
    }

}