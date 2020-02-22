package com.olivercastilho.universidadesdobrasil.data.repositories

import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.State

class StateRepository {
    companion object States {
        val acre = State(
            "Acre",
            157507,
            R.drawable.ac,
            5.89,
            "AC",
            true
        )
        val alagoas = State(
            "Alagoas",
            118662,
            R.drawable.al,
            4.66,
            "AL",
            true
        )
        val amapa = State(
            "Amapá",
            36782,
            R.drawable.ap,
            6.98,
            "AP",
            true
        )
        val amazonas = State(
            "Amazonas",
            145181,
            R.drawable.am,
            5.32,
            "AM",
            true
        )
        val bahia = State(
            "Bahia",
            531058,
            R.drawable.ba,
            4.51,
            "BA",
            true
        )
        val ceara = State(
            "Ceará",
            352702,
            R.drawable.ce,
            4.96,
            "CE",
            true
        )
        val distritoFederal = State(
            "Distrito Federal",
            381333,
            R.drawable.df,
            17.49,
            "DF",
            true
        )
        val espiritoSanto = State(
            "Espírito Santo",
            250811,
            R.drawable.es,
            8.34,
            "ES",
            true
        )
        val goias = State(
            "Goiás",
            394368,
            R.drawable.go,
            7.75,
            "GO",
            true
        )
        val maranhao = State(
            "Maranhão",
            187446,
            R.drawable.ma,
            3.56,
            "MA",
            true
        )
        val matoGrosso = State(
            "Mato Grosso",
            194063,
            R.drawable.mt,
            7.65,
            "MT",
            true
        )
        val matoGrossoDoSul = State(
            "Mato Grosso do Sul",
            182536,
            R.drawable.ms,
            8.86,
            "MS",
            true
        )
        val minasGerais = State(
            "Minas Gerais",
            1342592,
            R.drawable.mg,
            7.95,
            "MG",
            true
        )
        val para = State(
            "Pará",
            246184,
            R.drawable.pa,
            4.06,
            "PA",
            true
        )
        val paraiba = State(
            "Paraíba",
            180505,
            R.drawable.pb,
            5.71,
            "PB",
            true
        )
        val parana = State(
            "Paraná",
            869935,
            R.drawable.pr,
            9.71,
            "PR",
            true
        )
        val pernambuco = State(
            "Pernambuco",
            418125,
            R.drawable.pe,
            5.67,
            "PE",
            true
        )
        val piaui = State(
            "Piauí",
            132437,
            R.drawable.pi,
            5.10,
            "PI",
            true
        )
        val rioDeJaneiro = State(
            "Rio de Janeiro",
            1517272,
            R.drawable.rj,
            10.91,
            "RJ",
            true
        )
        val rioGrandeDoNorte = State(
            "Rio Grande do Norte",
            33489,
            R.drawable.rn,
            5.89,
            "RN",
            true
        )
        val rioGrandeDoSul = State(
            "Rio Grande do Sul",
            808995,
            R.drawable.rs,
            8.67,
            "RS",
            true
        )
        val rondonia = State(
            "Rondônia",
            73297,
            R.drawable.ro,
            5.66,
            "RO",
            true
        )
        val roraima = State(
            "Roraima",
            23758,
            R.drawable.rr,
            6.72,
            "RR",
            true
        )
        val santaCatarina = State(
            "Santa Catarina",
            523932,
            R.drawable.sc,
            9.69,
            "SC",
            true
        )
        val saoPaulo = State(
            "São Paulo",
            4169297,
            R.drawable.sp,
            11.67,
            "SP",
            true
        )
        val sergipe = State(
            "Sergipe",
            23758,
            R.drawable.se,
            6.00,
            "SE",
            true
        )
        val tocantins = State(
            "Tocantins",
            79660,
            R.drawable.to,
            7.05,
            "TO",
            true
        )

        fun getStates(): List<State> {
            return listOf(
                acre,
                alagoas,
                amapa,
                amazonas,
                bahia,
                ceara,
                distritoFederal,
                goias,
                espiritoSanto,
                maranhao,
                matoGrosso,
                matoGrossoDoSul,
                minasGerais,
                para,
                parana,
                paraiba,
                pernambuco,
                piaui,
                rioDeJaneiro,
                rioGrandeDoNorte,
                rioGrandeDoSul,
                rondonia,
                roraima,
                santaCatarina,
                saoPaulo,
                sergipe,
                tocantins
            )
        }
    }
}