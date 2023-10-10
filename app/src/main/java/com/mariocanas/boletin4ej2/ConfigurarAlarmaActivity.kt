package com.mariocanas.boletin4ej2

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker

class ConfigurarAlarmaActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_alarma)

        val botonGuardarAlarma = findViewById<Button>(R.id.guardarAlarma)

        botonGuardarAlarma.setOnClickListener {
            val nombreAlarmaView = findViewById<EditText>(R.id.nombreAlarma)
            val horaAlarmaView = findViewById<TimePicker>(R.id.horaAlarma)

            val nombreAlarma = nombreAlarmaView.text.toString()
            val horaAlarma = horaAlarmaView.hour
            val minutoAlarma = horaAlarmaView.minute

            val intentAlarma = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, nombreAlarma)
                putExtra(AlarmClock.EXTRA_HOUR, horaAlarma)
                putExtra(AlarmClock.EXTRA_MINUTES, minutoAlarma)

            }
            startActivity(intentAlarma)
            finish()
        }
    }
}
