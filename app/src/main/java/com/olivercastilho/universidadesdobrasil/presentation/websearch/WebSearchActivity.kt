package com.olivercastilho.universidadesdobrasil.presentation.websearch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.adcolony.sdk.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.StorageManager.Companion.clearApplicationData
import com.olivercastilho.universidadesdobrasil.presentation.AppBarTitle
import com.olivercastilho.universidadesdobrasil.presentation.states.StatesActivity
import com.olivercastilho.universidadesdobrasil.presentation.tips.TipsActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web_search.*
import kotlinx.android.synthetic.main.activity_web_search.adView
import kotlinx.android.synthetic.main.universityname.*


class WebSearchActivity : AppCompatActivity() {
    private lateinit var name: String
    private lateinit var initials: String
    private lateinit var neighborhood: String
    private lateinit var state: String
    private lateinit var originalUrl: String
    private var url: String? = null
    var history: ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_search)

        MobileAds.initialize(applicationContext)
        if(BuildConfig.DEBUG) {
            val testDeviceIds = listOf(getString(R.string.test_devive_id))
            val configuration =
                RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
            MobileAds.setRequestConfiguration(configuration)
        }
        val adRequest  = AdRequest.Builder()
            .build()
        adView.loadAd(adRequest)

        name = intent.getStringExtra("name") ?: ""
        initials = intent.getStringExtra("initials") ?: ""
        neighborhood = intent.getStringExtra("neighborhood") ?: ""
        state = intent.getStringExtra("state") ?: ""

        originalUrl = "https://www.google.com.br/search?q=$name+$initials+$neighborhood&newwindow=0"
        history.add(originalUrl)

        val context = this
        textView_universityNameBottom.text = "$name ($initials)"

        AppBarTitle.changeAppBarTitle(textView_appName, state)

        webview_search.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                context.url = url
                history.add(url!!)
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
        webview_search.loadUrl(history.first())

        imageView_ublogo.setOnClickListener {
            intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }

        lightDicas.setOnClickListener {
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (url == originalUrl) {
            System.gc()
            clearApplicationData(cacheDir)
            super.onBackPressed()
        } else {
            history.remove(history.last())
            webview_search.loadUrl(history.last())
            webview_search.copyBackForwardList()
            return
        }
    }
}
