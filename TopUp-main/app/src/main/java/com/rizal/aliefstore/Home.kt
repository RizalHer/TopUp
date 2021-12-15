package com.rizal.aliefstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    val menuTeks= arrayOf("Cara Top Up", "Cara Joki")
    val menuIcon= arrayOf(R.drawable.ic_gift, R.drawable.ic_globe)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
                tab.text= menuTeks[position]
                tab.icon= ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }
}