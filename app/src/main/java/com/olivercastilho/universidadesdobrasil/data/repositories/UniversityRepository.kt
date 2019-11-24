package com.olivercastilho.universidadesdobrasil.data.repositories

import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.University

class UniversityRepository {

    companion object Universities {
        val university = mapOf(
            StateRepository.acre.name to mapOf(
                549 to University("UNIVERSIDADE FEDERAL DO ACRE", "UFAC", "4071106000137", "RIO BRANCO","Pública", "Federal","69915900", "Distrito Industrial", "(68) 3901-2571", "www.ufac.br", "reitoria@ufac.br", null),
                1226 to University("INSTITUTO DE ENSINO SUPERIOR DO ACRE", "IESACRE", "1115444000135","RIO BRANCO", "Privada", "Privada", "69915900", "José Augusto", "(68) 3302-7058", "www.uninorteac.edu.br/", "marco.brandao@uninorteac.com.br / dacicleudo.silva@uninorteac.com.br", null),
                2072 to University("FACULDADE DE DESENVOLVIMENTO SUSTENTÁVEL DE CRUZEIRO DO SUL", "IEVAL", "4137969000160", "CRUZEIRO DO SUL", "Privada", "Privada", "69980000", "Boca da Alemanha", "(68) 3311-1500 / (68) 3311-1512", "www.avec.br/ieval/site/","ieval@avec.br / avec@avec.br", null),
                2132 to University("FACULDADE BARÃO DO RIO BRANCO",	"FAB",	"4515940000174",	"RIO BRANCO", "Privada", "Privada",	"69911900", "Jardim Europa II",	"(68) 3213-7070 /	(68) 3213 7081",	"uninorteac.com.br", "marco.brandao@uninorteac.com.br / dacicleudo.silva@uninorteac.com.br"	, null),
                2146 to University("FACULDADE DO ACRE",	"FAC",	"4515940000174",	"RIO BRANCO", "Privada", "Privada", "69911900",	"Jardim Europa II",	"(68) 3213-7070 / (68) 3213 7081",	"uninorteac.edu.br", "marco.brandao@uninorteac.com.br / dacicleudo.silva@uninorteac.com.br", null),
                2343 to University("FACULDADE DA AMAZÔNIA OCIDENTAL",	"FAAO",	"3294357000118", "RIO BRANCO", "Privada",	"Privada", "69911845","Jardim Primavera",	"(68) 2106-8235 /	(68) 2106-8250",	"www.faao.com.br", "valdecirsimao@yahoo.com.br", null),
                2613 to University("Faculdade Meta",	"FAMETA",	"4952095000102",	"RIO BRANCO", "Privada", "Privada", "69907170", "Abrahao Alab", "(68) 3226-1501 / (69) 8112-7866	/ (69)3451- 4200 / (68)3226-1501",	"www.fameta.edu.br", "desin@athenaseducacional.com.br", null),
                3587 to University("FACULDADE DIOCESANA SÃO JOSÉ",	"FADISI",	"529443000174",	"RIO BRANCO",	"Privada", "Privada", "69909021", "Vitória", "(68) 9238-9961", "www.fadisiacre.com", "fadisi.acre@hotmail.com", null),
                3675 to University("SINAL - FACULDADE DE TEOLOGIA E FILOSOFIA", "SINAL",	"4143659000158",	"RIO BRANCO", "Privada",	"Privada",	"69907000", "Abrahão Alab",	"(68) 3221-6781 /	(68) 3221-6781",	"www.sinalacre.edu.br", "sinalfaculdade@yahoo.com.br / assisprof@yahoo.com.br / sarah_cs77@yahoo.com.br", null),
                4836 to University("FACULDADE DE EDUCAÇÃO  ACREANO EUCLIDES DA CUNHA",	"INEC",	"3397208000184",	"RIO BRANCO",	"Privada", "Privada","69900000", "Aviário", "(68) 3224-7395",		"", "caa.souza@uol.com.br", null),
                15507 to University("Instituto Federal de Educação Ciência e Tecnologia do Acre",	"IFAC",	"10918674000123",	"RIO BRANCO",	"Pública",	"Federal",	"69914610", "Vila Ivonete",	"(68) 8423-7918 / (68)3223-8298",	"www.ifac.edu.br", "degmar.anjos@ifac.edu.br", null)
            ),

            StateRepository.alagoas.name to mapOf(
                32 to University("UNIVERSIDADE ESTADUAL DE CIÊNCIAS DA SAÚDE DE ALAGOAS - UNCISAL", "UNCISAL", "12517793000108", "MACEIO", "Pública", "Estadual", "57010300", "Trapiche da Barra", "(82) 3315-6705 / (82) 33156702", "", "pesquisadoruncisal@gmail.com", null),
                88 to University("FACULDADE DE FORMAÇÃO DE PROFESSORES DE PENEDO", "FFPP",	"12432605000130",	"PENEDO",	"Privada", "Privada",	"57200000",	"Centro",	"(82)3551-2780 / (82)3551-2161 / (82) 3551-2694", "www.frm.edu.br/penedo", "sec.frm.penedo@hotmail.com", null),
                577 to University("UNIVERSIDADE FEDERAL DE ALAGOAS",	"UFAL",	"24464109000148", "MACEIO",	"Pública",	"Federal",	"57072970",	"TABULEIRO DO MARTINS",	"(82) 3214-1006 /	(82) 3214 1700",	"www.ufal.edu.br", "gr@reitoria.ufal.br", null),
                621 to University("CENTRO DE ESTUDOS SUPERIORES DE MACEIÓ",	"CESMAC",	"12207742000171", "MACEIO", "Privada",	"Privada",	"57051160",	"Farol",	"(82) 3215-5205 / (82) 3221-0402",	"www.fejal.com.br", "joaosampaio@fejal.com.br", null),
                908 to University("FACULDADE ALAGOANA DE ADMINISTRAÇÃO", "FAA", "11918109000129", "MACEIO", "Privada", "Privada",	"57035550","Jatiuca", "(82) 304-5200", "", "marcioacbarro@yahoo.com.br", null),
                1051 to University("FACULDADE DE CIÊNCIAS CONTÁBEIS - MACEIÓ",	"SEUNE",	"1280666000103", "MACEIO",	"Privada",	"Privada", "57051190", "FAROL", "(82) 3336-2640 / (82)  3236 2709",	"www.seune.edu.br", "seune@seune.edu.br", null),
                1298 to University("Faculdade Estácio de Alagoas - Estácio FAL",	"FAL",	"2608755000107",	"MACEIO",	"Privada",	"Privada","57035560",	"Jatiúca",	"(82) 3214-6800 /	(82) 2123 2059",	"", "fal@fal.br	/ cgfalal@gmail.com", null),
                1504 to University("FACULDADE MAURÍCIO DE NASSAU DE MACEIÓ", "UNINASSAU",		"7991012000174", "MACEIO",	"Privada", "Privada", "57035230", "Ponta Verde",	"(82) 3036-2299 /	(82) 3036-2299", "www.mauriciodenassau.edu.br", "emec@sereducacional.com", null),
                1637 to University("FACULDADE DE CIÊNCIAS JURÍDICAS E SOCIAIS DE MACEIÓ",	"FAMA",	"3475871000150",	"MACEIO",	"Privada",	"Privada", "57020020",	"Centro",	"(82) 3336-9700",		"https://famaalagoas.edu.br/", "luit@uol.com.br / dir.academica@fama-al.com.br", null),
                1956 to University("INSTITUTO BATISTA DE ENSINO SUPERIOR DE ALAGOAS",	"IBESA",	"12320966000195",	"MACEIO",	"Privada",	"Privada", "57021090",	"Farol", "(82) 3215-2744 / (82) 3326-1823",	"www.ibesa.com.br", "laercioguerra.melo@gmail.com", null),
                1965 to University("FACULDADE DE TECNOLOGIA DE ALAGOAS",	"FAT/AL",	"1073457000199",	"MACEIO",	"Privada", "Privada",	"57045150",	"Serraria",	"(82) 3328-7000 / (82) 3214-7700 / (82) 3328-7000 (82) 3214-7700", "www.fat-al.edu.br","maceju@uol.com.br"	, null),
                2042 to University("FACULDADE FIGUEIREDO COSTA", "FIC",		"2751616000120", "MACEIO",	"Privada",	"Privada",	"57022150",	"Jaraguá",	"(82) 3326-8069",	"www.unifal.edu.br",	"fic@unifal.edu.br", null),
                2075 to University("INSTITUTO DE ENSINO SUPERIOR DE ALAGOAS",	"IESA",	"11918109000129",	"MACEIO",	"Privada","Privada",	"57035360",	"Jatiúca",	"(82) 3304-5200",	"www.ficunifal.com.br", "marcioacbarros@yahoo.com.br", null),
                2156 to University("FACULDADE SÃO TOMÁS DE AQUINO",	"FACESTA",	"4209589000193",	"PALMEIRA DOS INDIOS",	"Privada",	"Privada",	"57600060",	"São Francisco",	"(82) 3421-1060",	"http://www.facesta.com.br/", "facesta@bol.com.br", null),
                2244 to University("FACULDADE DA CIDADE DE MACEIÓ", "FACIMA", "6099229000101",	"MACEIO",	"Privada",	"Privada",	"57051090",	"Farol",	"(82) 3223-0033",	"http://www.facima.edu.br/", "marcioacbarros@yahoo.com.br", null),
                2557 to University("FACULDADE DE CIÊNCIAS SOCIAIS APLICADAS DE PENEDO",	"FCSAP", "12432605000130",	"PENEDO",	"Privada","Privada",	"57200000",	"Centro",	"(82) 3551-2694 / (82) 3551-2161/ (82) 3551-2780 / (82) 3551-2694",	"www.frm.edu.br", "sec.frm.penedo@hotmail.com", null),
                2642 to University("FACULDADE SÃO VICENTE",	"FASVIPA",	"12514949000199",	"PAO DE ACUCAR",	"Privada",	"Privada",	"57400000",	"Centro",	"(82) 3624-1862 / (82) 3624-1862",	"www.fasvipa.com.br", "fasvipa@hotmail.com", null),
                3004 to University("INSTITUTO DE ENSINO SUPERIOR SANTA CECÍLIA",	"IESC",	"5244212000138",	"ARAPIRACA",	"Privada",	"Privada",	"57312500",	"Alto do Cruzeiro",	"(82) 3530-3168",	"www.isesc.edu.br", "daa@isesc.edu.br", null),
                3182 to University("CENTRO DE ENSINO SUPERIOR ARCANJO MIKAEL DE ARAPIRACA",	"CESAMA", "5949154000148", "ARAPIRACA",	"Privada",	"Privada", "57300020", "Brasília",	"(82)3530-1462 / (82) 9983-1386",	"www.cesama.com", "cesama.cesama@bol.com.br", null),
                4146 to University("FACULDADE DE CIÊNCIAS JURÍDICAS DE ALAGOAS", "FCJAL",	"12432605000130",	"PENEDO",	"Privada",	"Privada",	"57200000", "Centro",	"(82) 3551-2694 / 82) 3551-2161 / 82) 3551-2780 (82)3551/2694",	"www.frm.edu.br", "sec.frm.penedo@hotmail.com",null),
                4530 to University("FACULDADE INTEGRADA TIRADENTES", "FITS",	"13013263000187",	"MACEIO",	"Privada",	"Privada",	"57031530",	"Cruz das Almas",	"(82) 3311-3120",	"www.fits.edu.br", "dario_arcanjo@fits.edu.br", null),
                4714 to University("FACULDADE ALTERNATIVA DE ENSINO SUPERIOR DO AGRESTE", "FAESA",	"7664688000153", "ARAPIRACA", "Privada",	"Privada", "57306230",	"Eldorado",	"(82)3530-4250 / (82)3530-4104",	"", "soesa@ibest.com.br", null),
                5228 to University("FACULDADE RAIMUNDO MARINHO",	"FRM",	"12432605000130",	"MACEIO",	"Privada",	"Privada",	"57037060",	"Ponta Verde",	"(82) 3325-9574 / (82) 3325-9574", "www.frm.edu.br",	"contato@frm.edu.br", null),
                5242 to University("UNIVERSIDADE ESTADUAL DE ALAGOAS", "UNEAL",	"2436870000133",	"ARAPIRACA",	"Pública",	"Estadual",	"57312000",	"Alto Cruzeiro",	"(82)3521-3019 / (82)3530-3382",	"www.uneal.edu.br", "gabinete@uneal.edu.br", null),
                10020 to University("INSTITUTO LOGOS DE EDUCAÇÃO SUPERIOR",	"ILES",	"5668700000172",	"SAO JOSE DA TAPERA",	"Privada", "Privada",	"57445000", "centro","(82) 3622-1361 / (61) 7811-9218 / (82) 3622-1361",	"", "instituto.logos@yahoo.com.br", null),
                3160 to University("INSTITUTO FEDERAL DE EDUCAÇÃO CIÊNCIA E TECNOLOGIA DE ALAGOAS",	"IFAL",	"10825373000155",	"MACEIO",	"Pública",	"Federal", "57020510", "Centro", "(82) 2126-7012 / (82) 2126-7050 / (82) 2126-7082 / (82) 2126-7019",	"www.ifal.edu.br", "secgab@cefet-al.br", null)
            ),

            StateRepository.amazonas.name to mapOf(
                4 to University("UNIVERSIDADE FEDERAL DO AMAZONAS", "UFAM", "4378626000197", "MANAUS", "Pública", "Federal", "69077000", "Coroado", "(92) 3305-4513 / (92) 3305-4532", "www.ufam.edu.br", "gabinete@ufam.edu.br", null),
                452 to University("CENTRO UNIVERSITÁRIO LUTERANO DE MANAUS",	"CEULM/ULBRA",	"88332580000165",	"MANAUS",	"Privada",	"Privada", "69077730",	"JAPIIM",	"(92) 3616-9800 / (92) 3616-9831",	"www.ulbra-mao.br", "legisnorma.manaus@ulbra.br / valdinei@ulbra.br / ines.oliveira@ulbra.br",	null),
                668	to University("CENTRO UNIVERSITÁRIO DE ENSINO SUPERIOR DO AMAZONAS",	"CIESA",	"4278057000108",	"MANAUS",	"Privada",	"Privada","69058818", "Flores",	"(92) 3643-4200 / (92) 3642-4243",	"www.ciesa.br", "ciesa@ciesa.br / reitor@ciesa.br", null),
                669	to University("UNIVERSIDADE NILTON LINS",	"UNINILTONLINS",	"4803904000106",	"MANAUS",	"Privada",	"Privada", "69058040", "Parque Laranjeiras", "(92) 3643-2000 / (92) 3643-2113","www.niltonlins.br", "uniniltonlins@niltonlins.br / csantana@niltonlins.br", null),
                1049 to	University("INSTITUTO DE ENSINO SUPERIOR FUCAPI", "CESF",	"4153540000166",	"MANAUS",	"Privada", "Privada", "69075351",	"Distrito Industrial",	"(92) 2127-3066 / (92) 3613-2655",	"www.fucapi.br", "faculdade.fucapi@fucapi.br", null),
                1381 to University("FACULDADE MARTHA FALCÃO",	"FMF",	"2153389000130","MANAUS",	"Privada",	"Privada", "69057090", "Adrianópolis",	"(92) 2121-0900 /	(92) 622-6668 / (92) 633-3834",	"www.infs.com.br", "secfmf@infs.com.br / claudio@infs.com.br / helena@infs.com.br / leticia@infs.com.br", null),
                1422 to University("CENTRO UNIVERSITÁRIO DO NORTE",	"UNINORTE",	"63692180000130",	"MANAUS",	"Privada", "Privada",	"69020030",	"Centro",	"(92) 3212-5345 / (92) 9198-2945	(92) 3212-5010",	"http://www.uninorte.com.br", "kelly.souza@uninorte.com.br", null),
                1436 to	University("ESCOLA SUPERIOR BATISTA DO AMAZONAS",	"ESBAM","3410604000102",	"MANAUS",	"Privada", "Privada",	"69057510",	"Adrianopolis", "(92) 3305-1800	/ (92) 3305-1801",	"www.esbam.edu.br",	"esbam@esbam.edu.br / direcaogeral@esbam.edu.br", null),
                1592 to University("FACULDADE DE ODONTOLOGIA DE MANAUS",	"FOM",	"1192563000191",	"MANAUS",  "Privada",	"Privada", "69020011",	"Centro",	"(92) 3087-5659", "www.fom.edu.br", "f.o.m@uol.com.br", null),
                1638 to	University("FACULDADE DO AMAZONAS",	"IAES",	"6043492000189",	"MANAUS",	"Privada",	"Privada", "69005307",	"Nossa Senhora das Graças",	"(92) 3584-6068 / (92) 3584-6067",	"www.iaes.com.br", "faculdadedoamazonas@gmail.com", null),
                1906 to University("INSTITUTO DE ENSINO SUPERIOR MATERDEI", "IES-MATERDEI",	"1640902000155",	"MANAUS",	"Privada",	"Privada",	"69010170",	"Centro",	"(92) 210 10 800 / (92) 210 10 813",	"www.iesmaterdei.com.br", "iesmaterdei@iesmaterdei.com.br", null),
                2147 to University("FACULDADE METROPOLITANA DE MANAUS",	"FAMETRO",	"3817341000142",	"MANAUS",	"Privada", "Privada",	"69050000",	"Chapada",	"(92) 2121-1000 / (92) 3642-3770",	"www.fametro.edu.br", "leandroseffair@uol.com.br / cinaracardoso@hotmail.com / mcseffair@uol.com.br", null),
                2186 to University("FACULDADE SALESIANA DOM BOSCO",	"FSDB",	"4373163000170",	"MANAUS", "Privada	",  "Privada", "69010090",	"Centro",	"(92) 2125-4690 / (92) 2125-4639", "http://www.fsdb.edu.br", "cesar@fsdb.edu.br / sandra@fsdb.edu.br", null),
                2436 to University("FACULDADE TÁHIRIH",	"FT",	"5555099000101",	"MANAUS",	"Privada",	"Privada",	"69084598",	"São José IV", "(92) 3249-9500 / (92) 3249-9503 /	(92) 3648-5545",	"www.adcam.org.br", "adcam@adcam.org.br / secfaculdade@adcam.org.br", null),
                2676 to	University("FACULDADE LA SALLE", "UNILASALLE",	"92741990000137",	"MANAUS",	"Privada", "Privada", "69040040",	"Dom Pedro", "(92) 3655-1202 /	(92) 3656-5100",	"www.unilasalle.edu.br/manaus", "jussara@lasalle.g12.br", null),
                3172 to University("UNIVERSIDADE DO ESTADO DO AMAZONAS",	"UEA",	"4280196000176",	"MANAUS",	"Pública",	"Estadual",	"69005010",	"Flores",	"(92) 3214-5774 / (92) 214-5775 /	(92) 3214-5774 / (92) 3214-5775",	"www.uea.edu.br",	"gabinetechefia@uea.edu.br / ebrocki@uea.edu.br", null),
                4277 to	University("FACULDADE LITERATUS",	"FAL",	"3754112000126",	"MANAUS",	"Privada",	"Privada",	"69050001",	"Chapada",	"(92) 3212-8900	/ (92) 3212-8940",	"www.literatus.edu.br", "direcao.graduacao@literatus.edu.br", null),
                1812 to	University("INSTITUTO FEDERAL DO AMAZONAS", "IFAM",	"394445018817",	"MANAUS",	"Pública",	"Federal",	"69020120",	"CENTRO",	"(92) 3621-6715 /	(92) 3621-6745 / (92) 9110-7178 / (92) 3635 1981",	"ifam.edu.br", "gabinete@ifam.edu.br / deg_proen@ifam.edu.br",	null),
                3397 to University("FACULDADE BOAS NOVAS DE CIÊNCIAS TEOLÓGICAS SOCIAIS E BIOTECNOLÓGICAS", "FBNCTSB",	"84541689000151",	"MANAUS",	"Privada",	"Privada",	"69077000",	"Japiim",	"(92) 3237-2214",	"www.faculdadeboasnovas.edu.br", "mariajose@faculdadeboasnovas.edu.br", null)
            ),

            StateRepository.amapa.name to mapOf(
                15522 to University("INSTITUTO FEDERAL DE EDUCAÇÃO CIÊNCIA E TECNOLOGIA DE ALAGOAS", "IFAP", "10820882000195", "MACAPA", "Pública", "Federal", "68908198", "Julião Ramos", "(92)  3237-2214", "www.ifap.edu.br", "reitoria@ifap.edu.br", null),
                830	to University("UNIVERSIDADE FEDERAL DO AMAPÁ",	"UNIFAP",	"34868257000181", "MACAPA", "Pública",	"Federal","68902280",	"Zerão",	"(96) 3312-1705", "http://www.unifap.br", "unifap@unifap.br / pi@unifap.br / prograd@unifap.br / reitor@unifap.br / dav@unifap.br", null),
                861	to University("CENTRO DE ENSINO SUPERIOR DO AMAPÁ", "CEAP",	 "4661922000109",	"MACAPA", "Privada", "Privada",	"68906720",	"Alvorada",	"(96) 3261-2133 / (96) 3261-1401",	"www.ceap.br", "ceap@ceap.br",	null),
                1591 to University("FACULDADE SEAMA",	"SEAMA",	"3065816000191",	"MACAPA",	"Privada","Privada","68908126", "Laguinho", "(96) 2101-5151 / (96) 2101-5151",	"www.seama.edu.br", "seama@seama.edu.br", null),
                1823 to University("INSTITUTO DE ENSINO SUPERIOR DO AMAPÁ",	"IESAP",	"10227585000130",	"MACAPA",	"Privada",	"Privada", "68901025",	"Trem",	"(96) 3222-6605 /	(96) 3222-6403",	"www.iesap.edu.br", "iesap@iesap.edu.br / iesap@hotmail.com",	null),
                1877 to University("FACULDADE ATUAL",	"FAAT",	"6173834000185",	"MACAPA", "Privada", "Privada", "68906350", "Central",	"(96) 3217-1491 / (96) 3217-1474",	"www.faculdadeatual.com.br", "katymotinha@uol.com.br", null),
                2069 to University("FACULDADE DE TEOLOGIA E CIÊNCIAS HUMANAS",	"FATECH",	"4191375000137",	"MACAPA", "Privada", "Privada",	"68906370", "Centro",	"(96) 3223-9239 /	(96) 3223-9238",	"faculdadefatech.com.br", "fatech753@yahoo.com.br", null),
                2380 to University("Faculdade Estácio do Amapá - Estácio FAMAP",	"FAMAP",	"2608755000107",	"MACAPA",	"Privada", "Privada",	"68903000",	"Jardim Equatorial",	"(96) 3312-2201 / (96) 3312-2209",	"www.famap.edu.br", "famap@famap.edu.br / cgfamap@gmail.com", null),
                2469 to University("INSTITUTO MACAPAENSE DE ENSINO SUPERIOR", "IMMES", "4159727000177",	"MACAPA",	"Privada", "Privada",	"68900075", "Centro",	"(96) 3223-4244 /	(96) 3223-4244 / (96) 3223-4204",	"www.immes.com.br", "diretoria@immes.com.br / mrivaldo@uol.com.br", null),
                2773 to University("FACULDADE DE MACAPÁ",	"FAMA",	"4492733000141",	"MACAPA",	"Privada", "Privada", "68900000",	"Cabralzinho",	"(96) 2101-0400 / (96) 2101-0409",	"https://www.faculdadedemacapa.com.br/", "ddi@kroton.com.br", null),
                2917 to University("FACULDADE BRASIL NORTE",	"FABRAN",	"6099229000101", "MACAPA",	"Privada",	"Privada",	"68908127",	"Jesus de Nazaré",	"(96) 3223-7924",	"", "marcioacbarros@yahoo.com.br", null),
                3769 to University("FACULDADE MADRE TEREZA",	"FAMAT",	"4666494000107",	"SANTANA",	"Privada",	"Privada",	"68925000",	"Nova Brasília",	"(96) 3281-2645 /	(96) 3281-2645",	"www.madretereza.edu.br", "madretereza@madretereza.edu.br", null),
                3787 to University("FACULDADE DE ENSINO SUPERIOR DA AMAZÔNIA",	"FESAM",	"1711282000106",	"MACAPA",	"Privada",	"Privada",	"68908-127",	"Laguinho",	"(96) 3224-2954",	"", "marcioacbarros@yahoo.com.br", null),
                3977 to University("FACULDADE DE TECNOLOGIA DO AMAPÁ",	"META",	"5255345000100",	"MACAPA",	"Privada",	"Privada",	"68903150",	"Jardim Marco Zero",	"(96) 3241-6636 / (96) 3243-1828",	"www.meta.edu.br", "hildemar@meta.edu.br", null),
                5701 to University("UNIVERSIDADE DO ESTADO DO AMAPÁ",	"UEAP",	"394577000125",	"MACAPA",	"Pública", "Estadual",	"68900070",	"Central",	"(96) 2101-0524 / (96) 2101-0506", 	"www.ueap.ap.gov.br", "ueap@ueap.ap.gov.br", null),
                11593 to University("FACULDADE DE TECNOLOGIA DE MACAPÁ",	"FTA",	"8790056000107",	"MACAPA",	"Privada", "Privada",	"68908080",	"Julião Ramos",	"(96) 3222-2208",	"http://www.faculdadeapoena.com.br/", "apoena@secrel.com.br", null)
            ),

            StateRepository.bahia.name to mapOf(
                24 to University("UNIVERSIDADE ESTADUAL DE SANTA CRUZ", "UESC", "40738999000195", "ILHEUS", "Pública", "Estadual", "45662900", "Salobrinho", "(73) 3680-5311", "www.uesc.br", "reitoria@uesc.br", null)
            ),

            StateRepository.ceara.name to mapOf(
                29 to University("UNIVERSIDADE ESTADUAL DO CEARÁ", "UECE", "7885809000197", "FORTALEZA", "Pública", "Estadual", "60740000","Itaperi", "(85) 3101-9610", "www.uece.br", "ueceprograd@gmail.com", null)
            ),

            StateRepository.distritoFederal.name to mapOf(
                2 to University("UNIVERSIDADE DE BRASÍLIA",	"UNB",	"38174000143",	"BRASILIA","Pública",	"Federal","70910900", "Asa Norte",	"(61) 3307-1750 / (61) 3307-2600",		"http://www.unb.br", "unb@unb.br", R.drawable.unb)
            ),

            StateRepository.espiritoSanto.name to mapOf(
                78 to University("FACULDADE DE FILOSOFIA CIÊNCIAS E LETRAS DE ALEGRE", "FAFIA", "27174101000135", "ALEGRE", "Pública", "Municipal", "29500000", "Centro", "", "http://www.fafia.edu.br", "fafia@fafia.edu.br", null)
            ),

            StateRepository.goias.name to mapOf(
                47 to University("UNIVERSIDADE ESTADUAL DE GOIÁS", "UEG", "1112580000171", "ANAPOLIS", "Pública", "Estadual", "75000000", "Zona Rural", "(62) 3328-1178", "www.ueg.br", "reitoria@ueg.br", null)
            ),

            StateRepository.maranhao.name to mapOf(
                548 to University("UNIVERSIDADE FEDERAL DO MARANHÃO", "UFMA", "6279103000119", "SAO LUIS", "Pública", "Federal", "64800000", "Bacanga", "(98) 3301-8004 / (98) 3301-8003", "www.ufma.br", "aldir@ufma.br", null)
            ),

            StateRepository.minasGerais.name to mapOf(
                6 to University("UNIVERSIDADE FEDERAL DE OURO PRETO", "UFOP", "23070659000110", "OURO PRETO", "Pública", "Federal", "35400000", "Centro", "(31) 3559-1218", "www.ufop.br", "reitoria@ufop.br", null)
            ),

            StateRepository.matoGrossoDoSul.name to mapOf(
                12748 to University("FACULDADE DE EDUCAÇÃO TECNOLOGIA E ADMINISTRAÇÃO DE CAARAPÓ", "FETAC", "5298778000142", "CAARAPO", "Privada", "Privada", "79940000","Centro", "(67) 3453-1122", "(67) 3453-1122 / (67) 3453-1123", "nelsonposseti@uol.com.br", null)
            ),

            StateRepository.matoGrosso.name to mapOf(
                1305 to University("FACULDADE DE CIÊNCIAS JURÍDICAS GERENCIAIS E EDUCAÇÃO DE SINOP", "FIS", "33005265000131", "SINOP", "Privada", "Privada", "78550000", "Setor Industrial", "(66) 3531-0916 / (66) 3531-1000", "www.unic.br/sinop", "ddi@kroton.com.br / adelinon@kroton.com.br", null)
            ),

            StateRepository.para.name to mapOf(
                38 to University("UNIVERSIDADE DO ESTADO DO PARÁ", "UEPA", "34860833000144", "BELEM", "Pública", "Estadual", "66113070", "Telégrafo", "(91)3244-8957 / (91) 3299-2200 / (91) 3299-2207", "www.uepa.br", "reitora@uepa.br / densino@uepa.br", null)
            ),

            StateRepository.paraiba.name to mapOf(
                1076 to University("FACULDADE DE FILOSOFIA CIÊNCIAS E LETRAS DE CAJAZEIRAS", "FAFIC", "8798779000144","CAJAZEIRAS", "Privada", "Privada", "58900000", "Centro", "(83) 3531-3500", "www.fescfafic.edu.br", "fafic@fescfafic.edu.br", null)
            ),

            StateRepository.pernambuco.name to mapOf(
                11 to University("UNIVERSIDADE CATÓLICA DE PERNAMBUCO",	"UNICAP"	,"10847705000100",	"Nordeste", "Privada", "Privada","50050900","Boa Vista", "(81) 2119-4110/(81) 2119-4206",		"http://www.unicap.br","prubens@unicap.br / hlima@unicap.br", null)
            ),

            StateRepository.piaui.name to mapOf(
                916 to University("FACULDADE DE CIÊNCIAS SAÚDE EXATAS E JURÍDICAS DE TERESINA FACULDADE", "CEUT", "34982124000131", "TERESINA",	"Privada", "Privada", "64046700", "São João",	"(86) 4009-4300 / (86) 3232-1222",		"www.ceut.com.br", "fatimaportela@ceut.com.br / linarosa@ceut.com.br / honoriobona@ceut.com.br", null)
            ),

            StateRepository.parana.name to mapOf(
                1257 to University("FACULDADE DE ADMINISTRAÇÃO  CIÊNCIAS EDUCAÇÃO E LETRAS",	"FACEL", "77387363000156", "CURITIBA", "Privada",	"Privada", "80420010", "Centro", "(41) 3324 1115 / (41) 3324 1115",	"www.facel.com.br", "secretaria@facel.com.br", null)
            ),

            StateRepository.rioDeJaneiro.name to mapOf(
                473 to University("FACULDADE DE CIÊNCIAS ECONÔMICAS ADMINISTRATIVAS E DA COMPUTAÇÃO DOM BOSCO",	"FCEACDB", "31463235000143", "RESENDE",	"Privada", "Privada", "27511971", "Campo da Aviação",	"(24)  3383-9000	/ (24) 3383-9000",	"www.aedb.br", "sec@aedb.br / esteves@aedb.br", null)
            ),

            StateRepository.rioGrandeDoNorte.name to mapOf(
                724 to University("FACULDADE DE CIÊNCIAS CULTURA E EXTENSÃO DO RIO GRANDE DO NORTE",	"FACEX", "8241911000112", "NATAL", "Privada", "Privada", "59080020", "Capim Macio", "(84) 3235-1415",		"www.facex.com.br", "secretaria@facex.com.br", null)
            ),

            StateRepository.rondonia.name to mapOf(
                450 to University("CENTRO UNIVERSITÁRIO LUTERANO DE JI-PARANÁ", "CEULJI/ULBRA", "88332580000165", "JI-PARANA",	"Privada",	"Privada", "76907438", "Jardim Aurélio Bernardi",	"(69) 3416-3100 / (69) 3416-3121	/ (69) 3416-3131",	"www.ulbra.br/jiparana", "graduacaojp@ulbra.br / direcaojp@ulbra.br / valdinei@ulbra.br", null)
            ),

            StateRepository.roraima.name to mapOf(
                2133 to University("FACULDADE DE CIÊNCIAS EDUCAÇÃO E TEOLOGIA DO NORTE DO BRASIL", "FACETEN",	"1454631000143",	"BOA VISTA", "Privada", "Privada",	"69300000", "Pricumã",	"(95) 3625-5477 /	(95)36255477",	"www.faceten.edu.br", "isef.faceten@gmail.com", null)
            ),

            StateRepository.rioGrandeDoSul.name to mapOf(
                601 to University("INSTITUTO FEDERAL DE EDUCAÇÃO CIÊNCIA E TECNOLOGIA DO RIO GRANDE DO SUL",	"IFRS",	"10637926000146",	"BENTO GONCALVES", "Pública",	"Federal", "95700000", "Centro", 	"(54) 3449-3300 /	(54) 3455-3246", "www.ifrs.edu.br",	"reitora@ifrs.edu.br", null)
            ),

            StateRepository.santaCatarina.name to mapOf(
                3162 to University("INSTITUTO FEDERAL DE EDUCAÇÃO CIÊNCIA E TECNOLOGIA  DE SANTA CATARINA", "IFSC",	"11402887000160",	"FLORIANOPOLIS", "Pública", "Federal", "88020300", "Centro",	"(48) 3877 9002 /	(48) 3877 9058", "www.ifsc.edu.br", "reitoria@ifsc.edu.br", null)
            ),

            StateRepository.sergipe.name to mapOf(
                3 to University("UNIVERSIDADE FEDERAL DE SERGIPE",	"UFS", "13031547000104", "SAO CRISTOVAO",	"Pública",	"Federal", "49100000", "Jardim Rosa Elze", "(79) 2105-6408 / (79) 2105-6474", "www.ufs.br", "gabinete@ufs.br", null)
            ),

            StateRepository.saoPaulo.name to mapOf(
                256 to University("FACULDADE DE FILOSOFIA CIÊNCIAS E LETRAS DE PIRAJU",	"FAFIP",	"54669809000130", "PIRAJU", "Privada", "Privada", "18800000", "Centro", "(14) 3351-3255",	"www.fafip.edu.br", "secretaria@fafip.edu.br", null)
            ),

            StateRepository.tocantins.name to mapOf(
                453 to University("CENTRO UNIVERSITÁRIO LUTERANO DE PALMAS",	"CEULP",	"88332580000165", "PALMAS", "Privada",	"Privada",	"77054970",	"Área de Expansão Sul",	"(63) 3219-8018 /	(63) 3219 8005",	"www.ulbra-to.br", "direcao@ceulp.edu.br / valdinei@ulbra.br", null)
            )

        )
    }
}