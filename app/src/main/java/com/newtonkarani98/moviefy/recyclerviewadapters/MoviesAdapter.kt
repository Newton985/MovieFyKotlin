package com.newtonkarani98.moviefy.recyclerviewadapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.newtonkarani98.moviefy.R
import com.newtonkarani98.moviefy.databinding.MovieItemBinding
import com.newtonkarani98.moviefy.models.Movie

class MoviesAdapter : RecyclerView.Adapter<MoviesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
       val movieItemBinding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false);
        return MoviesViewHolder(movieItemBinding);
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
       holder.bind(Movie());
    }

    override fun getItemCount(): Int {
        return 10;
    }
}