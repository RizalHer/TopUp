package com.rizal.aliefstore

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity){
    private val JUMLAH_MENU = 2
    override fun createFragment(position: Int): Fragment {
        when (position){
            0 ->  {return Cara_top_up()}
            1 -> {return  cara_joki()}
            else -> (return Cara_top_up())

        }
    }
    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}