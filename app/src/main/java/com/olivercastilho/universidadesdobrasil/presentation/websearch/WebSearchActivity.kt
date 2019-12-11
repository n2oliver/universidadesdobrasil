package com.olivercastilho.universidadesdobrasil.presentation.websearch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.presentation.AppBarTitle
import com.olivercastilho.universidadesdobrasil.presentation.states.StatesActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_web_search.*
import kotlinx.android.synthetic.main.universityname.*


class WebSearchActivity : AppCompatActivity() {
    private lateinit var name: String
    private lateinit var initials: String
    private lateinit var neighborhood: String
    private lateinit var state: String
    private lateinit var originalUrl: String
    private var url: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_search)


        MobileAds.initialize(this)
        if(BuildConfig.DEBUG) {
            val testDeviceIds = listOf(getString(R.string.test_devive_id))
            val configuration =
                RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
            MobileAds.setRequestConfiguration(configuration)
        }
        val adRequest  = AdRequest.Builder()
            .build()
        adView.loadAd(adRequest)

        name = intent.getStringExtra("name")?:""
        initials = intent.getStringExtra("initials")?:""
        neighborhood = intent.getStringExtra("neighborhood")?:""
        state = intent.getStringExtra("state")?:""

        originalUrl = "https://www.google.com.br/search?q=$name+$initials+$neighborhood&newwindow=0"
        url = originalUrl
        val context = this
        textView_universityNameBottom.text = name

        AppBarTitle.changeAppBarTitle(textView_appName, state)

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
        if(url != originalUrl) {
            url = originalUrl
            webview_search.loadUrl(url)
            webview_search.copyBackForwardList()
            return
        } else {
            super.onBackPressed()
        }
    }
}
