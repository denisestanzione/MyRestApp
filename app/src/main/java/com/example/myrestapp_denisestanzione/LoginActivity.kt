package com.example.myrestapp_denisestanzione

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Array associativo con nome utente e password codificata in SHA256
        val credenziali = mapOf(
            "User1" to "a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3", // password codificata in SHA256
            "User2" to "b3a8e0e1f9ab1bfe3a36f231f676f78bb30a519d2b21e6c530c0eee8ebb4a5d0",
            "User3" to "35a9e381b1a27567549b5f8a6f783c167ebf809f1c4d6a9e367240484d8ce281"
        )
    }
}