package com.example.gifloaderperformancetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_child.*

class ChildActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ChildActivity1和ChildActivity2使用同一个布局
        // 因为它们的区别只在于RecyclerView的子项布局
        setContentView(R.layout.activity_child)

        val gifList = intent.getParcelableArrayListExtra<Gif>("data")

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager = layoutManager
        // 使用FruitAdapter2
        val adaptor = GifAdapter2(gifList)
        recyclerView.adapter = adaptor
    }
}
