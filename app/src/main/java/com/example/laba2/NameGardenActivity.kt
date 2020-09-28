package com.example.laba2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NameGardenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_garden)
    }
    fun moveToGardenAct(view: View) {
        val intent = Intent(this, GardenActivity::class.java)
        startActivity(intent)
    }
}