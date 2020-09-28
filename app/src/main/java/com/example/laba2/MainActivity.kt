package com.example.laba2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.laba2.mainMenuGuts.GeolocationFragment
import kotlinx.android.synthetic.main.activity_garden.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // убедитесь, что вызываете до super.onCreate()
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun moveToRegistrationAcc(view: View) {
        val intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }
    fun moveToLoginAcc(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}