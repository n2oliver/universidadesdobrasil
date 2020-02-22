package com.olivercastilho.universidadesdobrasil.data.repositories.states

class Bahia {
    companion object {
        val universities = BahiaI.universities.plus(BahiaII.universities)
    }
}