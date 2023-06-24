package com.nekiol.br.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nekiol.br.loginapp.databinding.ActivityLoginOkBinding

class LoginOkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginOkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogout.setOnClickListener {
            finish()
        }
    }
}