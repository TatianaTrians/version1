package com.example.redederutas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Ruta12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruta12)

        val boton = findViewById<Button>(R.id.wikiloc)
        boton.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://es.wikiloc.com/rutas-senderismo/camino-da-geira-e-dos-arrieiros-en-teo-59054627"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
        val redeRutas = findViewById<ImageButton>(R.id.logoRedeRutas)
        redeRutas.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://turismo.teo.gal/storage/attachments/50aGWdgYuYtFhm3AeipFktHw42vhrx3uMfAmykpF.pdf"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
        val facebook = findViewById<ImageButton>(R.id.facebook)
        facebook.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://es-es.facebook.com/turismoteo/"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
        val twitter = findViewById<ImageButton>(R.id.twitter)
        twitter.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://twitter.com/turismoteo"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
        val instagram = findViewById<ImageButton>(R.id.instagram)
        instagram.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://www.instagram.com/accounts/login/?next=/turismoteo/"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
        val wikiloc = findViewById<ImageButton>(R.id.wikiloc1)
        wikiloc.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://es.wikiloc.com/wikiloc/user.do?id=6776439"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
        val info = findViewById<ImageButton>(R.id.info)
        info.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
    }
}