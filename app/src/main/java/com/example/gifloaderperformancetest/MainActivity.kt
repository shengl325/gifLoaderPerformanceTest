package com.example.gifloaderperformancetest

import android.animation.AnimatorInflater
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitList = ArrayList<Gif>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()
        child1.setOnClickListener {
            val intent = Intent(this, ChildActivity1::class.java)
            intent.putExtra("data", fruitList)
            startActivity(intent)
        }

        child2.setOnClickListener {
            val intent = Intent(this, ChildActivity2::class.java)
            intent.putExtra("data", fruitList)
            startActivity(intent)
        }
        val animator1 = AnimatorInflater.loadAnimator(this, R.animator.breath)
        val animator2 = AnimatorInflater.loadAnimator(this, R.animator.breath)
        animator1.setTarget(child1)
        animator2.setTarget(child2)
        animator1.start()
        animator2.start()
    }

    private fun initFruits() {
        repeat(3) {
            fruitList.add(Gif("test1", R.drawable.test1))
            fruitList.add(Gif("test2", R.drawable.test2))
            fruitList.add(Gif("test3", R.drawable.test3))
            fruitList.add(Gif("test4", R.drawable.test4))
            fruitList.add(Gif("test5", R.drawable.test5))
            fruitList.add(Gif("test6", R.drawable.test6))
        }
    }

    public fun getFruitList() = fruitList

}
