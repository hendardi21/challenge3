package com.example.fragment.category

import java.io.Serializable

class CategoryData(
    val id: String,
    val categoryId: String,
    val title: String,
    var image: Int
): Serializable
