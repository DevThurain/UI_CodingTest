package com.codingtest.uicodingtest.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codingtest.uicodingtest.databinding.ViewHolderImageBinding
import com.codingtest.uicodingtest.databinding.ViewHolderRoomBinding

class RoomViewHolder(private val itemBinding: ViewHolderRoomBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    fun bindData(photoData: Int){
        Glide.with(itemBinding.root)
            .load(photoData)
            .into(itemBinding.ivCover)
    }
}