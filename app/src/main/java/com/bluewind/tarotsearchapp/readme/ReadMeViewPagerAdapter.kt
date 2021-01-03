package com.bluewind.tarotsearchapp.readme

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ReadMeViewPagerAdapter(fragment: FragmentManager, life: Lifecycle) :
    FragmentStateAdapter(fragment, life) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int) = when (position % 3) {
        0 -> ReadMeFirstFragment()
        1 -> ReadMeSecondFragment()
        2 -> ReadMeThirdFragment()
        else -> error("設定エラー code:1")
    }
}