package com.olivercastilho.universidadesdobrasil.presentation.states

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.adcolony.sdk.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.StorageManager.Companion.clearApplicationData
import com.olivercastilho.universidadesdobrasil.data.repositories.StateRepository
import com.olivercastilho.universidadesdobrasil.presentation.tips.TipsActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_main.*


class StatesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ZONE_ID = "vze6584654f648469b9b"
        AdColony.configure(this, "app80b9f52db1fc47dab3", ZONE_ID)
        val listener: AdColonyAdViewListener = object : AdColonyAdViewListener() {
            override fun onRequestFilled(ad: AdColonyAdView) {
                adView.addView(ad)
            }

            override fun onRequestNotFilled(zone: AdColonyZone?) {
                super.onRequestNotFilled(zone)
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
            }
        }

        AdColony.requestAdView(ZONE_ID, listener, AdColonyAdSize.BANNER)

        val states = StateRepository.getStates()
        statesList.layoutManager = LinearLayoutManager(this)
        statesList.adapter =
            StatesAdapter(this, states)

        lightDicas.setOnClickListener {
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        System.gc()
        clearApplicationData(cacheDir)
        finishAffinity()
    }
}
