package com.olivercastilho.universidadesdobrasil.presentation.universities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.University
import com.olivercastilho.universidadesdobrasil.data.repositories.StateRepository
import com.olivercastilho.universidadesdobrasil.data.repositories.UniversityRepository
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_universities.*


class UniversitiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universities)

        MobileAds.initialize(this)

        val adRequest  = AdRequest.Builder()
            .build()
        adView.loadAd(adRequest)

        val state = intent.getStringExtra("state")
        val stateInitials = intent.getStringExtra("stateInitials")

        var of = "do"
        if(
            state == StateRepository.saoPaulo.name ||
            state == StateRepository.santaCatarina.name ||
            state == StateRepository.minasGerais.name ||
            state == StateRepository.goias.name ||
            state == StateRepository.roraima.name ||
            state == StateRepository.sergipe.name ||
            state == StateRepository.pernambuco.name ||
            state == StateRepository.rondonia.name ||
            state == StateRepository.alagoas.name
        ) {
            of = "de"
        } else if(
            state == StateRepository.paraiba.name ||
            state == StateRepository.bahia.name
        ){
            of = "da"
        }
        textView_appName.text = "Universidades\n$of $state"
        val universities = ArrayList<University>((UniversityRepository.university[state] ?: error("Cannot fetch all universities")).values)

        universitiesList.layoutManager = LinearLayoutManager(this)
        universitiesList.adapter =
            UniversitiesAdapter(this, universities, stateInitials)
    }
}
