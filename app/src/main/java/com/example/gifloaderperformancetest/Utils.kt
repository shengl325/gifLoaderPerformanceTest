package com.example.gifloaderperformancetest

import android.app.Activity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_child.*

fun setViewHolder(vh: ViewHolder, gifList: List<Gif>, activity: Activity): ViewHolder {
    vh.gif.setOnClickListener {
        val position = vh.adapterPosition
        val gif = gifList[position]
        Glide.with(activity)
            .load(gif.gifId)
            .into(activity.bigGif)
    }
    return vh
}