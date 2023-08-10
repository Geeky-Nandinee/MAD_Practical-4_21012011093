package com.example.mad_practical_4_21012011093

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val register: Button = findViewById(R.id.login_btn)
        register.setOnClickListener {
            Intent(this@RegistrationActivity, RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}