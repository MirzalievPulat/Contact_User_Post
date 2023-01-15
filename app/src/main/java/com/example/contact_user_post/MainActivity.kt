package com.example.contact_user_post

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        var adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.add(ContactFragment(),"Contact")
        adapter.add(UserFragment(),"User")
        adapter.add(PostFragment(),"Post")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
        
    }
}