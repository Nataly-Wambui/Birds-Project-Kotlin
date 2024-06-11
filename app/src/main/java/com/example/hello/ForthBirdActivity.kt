package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityForthBirdBinding
import com.squareup.picasso.Picasso

class ForthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityForthBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev4.setOnClickListener{
            finish()
        }
        binding.btnNext4.setOnClickListener{
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww")
            .fit()
            .into(binding.imageView5)
    }
}