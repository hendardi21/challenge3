package com.example.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.movie.MovieConstant
import com.example.fragment.movie.MovieData
import com.example.fragment.movie.MovieAdapter
import com.example.fragment.utils.MovieListActivity

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_CATEGORY = "extra_category"
    }

    private var categoryRecycler: RecyclerView? = null
    private var categoryAdapter = MovieAdapter() { categoryData: MovieData ->
        handleNavigateToMovieList(categoryData)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryRecycler = findViewById<RecyclerView>(R.id.category_recycler)

        // Set GridLayoutManager dengan 3 kolom
        val gridLayoutManager = GridLayoutManager(this, 3)
        categoryRecycler?.layoutManager = gridLayoutManager

        categoryRecycler?.adapter = this.categoryAdapter

        this.categoryAdapter.submitList(MovieConstant.getCategoryData())
    }

    private fun handleNavigateToMovieList(categoryData: MovieData) {
        val intent = Intent(this, MovieListActivity::class.java)
        intent.putExtra(EXTRA_CATEGORY, categoryData)
        startActivity(intent)
    }
}
