package com.felipecamilo.banco

abstract class Pessoa(
         val nome: String,
         val cpf: String
) {
    fun pessoaInfo() {
        println("${nome} - ${cpf}")
    }
}

