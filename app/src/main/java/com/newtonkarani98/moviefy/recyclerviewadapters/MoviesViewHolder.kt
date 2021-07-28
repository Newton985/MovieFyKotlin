package com.newtonkarani98.moviefy.recyclerviewadapters

import androidx.recyclerview.widget.RecyclerView
import com.newtonkarani98.moviefy.databinding.MovieItemBinding
import com.newtonkarani98.moviefy.models.Movie

class MoviesViewHolder(movieItemBinding: MovieItemBinding) : RecyclerView.ViewHolder(movieItemBinding.root) {
      private val  mMovieItemBinding = movieItemBinding;
    public  fun bind(movie: Movie){
        mMovieItemBinding.movieCard.setOnClickListener{

        }
    }

}