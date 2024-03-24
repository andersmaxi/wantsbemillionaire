package com.example.wants_be_millionaire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)


        //*****************************************************
        // Lose Activity
        //*****************************************************

        val btnagain : Button = findViewById<Button>(R.id.btn_again)

        btnagain.setOnClickListener()
        {
            val intentagain : Intent = Intent(this@LoseActivity,Question01Activity::class.java)

            startActivity(intentagain)
        }
    }
}