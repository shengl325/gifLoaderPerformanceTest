package com.example.gifloaderperformancetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_child.*

class ChildActivity1 : AppCompatActivity() {

    private lateinit var pokemonList: ArrayList<Gif>
    private lateinit var hamtaroList: ArrayList<Gif>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_child)
        pokemonList = intent.getParcelableArrayListExtra<Gif>("pokemon")
        hamtaroList = intent.getParcelableArrayListExtra<Gif>("hamtaro")
        viewPager.adapter = MyViewPagerAdapter(
            supportFragmentManager, listOf(
                PokemonFragment1()
                , HamtaroFragment1()
            )
        )
        tabLayout.setupWithViewPager(viewPager)
    }

    fun getPokemonList() = pokemonList

    fun getHamtaroList() = hamtaroList

}
