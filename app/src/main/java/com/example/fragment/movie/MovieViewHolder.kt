package com.example.fragment.movie

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.R
import com.google.android.material.textview.MaterialTextView

class MovieViewHolder(
    private val categoryItemView: View
): RecyclerView.ViewHolder(categoryItemView) {
    private var name: MaterialTextView? = null
    private var image: ImageView? = null

    fun bindData(data: MovieData) {
        name = categoryItemView.findViewById(R.id.category_item_name)
        image = categoryItemView.findViewById(R.id.category_item_image)

        name?.text = data.name
        image?.setImageResource(data.image)
    }
}