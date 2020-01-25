package com.olivercastilho.universidadesdobrasil.presentation.states

import android.os.Bundle
import android.provider.UserDictionary.Words.APP_ID
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.adcolony.sdk.AdColony
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.StorageManager.Companion.clearApplicationData
import com.olivercastilho.universidadesdobrasil.data.repositories.StateRepository
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File


class StatesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ZONE_IDS = "2131231234332";
        AdColony.configure(this, APP_ID, ZONE_IDS)

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

        val states = StateRepository.getStates()
        statesList.layoutManager = LinearLayoutManager(this)
        statesList.adapter =
            StatesAdapter(this, states)
    }

    override fun onBackPressed() {
        System.gc()
        clearApplicationData(cacheDir)
        finishAffinity()
    }
}
