package com.felipecamilo.banco

open class Pessoa(
        open val nome: String,
        open val cpf: String
) {
    fun pessoaInfo() {
        println("${nome} - ${cpf}")
    }
}

