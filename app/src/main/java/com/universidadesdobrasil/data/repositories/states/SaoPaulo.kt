package com.universidadesdobrasil.data.repositories.states

class SaoPaulo {
    companion object {
        val universities = SaoPauloI.universities.plus(
            SaoPauloII.universities
        ).plus(SaoPauloIII.universities).plus(
            SaoPauloIV.universities
        )
    }
}