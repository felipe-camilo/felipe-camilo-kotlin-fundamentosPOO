package com.felipecamilo.banco.testes
import com.felipecamilo.banco.Gerente

fun main() {
    val gerente = Gerente(nome = "Maria", cpf = "112.334.556.999.90", salario = 1000.0, senha = "senha123")
    imprimeRelatorioFuncionario.imprime(gerente)
    TesteAutenticado().autentica(gerente)

}
