package com.example.prueba2_4b

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /*
        // Variables
        val nombre : String = "Arturo" //Dato imutable
        var edad = 18 // Dato mutable

        nombre = "pepe"
        edad = 19
        */

        // Indica cual es la pantalla que se va a mostrar
        setContentView(R.layout.activity_main)

        // Hacer referencia a los elementos de la vista
        // R hace referencia a todos los recursos del proyecto
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        // Crear un evento con el método de Button
        // Cuando el usuario de click al botón, verá un saludo
        btnSaludo.setOnClickListener {

            // Crear variable y guardar el texto que escribe el usuario - GetText()
            val nombre = etNombre.text.toString()

            // Mandar saludo al usuario con el TextView - SetText()
            tvSaludo.text = "Hello $nombre :D"

        }




        //bajar el viewCompact
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}