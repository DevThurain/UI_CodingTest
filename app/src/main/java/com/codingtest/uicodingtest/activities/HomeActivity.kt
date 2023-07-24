package com.codingtest.uicodingtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codingtest.uicodingtest.R
import com.codingtest.uicodingtest.adapters.ImageAdapter
import com.codingtest.uicodingtest.adapters.RateAdapter
import com.codingtest.uicodingtest.adapters.RoomAdapter
import com.codingtest.uicodingtest.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var mImageAdapter: ImageAdapter
    lateinit var mRoomAdapter: RoomAdapter
    lateinit var mRateAdapter: RateAdapter
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpImageRecyclerView()
        setUpToggleGroup()
    }

    private fun setUpImageRecyclerView(){
        mImageAdapter = ImageAdapter()
        binding.rvImageList.adapter = mImageAdapter
    }

    private fun showRoomRecyclerView(){
        mRoomAdapter = RoomAdapter()
        binding.rvRoomRate.adapter = mRoomAdapter
    }

    private fun showRateRecyclerView(){
        mRateAdapter = RateAdapter()
        binding.rvRoomRate.adapter= mRateAdapter
    }

    private fun setUpToggleGroup(){
        showRoomRecyclerView()
        binding.toggleRoomRate.addOnButtonCheckedListener { group, checkedId, isChecked ->
            if(checkedId != R.id.btnRoom){
                // rate
                showRateRecyclerView()

            }else{
                // room
                showRoomRecyclerView()
            }
        }
    }
}