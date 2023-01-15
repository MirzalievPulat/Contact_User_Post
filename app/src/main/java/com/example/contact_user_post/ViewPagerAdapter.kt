package com.example.contact_user_post

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    var fragmentList = ArrayList<Fragment>()
    var titleList = ArrayList<String>()

    fun add(fragment: Fragment,title:String){
        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}