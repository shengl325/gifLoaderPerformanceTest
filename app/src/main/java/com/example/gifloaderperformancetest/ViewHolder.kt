package com.example.gifloaderperformancetest

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val gif: ImageView = view.findViewById(R.id.gif)
    val gifName: TextView = view.findViewById(R.id.gifName)
}