package com.olivercastilho.universidadesdobrasil.presentation.tips

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.Step
import com.olivercastilho.universidadesdobrasil.data.repositories.TipsRepository
import com.olivercastilho.universidadesdobrasil.presentation.states.StatesActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_tips.*

class TipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

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

        if(intent.getStringExtra("tip_title") != "" && intent.getSerializableExtra("tip_steps") != null) {
            var tips = intent.getSerializableExtra("tip_steps")
            textView_title.text = intent.getStringExtra("tip_title")
            tipsList.adapter = StepsAdapter(this, tips as ArrayList<Step>)
            lightDicas.setOnClickListener {
                intent = Intent(this, TipsActivity::class.java)
                startActivity(intent)
            }
        } else {
            var tips = TipsRepository.all
            tipsList.adapter = TipsAdapter(this, tips)
        }
        tipsList.layoutManager = LinearLayoutManager(this, HORIZONTAL, false)

        imageView_ublogo.setOnClickListener {
            intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }
    }
}
