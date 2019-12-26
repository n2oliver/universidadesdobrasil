package com.olivercastilho.universidadesdobrasil.presentation.states

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.repositories.StateRepository
import kotlinx.android.synthetic.main.activity_main.*

class StatesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        finishAffinity()
    }
}
