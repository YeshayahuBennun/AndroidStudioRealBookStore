package com.example.bitamirshafiee.bookstoreskeleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        val pagerAdapter = MyPagerAdapter(supportFragmentManager)

        viewPager.adapter = pagerAdapter
    }
}
