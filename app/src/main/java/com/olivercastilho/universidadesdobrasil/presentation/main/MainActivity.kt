package com.olivercastilho.universidadesdobrasil.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.repositories.StateRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val states = listOf(
            StateRepository.distritoFederal,
            StateRepository.saoPaulo,
            StateRepository.rioDeJaneiro,
            StateRepository.parana,
            StateRepository.santaCatarina,
            StateRepository.matoGrossoDoSul,
            StateRepository.rioGrandeDoSul,
            StateRepository.espiritoSanto,
            StateRepository.minasGerais,
            StateRepository.goias,
            StateRepository.matoGrosso,
            StateRepository.tocantins,
            StateRepository.amapa,
            StateRepository.roraima,
            StateRepository.sergipe,
            StateRepository.rioGrandeDoNorte,
            StateRepository.acre,
            StateRepository.paraiba,
            StateRepository.pernambuco,
            StateRepository.rondonia,
            StateRepository.amazonas,
            StateRepository.piaui,
            StateRepository.ceara,
            StateRepository.alagoas,
            StateRepository.bahia,
            StateRepository.para,
            StateRepository.maranhao
        )
        statesList.layoutManager = LinearLayoutManager(this)
        statesList.adapter =
            StatesAdapter(this, states)
    }
}
