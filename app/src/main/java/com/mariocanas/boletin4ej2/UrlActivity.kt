package com.mariocanas.boletin4ej2

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UrlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_url)

        val urlBoton = findViewById<Button>(R.id.botonBuscar)

        urlBoton.setOnClickListener {
            val url = findViewById<TextView>(R.id.urlBusqueda)
            val urlText = url.text.toString()

            val intentUrl = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, urlText)
            }
            startActivity(intentUrl)
            finish()
        }
    }
}