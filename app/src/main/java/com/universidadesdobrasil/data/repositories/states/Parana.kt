package com.universidadesdobrasil.data.repositories.states

class Parana {
    companion object {
        val universities = ParanaI.universities.plus(
            ParanaII.universities
        )
    }
}