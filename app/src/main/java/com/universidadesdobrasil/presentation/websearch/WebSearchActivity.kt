package com.universidadesdobrasil.presentation.websearch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.multidex.BuildConfig
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.universidadesdobrasil.R
import com.universidadesdobrasil.presentation.AppBarTitle
import com.universidadesdobrasil.presentation.states.StatesActivity
import com.universidadesdobrasil.presentation.tips.TipsActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_web_search.*
import kotlinx.android.synthetic.main.universityname.*


class WebSearchActivity : AppCompatActivity() {
    private lateinit var name: String
    private lateinit var initials: String
    private lateinit var city: String
    private lateinit var state: String
    private lateinit var stateInitials: String
    private lateinit var originalUrl: String
    private lateinit var neighborhood: String

    companion object {
        var history: ArrayList<String> = arrayListOf()
        var progressHorizontal: ProgressBar? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_search)

        MobileAds.initialize(applicationContext)
        if (BuildConfig.DEBUG) {
            val testDeviceIds = listOf(getString(R.string.test_device_id))
            val configuration =
                RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
            MobileAds.setRequestConfiguration(configuration)
        }
        val adRequest = AdRequest.Builder()
            .build()
        adView.loadAd(adRequest)

        name = intent.getStringExtra("name") ?: ""
        initials = intent.getStringExtra("initials") ?: ""
        neighborhood = intent.getStringExtra("neighborhood")

        var search = name

        if(initials != "-" && initials != ""){
            search = initials
            val universityDescription = "$name ($initials)"
            textView_universityDescription.text = universityDescription
        }

        city = intent.getStringExtra("city") ?: ""
        state = intent.getStringExtra("state") ?: ""
        stateInitials = intent.getStringExtra("stateInitials") ?: ""

        originalUrl = "https://www.google.com.br/search?q=$search+$neighborhood+$state+$stateInitials&newwindow=0"
        history.add(originalUrl)


        AppBarTitle.changeAppBarTitle(textView_appName, state)

        webview_search.webViewClient = AppWebViewClients()
            .appWebViewClients(progress_horizontal)
        webview_search.settings.javaScriptEnabled = true
        webview_search.settings.setAppCacheEnabled(false)
        webview_search.loadUrl(history.last())

        imageView_ublogo.setOnClickListener {
            clearNavigation()
            intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }

        lightDicas.setOnClickListener {
            clearNavigation()
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }

        universityname.setOnClickListener {
            history.clear()
            history.add(originalUrl)
            webview_search.loadUrl(history.first())
        }
    }

    private fun clearNavigation() {
        history.clear()
        System.gc()
    }

    override fun onBackPressed() {
        if (history.isNotEmpty()) {
            history.remove(
                history.last())

            if (history.isNotEmpty()) {
                webview_search.loadUrl(history.last())
                webview_search.copyBackForwardList()
                return
            } else {
                super.onBackPressed()
            }
        }
    }

    override fun onDestroy() {
        clearNavigation()
        super.onDestroy()
    }

    class AppWebViewClients : WebViewClient() {
        private var progressBar: ProgressBar? =
            progressHorizontal
        fun appWebViewClients(progressBar: ProgressBar): WebViewClient {
            this.progressBar = progressBar
            progressBar.visibility = View.VISIBLE
            return this
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
            history.add(url!!)
            appWebViewClients(this.progressBar!!)
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        webview_search.saveState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        webview_search.restoreState(savedInstanceState)
    }
}
