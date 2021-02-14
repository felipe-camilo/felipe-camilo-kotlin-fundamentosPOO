package com.felipecamilo.banco.testes

import com.felipecamilo.banco.Banco
import com.felipecamilo.banco.Pessoa

fun main(){
    val digitalOneBanck = Banco(nome = "DigitalOne", numero = 12)
    println(digitalOneBanck.nome)
    println(digitalOneBanck.numero)

    val banco2 = digitalOneBanck.copy(nome = "Banco")
    //println(banco2.nome)
    //println(banco2.numero)
    banco2.info()
}