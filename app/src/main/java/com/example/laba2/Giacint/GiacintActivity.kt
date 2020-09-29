package com.example.laba2.Giacint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.laba2.R
import com.example.laba2.mainMenuGuts.GeolocationFragment

class GiacintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giacint)
    }
    fun goBack(view: View){
        onBackPressed()
    }

}