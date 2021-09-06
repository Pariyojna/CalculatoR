package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Handler().postDelayed({val intent:=Intent()})
            val i=Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }

