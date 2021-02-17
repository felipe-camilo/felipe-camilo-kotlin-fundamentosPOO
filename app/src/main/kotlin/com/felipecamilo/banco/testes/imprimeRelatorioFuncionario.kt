package com.felipecamilo.banco.testes

import com.felipecamilo.banco.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                    funcionario.toString()
            )
        }
    }
}