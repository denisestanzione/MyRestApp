package com.example.myrestapp_denisestanzione

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnWebView = findViewById<ImageButton>(R.id.btnWebView)
        val btnSearch = findViewById<ImageButton>(R.id.btnSearch)
        val btnDashboard = findViewById<ImageButton>(R.id.btnDashboard)

        // Al click del pulsante per la web view di netflix
        btnWebView.setOnClickListener {
            intentWebView()
        }

    }

    private fun intentWebView(){
        val mioIntent = Intent(this, WebViewActivity::class.java)
        startActivity(mioIntent)
    }
}