package com.example.gifloaderperformancetest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class GifAdapter1(val gifList: List<Gif>, val activity: ChildActivity1) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.gif_item_1, parent, false)

        return setViewHolder(ViewHolder(view), gifList, activity)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gif = gifList[position]
        holder.gifName.text = gif.name
        Glide.with(holder.itemView.context)
            .load(gif.gifId)
            .centerCrop()
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .error(R.drawable.ic_launcher_background)
            )
            .into(holder.gif)
    }

    override fun getItemCount() = gifList.size

}