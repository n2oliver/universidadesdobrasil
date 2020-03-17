package com.universidadesdobrasil.presentation.ads

import android.content.Context
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.universidadesdobrasil.BuildConfig
import com.universidadesdobrasil.R

class AdsHelper {
    companion object {
        fun setAds(adView: AdView, context: Context) {
            MobileAds.initialize(context)
            if (BuildConfig.DEBUG) {
                val testDeviceIds = listOf(context.getString(R.string.test_device_id))
                val configuration =
                    RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
                MobileAds.setRequestConfiguration(configuration)
            }
            val adRequest = AdRequest.Builder()
                .build()
            adView.loadAd(adRequest)
        }
    }
}
