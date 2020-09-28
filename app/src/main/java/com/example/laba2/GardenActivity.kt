package com.example.laba2


import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.laba2.mainMenuGuts.FakeFragment
import com.example.laba2.mainMenuGuts.GeolocationFragment
import com.example.laba2.mainMenuGuts.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_garden.*
import kotlinx.android.synthetic.main.fragment_geolocation.*


class GardenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden)
        bottom_navigation.setOnNavigationItemSelectedListener(navListener)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                GeolocationFragment()
            ).commit()
        }
    }
    private val navListener: BottomNavigationView.OnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.page_1 -> selectedFragment = GeolocationFragment()
                R.id.page_2 -> selectedFragment = SettingsFragment()
                R.id.page_3 -> selectedFragment = FakeFragment()
                R.id.page_4 -> selectedFragment = FakeFragment()
                R.id.page_5 -> selectedFragment = FakeFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                selectedFragment!!).commit()
            true
        }
    fun startDialog1(view: View){
        dialog1.visibility = View.VISIBLE
    }
    fun startDialog2(view: View){
        dialog2.visibility = View.VISIBLE
    }
    fun endDialog1(view: View){
        dialog1.visibility = View.GONE
    }
    fun endDialog2(view: View){
        dialog2.visibility = View.GONE
    }
}