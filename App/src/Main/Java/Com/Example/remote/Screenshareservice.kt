package com.example.remote

import android.app.Service
import android.content.Intent
import android.os.IBinder

class ScreenShareService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // TODO: WebRTC screen capture logic
        return START_STICKY
    }
    override fun onBind(intent: Intent?): IBinder? = null
}
