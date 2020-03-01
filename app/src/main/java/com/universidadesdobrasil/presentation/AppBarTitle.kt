package com.universidadesdobrasil.presentation

import android.widget.TextView
import com.universidadesdobrasil.data.repositories.StateRepository

class AppBarTitle {
    companion object {
        fun changeAppBarTitle(view: TextView, state: String?) {
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
            val universityState = "Universidades\n$of $state"
            view.text = universityState
        }
    }
}