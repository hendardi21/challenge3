package com.example.fragment.category

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.R
import com.google.android.material.textview.MaterialTextView

class CategoryViewHolder(movieItemView: View) : RecyclerView.ViewHolder(movieItemView) {
    private var title: MaterialTextView = movieItemView.findViewById(R.id.movie_item_title)
    private var image: ImageView = movieItemView.findViewById(R.id.movie_item_image)

    fun bindData(data: CategoryData) {
        title.text = data.title
        image.setImageResource(data.image)
    }
}
