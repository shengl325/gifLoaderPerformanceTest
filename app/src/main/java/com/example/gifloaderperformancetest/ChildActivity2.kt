package com.example.gifloaderperformancetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChildActivity2 : AppCompatActivity() {

    private lateinit var gifList: ArrayList<Gif>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_child2)
        gifList = intent.getParcelableArrayListExtra<Gif>("data")
    }

    fun getGifList() = gifList

}
