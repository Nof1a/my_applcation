package com.example.myapplication1.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.databinding.ActivityLogiNBinding
import android.content.Intent
import com.example.myapplication1.listnote.ui.NotescreenActivity


class LogiN : AppCompatActivity() {
    private lateinit var binding: ActivityLogiNBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogiNBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.passwordidlayot.setOnClickListener {
            val intent = Intent(this,NotescreenActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.passwordforget.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
            finish()
        }
    }
}