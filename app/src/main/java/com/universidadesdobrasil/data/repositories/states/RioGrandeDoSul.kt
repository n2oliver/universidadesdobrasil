package com.universidadesdobrasil.data.repositories.states
import com.universidadesdobrasil.data.models.University

class RioGrandeDoSul {
    companion object {
        val universities = RioGrandeDoSulI.universities.plus(
            RioGrandeDoSulII.universities
        )
    }
}