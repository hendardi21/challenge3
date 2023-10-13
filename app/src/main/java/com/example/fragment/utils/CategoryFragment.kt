package com.example.fragment.utils

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.MainActivity
import com.example.fragment.R
import com.example.fragment.databinding.FragmentCategoryBinding
import com.example.fragment.movie.MovieAdapter
import com.example.fragment.movie.MovieConstant
import com.example.fragment.movie.MovieData

class CategoryFragment : Fragment() {
    companion object {
        const val EXTRA_CATEGORY = "extra_category"
    }

    private var categoryRecycler: RecyclerView? = null
    private var categoryAdapter = MovieAdapter() { categoryData: MovieData ->
        handleNavigateToMovieList(categoryData)
    }
    private lateinit var binding: FragmentCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryRecycler = binding.categoryRecycler

        // Set GridLayoutManager dengan 3 kolom
        val gridLayoutManager = GridLayoutManager(requireContext(), 3)
        categoryRecycler?.layoutManager = gridLayoutManager

        categoryRecycler?.adapter = this.categoryAdapter

        this.categoryAdapter.submitList(MovieConstant.getCategoryData())
    }

    private fun handleNavigateToMovieList(categoryData: MovieData) {
        val bundle = Bundle()
        bundle.putSerializable(EXTRA_CATEGORY, categoryData)
        findNavController().navigate(R.id.action_categoryFragment_to_movieFragment, bundle)

//        val intent = Intent(this, MovieListActivity::class.java)
//        intent.putExtra(MainActivity.EXTRA_CATEGORY, categoryData)
//        startActivity(intent)
    }
}