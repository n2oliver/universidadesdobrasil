package com.universidadesdobrasil.presentation.tips

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import com.facebook.ads.AdSize
import com.facebook.ads.AdView
import com.facebook.ads.AudienceNetworkAds
import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.models.Step
import com.universidadesdobrasil.data.repositories.TipsRepository
import com.universidadesdobrasil.presentation.states.StatesActivity
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_tips.*

class TipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        AudienceNetworkAds.initialize(this);
        val adView = AdView(this, getString(R.string.PLACEMENT_ID), AdSize.BANNER_HEIGHT_50)
        banner_container.addView(adView)
        adView.loadAd()

        if(intent.getStringExtra("tip_title") != "" && intent.getSerializableExtra("tip_steps") != null) {
            var tips = intent.getSerializableExtra("tip_steps")
            textView_title.text = intent.getStringExtra("tip_title")
            tipsList.adapter =
                StepsAdapter(
                    this,
                    tips as ArrayList<Step>
                )
            lightDicas.setOnClickListener {
                intent = Intent(this, TipsActivity::class.java)
                startActivity(intent)
            }
        } else {
            var tips = TipsRepository.all
            tipsList.adapter =
                TipsAdapter(
                    this,
                    tips
                )
        }
        tipsList.layoutManager = LinearLayoutManager(this, HORIZONTAL, false)

        imageView_ublogo.setOnClickListener {
            intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }
    }
}
