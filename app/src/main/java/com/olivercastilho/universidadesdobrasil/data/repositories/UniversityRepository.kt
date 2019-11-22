package com.olivercastilho.universidadesdobrasil.data.repositories

import com.olivercastilho.universidadesdobrasil.data.models.University

class UniversityRepository {

    companion object Universities {
        val university = mapOf(
            StateRepository.acre.name to mapOf(
                549 to University("UNIVERSIDADE FEDERAL DO ACRE", "UFAC", "4071106000137", "RIO BRANCO","Pública", "Federal","69915900", "Distrito Industrial", "(68) 3901 2571", "www.ufac.br", "reitoria@ufac.br"),
                1226 to University("INSTITUTO DE ENSINO SUPERIOR DO ACRE", "IESACRE", "1115444000135","RIO BRANCO", "Privada", "Privada", "69915900", "José Augusto", "(68) 3302 7058", "www.uninorteac.edu.br/", "marco.brandao@uninorteac.com.br / dacicleudo.silva@uninorteac.com.br"),
                2072 to University("FACULDADE DE DESENVOLVIMENTO SUSTENTÁVEL DE CRUZEIRO DO SUL", "IEVAL", "4137969000160", "CRUZEIRO DO SUL", "Privada", "Privada", "69980000", "Boca da Alemanha", "(68) 3311-1500 / (68) 3311-1512", "www.avec.br/ieval/site/","ieval@avec.br / avec@avec.br")
            ),
            StateRepository.alagoas.name to mapOf(
                32 to University("UNIVERSIDADE ESTADUAL DE CIÊNCIAS DA SAÚDE DE ALAGOAS - UNCISAL", "UNCISAL", "12517793000108", "MACEIO", "Pública", "Estadual", "57010300", "Trapiche da Barra", "(82) 33156705 / (82) 33156702", "", "pesquisadoruncisal@gmail.com")
            ),
            StateRepository.amazonas.name to mapOf(
                4 to University("UNIVERSIDADE FEDERAL DO AMAZONAS", "UFAM", "4378626000197", "MANAUS", "Pública", "Federal", "69077000", "Coroado", "(92) 3305-4513 / (92) 3305-4532", "www.ufam.edu.br", "gabinete@ufam.edu.br")
            ),
            StateRepository.amapa.name to mapOf(
                15522 to University("INSTITUTO FEDERAL DE EDUCAÇÃO CIÊNCIA E TECNOLOGIA DE ALAGOAS", "IFAP", "10820882000195", "MACAPA", "Pública", "Federal", "68908198", "Julião Ramos", "(92)  32372214", "www.ifap.edu.br\n", "reitoria@ifap.edu.br")
            ),
            StateRepository.bahia.name to mapOf(
                24 to University("UNIVERSIDADE ESTADUAL DE SANTA CRUZ", "UESC", "40738999000195", "ILHEUS", "Pública", "Estadual", "45662900", "Salobrinho", "(73) 3680 5311", "www.uesc.br", "reitoria@uesc.br")
            )
        )


        fun getStates(state: String): Map<Int, University>? {
            return  university.getValue(state)
        }
    }
}