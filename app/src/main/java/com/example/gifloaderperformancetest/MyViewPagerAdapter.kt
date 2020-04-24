package com.example.gifloaderperformancetest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyViewPagerAdapter(fragmentManager: FragmentManager, val fraglist: List<Fragment>) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) = fraglist[position]

    override fun getCount() = fraglist.size

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Pokemon"
            1 -> return "Hamtaro"
            else -> return "NULL"
        }
    }

}