package com.example.laba2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
    }

    fun moveToLoginAct(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun moveToGardenCreateAct(view: View) {
        val intent = Intent(this, NameGardenActivity::class.java)
        startActivity(intent)
    }


}