package com.example.gifloaderperformancetest

import android.animation.AnimatorInflater
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val pokemonList = ArrayList<Gif>()
    private val hamtaroList = ArrayList<Gif>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        initPokemons(pokemonList)
        initHamtaros(hamtaroList)
        child1.setOnClickListener(this)
        child2.setOnClickListener(this)
        setAnimator()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.child1 -> {
                val intent = Intent(this, ChildActivity1::class.java)
                intent.apply {
                    putExtra("pokemon", pokemonList)
                    putExtra("hamtaro", hamtaroList)
                }
                startActivity(intent)
            }
            R.id.child2 -> {
                val intent = Intent(this, ChildActivity2::class.java)
                intent.putExtra("data", pokemonList)
                startActivity(intent)
            }
        }
    }

    private fun setAnimator() {
        val animator1 = AnimatorInflater.loadAnimator(this, R.animator.breath)
        val animator2 = AnimatorInflater.loadAnimator(this, R.animator.breath)
        animator1.setTarget(child1)
        animator2.setTarget(child2)
        animator1.start()
        animator2.start()
    }

}
