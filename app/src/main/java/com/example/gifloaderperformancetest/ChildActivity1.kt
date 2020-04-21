package com.example.gifloaderperformancetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_child.*

class ChildActivity1 : AppCompatActivity() {

    private lateinit var gifList: ArrayList<Gif>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
        gifList = intent.getParcelableArrayListExtra<Gif>("data")
    }

    public fun getGifList() = gifList

}
