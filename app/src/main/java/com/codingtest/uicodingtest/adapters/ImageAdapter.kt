package com.codingtest.uicodingtest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingtest.uicodingtest.R
import com.codingtest.uicodingtest.databinding.ViewHolderImageBinding
import com.codingtest.uicodingtest.viewholders.ImageViewHolder

class ImageAdapter : RecyclerView.Adapter<ImageViewHolder>() {
    private val imageList = listOf(R.drawable.photo_four, R.drawable.photo_three, R.drawable.photo_two, R.drawable.photo_one)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val itemBinding = ViewHolderImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindData(imageList[position])
    }
}