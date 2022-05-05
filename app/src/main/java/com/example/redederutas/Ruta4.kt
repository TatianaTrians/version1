package com.example.redederutas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Ruta4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruta4)
        val boton = findViewById<Button>(R.id.wikiloc)
        boton.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,

                Uri.parse("https://es.wikiloc.com/rutas-senderismo/ruta-das-muineiras-59393246#lb-embed"))

            if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
        }
        val pieza1 = findViewById<ImageView>(R.id.pieza1)
        pieza1.setOnClickListener {
            pieza1.animate().apply {
                duration = 1000
                rotationBy(360f)
            }.withEndAction {
                val viewIntent = Intent(Intent.ACTION_VIEW,

                    Uri.parse(" https://turismo.teo.gal/storage/attachments/wrYjNteqCyrJTCQHwSuEyfjvsdSg72eiv9OHLy1x.pdf"))

                if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
            }
        }

        val pieza2 = findViewById<ImageView>(R.id.pieza2)
        pieza2.setOnClickListener {
            pieza2.animate().apply {
                duration = 1000
                rotationBy(360f)
            }.withEndAction {
                val viewIntent = Intent(Intent.ACTION_VIEW,

                    Uri.parse("https://turismo.teo.gal/storage/attachments/B11sNusewxkFNPCMQupINQrze8U7NGOfsF5YTnIE.pdf"))

                if (viewIntent.resolveActivity(packageManager) != null) { startActivity(viewIntent) }
            }
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
