package com.example.gifloaderperformancetest

import com.bumptech.glide.Glide

fun setViewHolder(vh: ViewHolder, gifList: List<Gif>): ViewHolder {
    vh.gif.setOnClickListener {
        val position = vh.adapterPosition
        val gif = gifList[position]
        Glide.with(vh.itemView.context)
            .load(gif.gifId)
            .into(vh.gif)
    }
    return vh
}