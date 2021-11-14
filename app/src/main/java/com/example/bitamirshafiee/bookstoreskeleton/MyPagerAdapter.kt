package com.example.bitamirshafiee.bookstoreskeleton

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {

    val pageNumber = 3
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> //first fragment
            1 -> //second fragment
            2 -> //third fragment
        }
    }

    override fun getCount(): Int {
        return pageNumber
    }

}