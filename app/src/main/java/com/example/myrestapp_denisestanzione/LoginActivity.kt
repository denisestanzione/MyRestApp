package com.example.myrestapp_denisestanzione

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Al click del pulsante
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            // Verifica le credenziali
            if(login("User1", "665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3")){
                val mioToast = Toast.makeText(this, "Benvenuto!", Toast.LENGTH_LONG)
                mioToast.show()
            }
            else{
                val mioToast = Toast.makeText(this, "Credenziali errate!", Toast.LENGTH_LONG)
                mioToast.show()
            }
        }
    }

    // Funzione che verifica l'esistenza delle credenziali inserite in input, ritorna un valore booleano in base a se siano state trovate o meno
    private fun login(username: String, password: String): Boolean{
        // Array associativo con nome utente e password codificata in SHA256
        val credenziali = mapOf(
            "User1" to "a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3", // password codificata in SHA256
            "User2" to "b3a8e0e1f9ab1bfe3a36f231f676f78bb30a519d2b21e6c530c0eee8ebb4a5d0",
            "User3" to "35a9e381b1a27567549b5f8a6f783c167ebf809f1c4d6a9e367240484d8ce281"
        )

        return credenziali[username] == password
    }
}