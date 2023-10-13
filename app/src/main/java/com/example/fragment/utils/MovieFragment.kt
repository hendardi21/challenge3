package com.example.fragment.utils

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.MainActivity
import com.example.fragment.R
import com.example.fragment.category.CategoryAdapter
import com.example.fragment.category.CategoryConstant
import com.example.fragment.category.CategoryData
import com.example.fragment.databinding.FragmentCategoryBinding
import com.example.fragment.databinding.FragmentMovieBinding
import com.example.fragment.movie.MovieData

class MovieFragment : Fragment() {
    private lateinit var binding: FragmentMovieBinding
    private var movieRecycler: RecyclerView? = null
    private var movieAdapter = CategoryAdapter { movieData: CategoryData ->
        handleNavigateToBrowser(movieData)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movieRecycler = binding.movieRecycler

        movieRecycler?.layoutManager = LinearLayoutManager(requireContext())
        movieRecycler?.adapter = this.movieAdapter

//        val category = intent?.getSerializableExtra(MainActivity.EXTRA_CATEGORY) as CategoryData

        val movieData = arguments?.getSerializable(CategoryFragment.EXTRA_CATEGORY) as MovieData
        this.movieAdapter.submitList(CategoryConstant().getMovieData().filter { it.categoryId == movieData.id })
    }

    private fun handleNavigateToBrowser(movieData: com.example.fragment.category.CategoryData) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Movie ${movieData.title}"))
        startActivity(intent)
    }
}