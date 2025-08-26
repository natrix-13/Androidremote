package com.example.remote

import okhttp3.*
import org.webrtc.*
import java.util.concurrent.Executors

class Signaling {
    private val client = OkHttpClient()
    private val wsUrl = "ws://YOUR_SERVER:8080/signal"

    fun connect() {
        val request = Request.Builder().url(wsUrl).build()
        client.newWebSocket(request, object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                webSocket.send("{\"type\":\"hello\"}")
            }
        })
    }
}
