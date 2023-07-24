package com.codingtest.uicodingtest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingtest.uicodingtest.R
import com.codingtest.uicodingtest.databinding.ViewHolderImageBinding
import com.codingtest.uicodingtest.databinding.ViewHolderRoomBinding
import com.codingtest.uicodingtest.viewholders.ImageViewHolder
import com.codingtest.uicodingtest.viewholders.RoomViewHolder

class RoomAdapter : RecyclerView.Adapter<RoomViewHolder>() {
    private val imageList = listOf(R.drawable.photo_four, R.drawable.photo_three, R.drawable.photo_two, R.drawable.photo_one)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        val itemBinding = ViewHolderRoomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RoomViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        holder.bindData(imageList[position])
    }
}