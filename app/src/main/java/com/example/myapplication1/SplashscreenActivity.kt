package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myapplication1.databinding.ActivityMainBinding
import android.content.Intent
import com.example.myapplication1.authentication.LogiN


@Suppress("DEPRECATION")

class SplashscreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this, LogiN::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}