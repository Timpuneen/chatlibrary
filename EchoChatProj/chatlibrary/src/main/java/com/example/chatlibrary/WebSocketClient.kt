package com.example.chatlibrary

import okhttp3.*
import java.util.concurrent.TimeUnit

class WebSocketClient(private val listener: WebSocketListener) {
    private val client = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .build()

    private lateinit var webSocket: WebSocket

    fun connect() {
        val request = Request.Builder().url("wss://echo.websocket.org/").build()
        webSocket = client.newWebSocket(request, listener)
    }

    fun sendMessage(message: String) {
        webSocket.send(message)
    }

    fun close() {
        webSocket.close(1000, "Chat is closed;)")
    }
}