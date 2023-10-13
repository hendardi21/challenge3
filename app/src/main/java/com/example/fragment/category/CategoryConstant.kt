package com.example.fragment.category

import com.example.fragment.R

class CategoryConstant {
    fun getMovieData(): List<CategoryData> {
        val data = mutableListOf<CategoryData>()

        data.add(
            CategoryData(
                id = "Titanic",
                categoryId = "Drama",
                title = "Titanic",
                image = R.drawable.ic_aquamen
            )
        )

        data.add(
            CategoryData(
                id = "waktu_maghrib",
                categoryId = "Horor",
                title = "waktu maghrib",
                image = R.drawable.ic_chucky_pic
            )
        )

        data.add(
            CategoryData(
                id = "cinta_shubuh",
                categoryId = "Romantis",
                title = "cinta_shubuh",
                image = R.drawable.ic_toy_story
            )
        )
        data.add(
            CategoryData(
                id = "Toy_Story",
                categoryId = "Animasi",
                title = "Toy_Story",
                image = R.drawable.ic_toy_story
            )
        )

        data.add(
            CategoryData(
                id = "cinta_cinta_malam",
                categoryId = "Aksi",
                title = "cinta cinta malam",
                image = R.drawable.ic_chucky_pic
            )
        )

        data.add(
            CategoryData(
                id = "Shutter_island",
                categoryId = "film seru",
                title = "Shutter island",
                image = R.drawable.ic_toy_story
            )
        )
        return data
    }
}