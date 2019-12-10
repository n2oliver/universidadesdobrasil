package com.olivercastilho.universidadesdobrasil.presentation.websearch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.presentation.states.StatesActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_web_search.*


class WebSearchActivity : AppCompatActivity() {
    private lateinit var initials: String
    private lateinit var stateInitials: String
    private var url: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_search)
        initials = intent.getStringExtra("initials")
        stateInitials = intent.getStringExtra("stateInitials")
        url = "https://www.google.com.br/search?q=$initials+$stateInitials&newwindow=0"
        val context = this
        webview_search.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                context.url = url
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
        webview_search.loadUrl(url)

        imageView_ublogo.setOnClickListener {
            intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if(url != "https://www.google.com.br/search?q=$initials+$stateInitials&newwindow=0") {
            url = "https://www.google.com.br/search?q=$initials+$stateInitials&newwindow=0"
            webview_search.loadUrl(url)
            webview_search.copyBackForwardList()
            return
        } else {
            super.onBackPressed()
        }
    }
}
