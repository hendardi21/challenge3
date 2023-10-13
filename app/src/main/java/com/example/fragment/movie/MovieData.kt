package com.example.fragment.movie

import java.io.Serializable

data class MovieData(
    val id: String,
    val name: String,
    val image: Int
): Serializable