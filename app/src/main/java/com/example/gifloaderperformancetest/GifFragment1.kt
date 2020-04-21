package com.example.gifloaderperformancetest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import kotlinx.android.synthetic.main.fragment_gif.*

class GifFragment1: Fragment() {

    private lateinit var myActivity: ChildActivity1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_gif, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        myActivity = activity as ChildActivity1
        val gifList = myActivity.getGifList()
        val layoutManager = StaggeredGridLayoutManager(4
            , StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        // 使用FruitAdapter1
        val adapter = GifAdapter1(gifList, myActivity)
        recyclerView.adapter = AlphaInAnimationAdapter(adapter)
    }

}