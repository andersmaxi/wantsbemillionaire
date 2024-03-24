package com.example.wants_be_millionaire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val btnplay : Button = findViewById<Button>(R.id.btn_play)

        //*****************************************************
        // Help Activity
        //*****************************************************

        btnplay.setOnClickListener()
        {
            val intentplay : Intent = Intent (this@HelpActivity,Question01Activity::class.java)

            startActivity(intentplay)
        }
    }
}