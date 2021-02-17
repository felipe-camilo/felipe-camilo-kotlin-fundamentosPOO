package com.felipecamilo.banco.testes
import com.felipecamilo.banco.Analista

fun main() {
    val analista = Analista(nome = "Joao", cpf = "112.334.556.778.90", salario = 2000.0)
    imprimeRelatorioFuncionario.imprime(analista)
}


