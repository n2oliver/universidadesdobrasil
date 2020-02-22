package com.olivercastilho.universidadesdobrasil.data.repositories.states
import com.olivercastilho.universidadesdobrasil.data.models.University

class RioGrandeDoSul {
    companion object {
        val universities = RioGrandeDoSulI.universities.plus(RioGrandeDoSulII.universities)
    }
}