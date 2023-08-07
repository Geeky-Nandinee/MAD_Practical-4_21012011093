package com.example.mad_practical_4_21012011093

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button = findViewById<Button>(R.id.Login)
        Button.setOnClickListener{
            Login()
        }
        val Button2 = findViewById<Button>(R.id.SignUp)
        Button2.setOnClickListener{
            signUp()
        }

    }
        fun Login(){
        Intent(this@MainActivity,LoginActivity::class.java).also{
            startActivity(it)
        }
        }
        fun signUp(){
            Intent(this@MainActivity,LoginActivity::class.java).also{
                startActivity(it)
            }
    }
}
