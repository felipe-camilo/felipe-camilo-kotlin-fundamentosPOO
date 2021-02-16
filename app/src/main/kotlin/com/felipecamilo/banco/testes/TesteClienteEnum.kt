package com.felipecamilo.banco.testes

import com.felipecamilo.banco.ClienteTipo

fun main() {

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")


}