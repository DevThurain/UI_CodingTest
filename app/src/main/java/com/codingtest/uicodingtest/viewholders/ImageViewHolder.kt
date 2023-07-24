package com.codingtest.uicodingtest.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codingtest.uicodingtest.databinding.ViewHolderImageBinding

class ImageViewHolder(private val itemBinding: ViewHolderImageBinding) : RecyclerView.ViewHolder(itemBinding.root) {


    fun bindData(photoData: Int){
        Glide.with(itemBinding.root)
            .load(photoData)
            .into(itemBinding.ivCover)
    }
}