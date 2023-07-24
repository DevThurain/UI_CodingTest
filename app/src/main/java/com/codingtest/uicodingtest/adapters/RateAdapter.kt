package com.codingtest.uicodingtest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingtest.uicodingtest.R
import com.codingtest.uicodingtest.databinding.ViewHolderImageBinding
import com.codingtest.uicodingtest.databinding.ViewHolderRateBinding
import com.codingtest.uicodingtest.databinding.ViewHolderRoomBinding
import com.codingtest.uicodingtest.viewholders.ImageViewHolder
import com.codingtest.uicodingtest.viewholders.RateViewHolder
import com.codingtest.uicodingtest.viewholders.RoomViewHolder

class RateAdapter : RecyclerView.Adapter<RateViewHolder>() {
    private val imageList = listOf(R.drawable.photo_four, R.drawable.photo_three, R.drawable.photo_two, R.drawable.photo_one)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RateViewHolder {
        val itemBinding = ViewHolderRateBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RateViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: RateViewHolder, position: Int) {
        holder.bindData(imageList[position])
    }
}