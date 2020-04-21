package com.example.gifloaderperformancetest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.OvershootInterpolator
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import kotlinx.android.synthetic.main.fragment_gif.*

class GifFragment2: Fragment() {

    private lateinit var myActivity: ChildActivity2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_gif, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        myActivity = activity as ChildActivity2
        val gifList = myActivity.getGifList()
        val layoutManager = StaggeredGridLayoutManager(4
            , StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        // 使用FruitAdapter2
        val adapter = GifAdapter2(gifList, myActivity)
        recyclerView.adapter = AlphaInAnimationAdapter(adapter).apply {
            setDuration(1000)
            setInterpolator(OvershootInterpolator())
            setFirstOnly(false)
        }
    }

}