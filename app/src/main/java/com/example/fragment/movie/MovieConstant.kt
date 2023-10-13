package com.example.fragment.movie

import com.example.fragment.R

object MovieConstant {
    fun getCategoryData(): List<MovieData> {
        val data = mutableListOf<MovieData>()

        data.add(
            MovieData(
                id = "Drama",
                name = "Drama",
                image = R.drawable.baseline_feed_24
            )
        )

        data.add(
            MovieData(
                id = "Horor",
                name = "Horor",
                image = R.drawable.baseline_feed_24
            )
        )

        data.add(
            MovieData(
                id = "Romantis",
                name = "Romantis",
                image = R.drawable.baseline_feed_24
            )
        )

        data.add(
            MovieData(
                id = "Animasi",
                name = "Animasi",
                image = R.drawable.baseline_feed_24
            )
        )

        data.add(
            MovieData(
                id = "Aksi",
                name = "Aksi",
                image = R.drawable.baseline_feed_24
            )
        )

        data.add(
            MovieData(
                id = "Thriller",
                name = "Thriller",
                image = R.drawable.baseline_feed_24
            )
        )


        return data
    }
}