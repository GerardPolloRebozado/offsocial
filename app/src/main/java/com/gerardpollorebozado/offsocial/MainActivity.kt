package com.gerardpollorebozado.offsocial

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent?.action == Intent.ACTION_SEND && intent.type == "text/plain") {
            val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT)
            if (sharedText != null) {
                val modifiedUrl = modifyUrl(sharedText)
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(modifiedUrl))
                startActivity(browserIntent)
            }
        }

        finish()
    }

    private fun modifyUrl(url: String): String {
        return url.replace("tiktok", "offtiktok")
    }
}
