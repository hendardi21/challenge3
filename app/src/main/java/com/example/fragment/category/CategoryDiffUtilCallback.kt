package com.example.fragment.category


import androidx.recyclerview.widget.DiffUtil

class CategoryDiffUtilCallback : DiffUtil.ItemCallback<CategoryData>() {
    override fun areItemsTheSame(oldItem: CategoryData, newItem: CategoryData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: CategoryData, newItem: CategoryData): Boolean {
        return oldItem.id == newItem.id
    }



}