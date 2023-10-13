package com.example.fragment.utils

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.MainActivity
import com.example.fragment.R
import com.example.fragment.category.CategoryData
import com.example.fragment.category.CategoryConstant
import com.example.fragment.category.CategoryAdapter
import com.example.fragment.movie.MovieData

class MovieListActivity : AppCompatActivity() {
    private var movieRecycler: RecyclerView? = null
    private var movieAdapter = CategoryAdapter { movieData: com.example.fragment.category.CategoryData ->
        handleNavigateToBrowser(movieData)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        movieRecycler = findViewById(R.id.movie_recycler)

        movieRecycler?.layoutManager = LinearLayoutManager(this)
        movieRecycler?.adapter = this.movieAdapter

//        val category = intent?.getSerializableExtra(MainActivity.EXTRA_CATEGORY) as CategoryData

        val movieData = intent?.getSerializableExtra(MainActivity.EXTRA_CATEGORY) as MovieData
        this.movieAdapter.submitList(CategoryConstant().getMovieData().filter { it.categoryId == movieData.id })
    }

    private fun handleNavigateToBrowser(movieData: com.example.fragment.category.CategoryData) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Movie ${movieData.title}"))
        startActivity(intent)
    }
}
