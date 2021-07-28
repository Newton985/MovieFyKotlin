package com.newtonkarani98.moviefy.ui.home

import android.icu.lang.UCharacter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.newtonkarani98.moviefy.databinding.FragmentHomeBinding
import com.newtonkarani98.moviefy.recyclerviewadapters.MoviesAdapter

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val moviesAdapter = MoviesAdapter()

        binding.moviesRecyclerView.adapter = moviesAdapter;
        binding.moviesRecyclerView.itemAnimator = DefaultItemAnimator();
        binding.moviesRecyclerView.layoutManager = GridLayoutManager(binding.root.context,2);

        for (i in 1..11){
            moviesAdapter.notifyDataSetChanged();
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}