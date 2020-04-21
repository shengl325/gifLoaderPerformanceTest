package com.example.gifloaderperformancetest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class GifAdapter2(val gifList: List<Gif>, val activity: ChildActivity2) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.gif_item_2, parent, false)
        return setViewHolder(ViewHolder(view), gifList)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = gifList[position]
        holder.gifName.text = fruit.name
        Glide.with(holder.itemView.context)
            .load(fruit.gifId)
            .into(holder.gif)
    }

    override fun getItemCount() = gifList.size

}