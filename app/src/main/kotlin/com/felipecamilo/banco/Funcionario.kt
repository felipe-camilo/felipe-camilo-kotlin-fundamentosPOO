package com.felipecamilo.banco

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun  calculoAuxiio() : Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salário: $salario
        Auxilio: ${calculoAuxiio()}
    """.trimIndent()
}