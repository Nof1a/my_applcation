package com.example.myapplication1.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.myapplication1.R
import com.example.myapplication1.databinding.ActivityRegistrationBinding
import com.example.myapplication1.listnote.ui.NotescreenActivity


class Registration : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        binding.buott.setOnClickListener {
            val intent = Intent(this, NotescreenActivity::class.java)
            startActivity(intent)
            finish()
        }


        binding.haveRes.setOnClickListener {
            val intent = Intent(this, LogiN ::class.java)
            startActivity(intent)
            finish()
        }
    }
}
