package com.olivercastilho.universidadesdobrasil.presentation.websearch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
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
import kotlinx.android.synthetic.main.activity_web_search.*
import kotlinx.android.synthetic.main.cardview_university.*
import kotlinx.android.synthetic.main.universityname.*


class WebSearchActivity : AppCompatActivity() {
    private lateinit var name: String
    private lateinit var initials: String
    private lateinit var city: String
    private lateinit var state: String
    private lateinit var neighborhood: String
    private lateinit var originalUrl: String
    private var url: String? = null

    companion object {
        var history: ArrayList<String> = arrayListOf()
        var progressHorizontal: ProgressBar? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_search)

        MobileAds.initialize(applicationContext)
        if (BuildConfig.DEBUG) {
            val testDeviceIds = listOf(getString(R.string.test_devive_id))
            val configuration =
                RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
            MobileAds.setRequestConfiguration(configuration)
        }
        val adRequest = AdRequest.Builder()
            .build()
        adView.loadAd(adRequest)

        name = intent.getStringExtra("name") ?: ""
        initials = intent.getStringExtra("initials") ?: ""
        city = intent.getStringExtra("city") ?: ""
        state = intent.getStringExtra("state") ?: ""
        neighborhood = intent.getStringExtra("neighborhood") ?: ""

        originalUrl = "https://www.google.com.br/search?q=$name+$initials+$city+$neighborhood&newwindow=0"
        history.add(originalUrl)

        val context = this
        textView_universityNameBottom.text = "$name ($initials)"

        AppBarTitle.changeAppBarTitle(textView_appName, state)

        webview_search.webViewClient = AppWebViewClients().AppWebViewClients(progress_horizontal)
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
        history.remove(history.last())
        if (history.isNotEmpty()) {
            webview_search.loadUrl(history.last())
            webview_search.copyBackForwardList()
            return
        } else {
            System.gc()
            clearApplicationData(cacheDir)
            super.onBackPressed()
        }
    }


    class AppWebViewClients : WebViewClient() {
        private var progressBar: ProgressBar? = progressHorizontal
        fun AppWebViewClients(progressBar: ProgressBar): WebViewClient {
            this.progressBar = progressBar
            progressBar.visibility = View.VISIBLE
            return this
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
            history.add(url!!)
            AppWebViewClients(this.progressBar!!)
            if (url == null || url.startsWith("http://") || url.startsWith("https://"))
                return false

            return try {
                view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                true
            } catch (e: Exception) {
                true
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            progressBar!!.visibility = View.GONE
        }
    }
}
