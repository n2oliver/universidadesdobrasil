package com.olivercastilho.universidadesdobrasil.data.repositories

import com.olivercastilho.universidadesdobrasil.data.models.University

class UniversityRepository {

    companion object Universities {
        val university = mapOf(
            StateRepository.acre.name to mapOf(
                549 to University("UNIVERSIDADE FEDERAL DO ACRE", "UFAC", "4071106000137", "RIO BRANCO","Pública", "Federal","69915900", "Distrito Industrial", "(68) 3901-2571", "www.ufac.br", "reitoria@ufac.br"),
                1226 to University("INSTITUTO DE ENSINO SUPERIOR DO ACRE", "IESACRE", "1115444000135","RIO BRANCO", "Privada", "Privada", "69915900", "José Augusto", "(68) 3302-7058", "www.uninorteac.edu.br/", "marco.brandao@uninorteac.com.br / dacicleudo.silva@uninorteac.com.br"),
                2072 to University("FACULDADE DE DESENVOLVIMENTO SUSTENTÁVEL DE CRUZEIRO DO SUL", "IEVAL", "4137969000160", "CRUZEIRO DO SUL", "Privada", "Privada", "69980000", "Boca da Alemanha", "(68) 3311-1500 / (68) 3311-1512", "www.avec.br/ieval/site/","ieval@avec.br / avec@avec.br")
            ),
            StateRepository.alagoas.name to mapOf(
                32 to University("UNIVERSIDADE ESTADUAL DE CIÊNCIAS DA SAÚDE DE ALAGOAS - UNCISAL", "UNCISAL", "12517793000108", "MACEIO", "Pública", "Estadual", "57010300", "Trapiche da Barra", "(82) 3315-6705 / (82) 33156702", "", "pesquisadoruncisal@gmail.com")
            ),
            StateRepository.amazonas.name to mapOf(
                4 to University("UNIVERSIDADE FEDERAL DO AMAZONAS", "UFAM", "4378626000197", "MANAUS", "Pública", "Federal", "69077000", "Coroado", "(92) 3305-4513 / (92) 3305-4532", "www.ufam.edu.br", "gabinete@ufam.edu.br")
            ),
            StateRepository.amapa.name to mapOf(
                15522 to University("INSTITUTO FEDERAL DE EDUCAÇÃO CIÊNCIA E TECNOLOGIA DE ALAGOAS", "IFAP", "10820882000195", "MACAPA", "Pública", "Federal", "68908198", "Julião Ramos", "(92)  3237-2214", "www.ifap.edu.br\n", "reitoria@ifap.edu.br")
            ),
            StateRepository.bahia.name to mapOf(
                24 to University("UNIVERSIDADE ESTADUAL DE SANTA CRUZ", "UESC", "40738999000195", "ILHEUS", "Pública", "Estadual", "45662900", "Salobrinho", "(73) 3680-5311", "www.uesc.br", "reitoria@uesc.br")
            ),
            StateRepository.ceara.name to mapOf(
                29 to University("UNIVERSIDADE ESTADUAL DO CEARÁ", "UECE", "7885809000197", "FORTALEZA", "Pública", "Estadual", "60740000","Itaperi", "(85) 3101-9610", "www.uece.br", "ueceprograd@gmail.com")
            ),
            StateRepository.distritoFederal.name to mapOf(
                2 to University("UNIVERSIDADE DE BRASÍLIA",	"UNB",	"38174000143",	"BRASILIA","Pública",	"Federal","70910900", "Asa Norte",	"(61) 3307-1750 / (61) 3307-2600",		"http://www.unb.br", "unb@unb.br")
            ),
            StateRepository.espiritoSanto.name to mapOf(
                78 to University("FACULDADE DE FILOSOFIA CIÊNCIAS E LETRAS DE ALEGRE", "FAFIA", "27174101000135", "ALEGRE", "Pública", "Municipal", "29500000", "Centro", "", "http://www.fafia.edu.br", "fafia@fafia.edu.br")
            ),
            StateRepository.goias.name to mapOf(
                47 to University("UNIVERSIDADE ESTADUAL DE GOIÁS", "UEG", "1112580000171", "ANAPOLIS", "Pública", "Estadual", "75000000", "Zona Rural", "(62) 3328-1178", "www.ueg.br", "reitoria@ueg.br")
            ),
            StateRepository.maranhao.name to mapOf(
                548 to University("UNIVERSIDADE FEDERAL DO MARANHÃO", "UFMA", "6279103000119", "SAO LUIS", "Pública", "Federal", "64800000", "Bacanga", "(98) 3301-8004 / (98) 3301-8003", "www.ufma.br", "aldir@ufma.br")
            ),
            StateRepository.minasGerais.name to mapOf(
                6 to University("UNIVERSIDADE FEDERAL DE OURO PRETO", "UFOP", "23070659000110", "OURO PRETO", "Pública", "Federal", "35400000", "Centro", "(31) 3559-1218", "www.ufop.br", "reitoria@ufop.br")
            ),
            StateRepository.matoGrossoDoSul.name to mapOf(
                12748 to University("FACULDADE DE EDUCAÇÃO TECNOLOGIA E ADMINISTRAÇÃO DE CAARAPÓ", "FETAC", "5298778000142", "CAARAPO", "Privada", "Privada", "79940000","Centro", "(67) 3453-1122", "(67) 3453-1122 / (67) 3453-1123", "nelsonposseti@uol.com.br")
            ),
            StateRepository.matoGrosso.name to mapOf(
                1305 to University("FACULDADE DE CIÊNCIAS JURÍDICAS GERENCIAIS E EDUCAÇÃO DE SINOP", "FIS", "33005265000131", "SINOP", "Privada", "Privada", "78550000", "Setor Industrial", "(66) 3531-0916 / (66) 3531-1000", "www.unic.br/sinop", "ddi@kroton.com.br / adelinon@kroton.com.br")
            ),
            StateRepository.para.name to mapOf(
                38 to University("UNIVERSIDADE DO ESTADO DO PARÁ", "UEPA", "34860833000144", "BELEM", "Pública", "Estadual", "66113070", "Telégrafo", "(91)3244-8957 / (91) 3299-2200 / (91) 3299-2207", "www.uepa.br", "reitora@uepa.br / densino@uepa.br")
            )
        )
    }
}