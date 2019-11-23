package com.olivercastilho.universidadesdobrasil.data.models

data class University(
    val name: String,
    val initials: String,
    val cnpj: String,
    val city: String,
    val network: String,
    val administrativeCategory: String,
    val cep: String,
    val neighborhood: String,
    val telephone: String,
    val site: String,
    val email: String,
    val image: Int?
)