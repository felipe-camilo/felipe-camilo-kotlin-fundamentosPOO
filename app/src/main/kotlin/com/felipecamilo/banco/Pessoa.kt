package com.felipecamilo.banco

class Pessoa {
    var nome: String = "Felipe"
    var cpf: String = "311.544.766.98"
    private set //torna privado apenas o set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

