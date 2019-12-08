package com.olivercastilho.universidadesdobrasil.data.repositories

import com.olivercastilho.universidadesdobrasil.data.repositories.states.*

class UniversityRepository {
    companion object {
        val university = mapOf(
            StateRepository.acre.name to Acre.universities,

            StateRepository.alagoas.name to Alagoas.universities,

            StateRepository.amazonas.name to Amazonas.universities,

            StateRepository.amapa.name to Amapa.universities,

            StateRepository.bahia.name to Bahia.universities,

            StateRepository.ceara.name to Ceara.universities,

            StateRepository.distritoFederal.name to DistritoFederal.universities,

            StateRepository.espiritoSanto.name to EspiritoSanto.universities,

            StateRepository.goias.name to Goias.universities,

            StateRepository.maranhao.name to Maranhao.universities,

            StateRepository.minasGerais.name to MinasGerais.universities,

            StateRepository.matoGrossoDoSul.name to MatoGrossoDoSul.universities,

            StateRepository.matoGrosso.name to MatoGrosso.universities,

            StateRepository.para.name to Para.universities,

            StateRepository.paraiba.name to Paraiba.universities,

            StateRepository.pernambuco.name to Pernambuco.universities,

            StateRepository.piaui.name to Piaui.universities,

            StateRepository.parana.name to Parana.universities,

            StateRepository.rioDeJaneiro.name to RioDeJaneiro.universities,

            StateRepository.rioGrandeDoNorte.name to RioGrandeDoNorte.universities,

            StateRepository.rondonia.name to Rondonia.universities,

            StateRepository.roraima.name to Roraima.universities,

            StateRepository.rioGrandeDoSul.name to RioGrandeDoSul.universities,

            StateRepository.santaCatarina.name to SantaCatarina.universities,

            StateRepository.sergipe.name to Sergipe.universities,

            StateRepository.saoPaulo.name to SaoPaulo.universities,

            StateRepository.tocantins.name to Tocantins.universities
        )
    }

}