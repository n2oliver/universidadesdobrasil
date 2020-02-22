package com.olivercastilho.universidadesdobrasil.data.repositories.states

class RioDeJaneiro {
    companion object {
        val universities = RioDeJaneiroI.universities.plus(RioDeJaneiroII.universities)
    }
}