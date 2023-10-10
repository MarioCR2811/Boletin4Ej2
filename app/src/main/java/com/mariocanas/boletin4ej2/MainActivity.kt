package com.mariocanas.boletin4ej2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonMenuAlarma = findViewById<Button>(R.id.botonMenuAlarma)
        val botonUrl = findViewById<Button>(R.id.botonNavegador)
        val botonContactos = findViewById<Button>(R.id.botonContactos)

        botonMenuAlarma.setOnClickListener {
            val intentMenuAlarma = Intent(this, ConfigurarAlarmaActivity ::class.java)
            startActivity(intentMenuAlarma)
        }

        botonUrl.setOnClickListener {
            val intentUrl = Intent(this, UrlActivity ::class.java)
            startActivity(intentUrl)
        }

        botonContactos.setOnClickListener {
            val intentContactos = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("content://contacts/people/")
            }
            startActivity(intentContactos)
        }
    }
}