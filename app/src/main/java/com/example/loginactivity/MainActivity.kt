package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edUserName: EditText
    lateinit var edPassword: EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edUserName = findViewById(R.id.edUserName)
        edPassword = findViewById(R.id.edPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            if(edUserName.text.toString() == "Test" && edPassword.text.toString() == "Test123") {
                Toast.makeText(this, "Bienvenido usuario de prueba", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Inicio invalido", Toast.LENGTH_SHORT).show()
            }
        }

    }
}