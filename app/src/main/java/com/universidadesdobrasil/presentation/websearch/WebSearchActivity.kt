package com.universidadesdobrasil.presentation.websearch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
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
    private lateinit var neighborhood: String
    private lateinit var city: String
    private lateinit var state: String
    private lateinit var stateInitials: String
    private lateinit var originalUrl: String

    companion object {
        var history: ArrayList<String> = arrayListOf()
        var progressHorizontal: ProgressBar? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_search)

        lightDicas.visibility = View.GONE
        imageView_shareButton.visibility = View.VISIBLE

        imageView_shareButton.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND;
            intent.type = "text/plain";
            intent.putExtra(Intent.EXTRA_TEXT, history.last());
            startActivity(Intent.createChooser(intent, "Share"));
        }

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
        stateInitials = intent.getStringExtra("stateInitials") ?: ""
        neighborhood = intent.getStringExtra("neighborhood") ?: ""
        city = intent.getStringExtra("city") ?: ""
        state = intent.getStringExtra("state") ?: ""

        city = intent.getStringExtra("city") ?: ""

        var universityDescription = ""
        if(initials != "-") {
            universityDescription +=  "$initials, "
        } else {
            universityDescription +=  "$name, $neighborhood, $state - "
        }
        universityDescription += " $city"

        originalUrl = "https://www.google.com.br/search?q=$universityDescription&newwindow=0"
        history.add(originalUrl)


        AppBarTitle.changeAppBarTitle(textView_appName, state)
        textView_universityDescription.text = universityDescription

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

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            appWebViewClients(this.progressBar!!)
            if (url.startsWith("http://") || url.startsWith("https://"))
                return when {
                    url.contains("https://maps.google.com") -> {
                        val i = Intent(Intent.ACTION_VIEW)
                        i.data = Uri.parse(url)
                        startActivity(view.context, i, null)
                        true
                    }
                    url.contains("https://m.youtube.com/") -> {
                        val i = Intent(Intent.ACTION_VIEW)
                        i.data = Uri.parse(url)
                        startActivity(view.context, i, null)
                        true
                    }
                    else -> {
                        history.add(url)
                        false
                    }
                }

            return try {
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(view.context, i, null)
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
