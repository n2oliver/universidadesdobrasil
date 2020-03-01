package com.universidadesdobrasil.data.repositories.states

class MinasGerais {
    companion object {
        val universities = MinasGeraisI.universities.plus(
            MinasGeraisII.universities
        ).plus(MinasGeraisIII.universities)
    }
}