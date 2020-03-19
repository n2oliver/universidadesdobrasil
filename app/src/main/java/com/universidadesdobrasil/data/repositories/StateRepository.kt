package com.universidadesdobrasil.data.repositories

import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.models.State

class StateRepository {
    companion object States {
        val acre = State(
            "Acre",
            R.drawable.ac,
            "AC"
        )
        val alagoas = State(
            "Alagoas",
            R.drawable.al,
            "AL"
        )
        val amapa = State(
            "Amapá",
            R.drawable.ap,
            "AP"
        )
        val amazonas = State(
            "Amazonas",
            R.drawable.am,
            "AM"
        )
        val bahia = State(
            "Bahia",
            R.drawable.ba,
            "BA"
        )
        val ceara = State(
            "Ceará",
            R.drawable.ce,
            "CE"
        )
        val distritoFederal = State(
            "Distrito Federal",
            R.drawable.df,
            "DF"
        )
        val espiritoSanto = State(
            "Espírito Santo",
            R.drawable.es,
            "ES"
        )
        val goias = State(
            "Goiás",
            R.drawable.go,
            "GO"
        )
        val maranhao = State(
            "Maranhão",
            R.drawable.ma,
            "MA"
        )
        val matoGrosso = State(
            "Mato Grosso",
            R.drawable.mt,
            "MT"
        )
        val matoGrossoDoSul = State(
            "Mato Grosso do Sul",
            R.drawable.ms,
            "MS"
        )
        val minasGerais = State(
            "Minas Gerais",
            R.drawable.mg,
            "MG"
        )
        val para = State(
            "Pará",
            R.drawable.pa,
            "PA"
        )
        val paraiba = State(
            "Paraíba",
            R.drawable.pb,
            "PB"
        )
        val parana = State(
            "Paraná",
            R.drawable.pr,
            "PR"
        )
        val pernambuco = State(
            "Pernambuco",
            R.drawable.pe,
            "PE"
        )
        val piaui = State(
            "Piauí",
            R.drawable.pi,
            "PI"
        )
        val rioDeJaneiro = State(
            "Rio de Janeiro",
            R.drawable.rj,
            "RJ"
        )
        val rioGrandeDoNorte = State(
            "Rio Grande do Norte",
            R.drawable.rn,
            "RN"
        )
        val rioGrandeDoSul = State(
            "Rio Grande do Sul",
            R.drawable.rs,
            "RS"
        )
        val rondonia = State(
            "Rondônia",
            R.drawable.ro,
            "RO"
        )
        val roraima = State(
            "Roraima",
            R.drawable.rr,
            "RR"
        )
        val santaCatarina = State(
            "Santa Catarina",
            R.drawable.sc,
            "SC"
        )
        val saoPaulo = State(
            "São Paulo",
            R.drawable.sp,
            "SP"
        )
        val sergipe = State(
            "Sergipe",
            R.drawable.se,
            "SE"
        )
        val tocantins = State(
            "Tocantins",
            R.drawable.to,
            "TO"
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