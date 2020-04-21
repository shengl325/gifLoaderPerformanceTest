package com.example.gifloaderperformancetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChildActivity1 : AppCompatActivity() {

    private lateinit var gifList: ArrayList<Gif>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
        gifList = intent.getParcelableArrayListExtra<Gif>("data")
    }

    public fun getGifList() = gifList

}
