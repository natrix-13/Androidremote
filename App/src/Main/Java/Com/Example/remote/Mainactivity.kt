package com.example.remote

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = Button(this).apply { text = "Start Screen Share" }
        setContentView(button)

        button.setOnClickListener {
            val intent = Intent(this, ScreenShareService::class.java)
            startForegroundService(intent)
        }
    }
}
