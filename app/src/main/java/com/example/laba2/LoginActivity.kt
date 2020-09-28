package com.example.laba2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun moveToGardenAct(view: View) {
        val intent = Intent(this, GardenActivity::class.java)
        startActivity(intent)
    }
    fun moveToRegistrationAcc(view: View) {
        val intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }
}