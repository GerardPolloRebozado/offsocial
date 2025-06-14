package com.gerardpollorebozado.rssviewer

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
        // 🛠️ Replace this logic with your custom modification
        return url.replace("tiktok", "offtiktok")
    }
}
