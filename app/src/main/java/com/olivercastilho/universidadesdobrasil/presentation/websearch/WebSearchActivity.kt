package com.olivercastilho.universidadesdobrasil.presentation.websearch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.olivercastilho.universidadesdobrasil.R
import kotlinx.android.synthetic.main.activity_web_search.*


class WebSearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_search)
        val initials = intent.getStringExtra("initials")
        val stateInitials = intent.getStringExtra("stateInitials")

        webview_search.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                if (url == null || url.startsWith("http://") || url.startsWith("https://"))
                    return false

                return try {
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    view.context.startActivity(intent)
                    true
                } catch (e: Exception) {
                    true
                }
            }
        }
        webview_search.settings.javaScriptEnabled = true
        webview_search.loadUrl("https://www.google.com.br/search?q=$initials+$stateInitials&newwindow=0&tbm=nws")
    }
}
