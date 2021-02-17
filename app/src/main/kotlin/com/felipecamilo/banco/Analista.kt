package com.felipecamilo.banco

import com.felipecamilo.banco.Funcionario
import java.math.BigDecimal

class Analista(
        nome: String,
        cpf: String,
        salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxiio() = salario * 0.1
}
