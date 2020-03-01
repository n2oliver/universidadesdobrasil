package com.universidadesdobrasil.presentation.states

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.universidadesdobrasil.BuildConfig
import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.StorageManager.Companion.clearApplicationData
import com.universidadesdobrasil.data.repositories.StateRepository
import com.universidadesdobrasil.presentation.tips.TipsActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_main.*


class StatesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(applicationContext)
        if(BuildConfig.DEBUG) {
            val testDeviceIds = listOf(getString(R.string.test_device_id))
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
            StatesAdapter(
                this,
                states
            )

        lightDicas.setOnClickListener {
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }
}
