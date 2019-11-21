package com.olivercastilho.universidadesdobrasil.data.repositories

import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.State
import com.olivercastilho.universidadesdobrasil.data.models.University

class StateRepository {
    companion object States {
        val acre = State(
            "Acre",
            157507,
            R.drawable.ac,
            5.89
        )
        val alagoas = State(
            "Alagoas",
            118662,
            R.drawable.al,
            4.66
        )
        val amapa = State(
            "Amapá",
            36782,
            R.drawable.ap,
            6.98
        )
        val amazonas = State(
            "Amazonas",
            145181,
            R.drawable.am,
            5.32
        )
        val bahia = State(
            "Bahia",
            531058,
            R.drawable.ba,
            4.51
        )
        val ceara = State(
            "Ceará",
            352702,
            R.drawable.ce,
            4.96
        )
        val distritoFederal = State(
            "Distrito Federal",
            381333,
            R.drawable.df,
            17.49
        )
        val espiritoSanto = State(
            "Espírito Santo",
            250811,
            R.drawable.es,
            8.34
        )
        val goias = State(
            "Goiás",
            394368,
            R.drawable.go,
            7.75
        )
        val maranhao = State(
            "Pará",
            187446,
            R.drawable.ma,
            3.56
        )
        val matoGrosso = State(
            "Mato Grosso",
            194063,
            R.drawable.mt,
            7.65
        )
        val matoGrossoDoSul = State(
            "Mato Grosso do Sul",
            182536,
            R.drawable.ms,
            8.86
        )
        val minasGerais = State(
            "Minas Gerais",
            1342592,
            R.drawable.mg,
            7.95
        )
        val para = State(
            "Pará",
            246184,
            R.drawable.pa,
            4.06
        )
        val paraiba = State(
            "Paraíba",
            180505,
            R.drawable.pb,
            5.71
        )
        val parana = State(
            "Paraná",
            869935,
            R.drawable.pr,
            9.71
        )
        val pernambuco = State(
            "Pernambuco",
            418125,
            R.drawable.pe,
            5.67
        )
        val piaui = State(
            "Piauí",
            132437,
            R.drawable.pi,
            5.10
        )
        val rioDeJaneiro = State(
            "Rio de Janeiro",
            1517272,
            R.drawable.rj,
            10.91
        )
        val rioGrandeDoNorte = State(
            "Rio Grande do Norte",
            33489,
            R.drawable.rn,
            5.89
        )
        val rioGrandeDoSul = State(
            "Rio Grande do Sul",
            808995,
            R.drawable.rs,
            8.67
        )
        val rondonia = State(
            "Rondônia",
            73297,
            R.drawable.ro,
            5.66
        )
        val roraima = State(
            "Roraima",
            23758,
            R.drawable.rr,
            6.72
        )
        val santaCatarina = State(
            "Santa Catarina",
            523932,
            R.drawable.sc,
            9.69
        )
        val saoPaulo = State(
            "São Paulo",
            4169297,
            R.drawable.sp,
            11.67
        )
        val sergipe = State(
            "Sergipe",
            23758,
            R.drawable.se,
            6.00
        )
        val tocantins = State(
            "Tocantins",
            79660,
            R.drawable.to,
            7.05
        )

        val byState = mapOf(
            acre.name to mapOf(
                "UNIVERSIDADE FEDERAL DO ACRE" to University(
                    "UNIVERSIDADE FEDERAL DO ACRE"
                ),
                "INSTITUTO DE ENSINO SUPERIOR DO ACRE" to University(
                    "INSTITUTO DE ENSINO SUPERIOR DO ACRE"
                )
                )
        )

        fun getUniversitiesByState(state: String): Map<String, University>? {
            return byState[state]
        }
    }
}