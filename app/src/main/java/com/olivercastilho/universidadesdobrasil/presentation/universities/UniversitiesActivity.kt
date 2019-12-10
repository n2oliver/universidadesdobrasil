package com.olivercastilho.universidadesdobrasil.presentation.universities

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.SearchView
import android.widget.SearchView.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.*
import com.olivercastilho.universidadesdobrasil.BuildConfig
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.University
import com.olivercastilho.universidadesdobrasil.data.repositories.StateRepository
import com.olivercastilho.universidadesdobrasil.data.repositories.UniversityRepository
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_universities.*
import java.util.*
import kotlin.collections.ArrayList


class UniversitiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universities)

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
        var universities = ArrayList<University>((UniversityRepository.university[state] ?: error("Cannot fetch all universities")).values)
        findUniversities("", universities, stateInitials)
        searchInput.setOnQueryTextListener (object : OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                findUniversities(newText, universities, stateInitials)
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                // task HERE
                return false
            }

        })
    }

    private fun findUniversities(str: String, universitiesItems: ArrayList<University>, stateInitials: String){
        var universities = universitiesItems
        var universitiesFiltered = arrayListOf<University>()

        val searchString = str.toLowerCase()

        if(searchString != "") {
            universities.forEach {
                if (searchString.toRegex().find(it.initials.toLowerCase()) != null ||
                    searchString.toRegex().find(it.neighborhood.toLowerCase()) != null ||
                    searchString.toRegex().find(it.name.toLowerCase()) != null ||
                    searchString.toRegex().find(it.city.toLowerCase()) != null) {
                    universitiesFiltered.add(it)
                }
            }
            universities = universitiesFiltered
        }

        universitiesList.layoutManager = LinearLayoutManager(this)
        universitiesList.adapter = UniversitiesAdapter(this, universities, stateInitials)
    }
}
