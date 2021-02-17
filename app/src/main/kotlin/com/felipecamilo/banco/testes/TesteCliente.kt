package com.felipecamilo.banco.testes

import com.felipecamilo.banco.Cliente
import com.felipecamilo.banco.ClienteTipo

fun main() {
    val cliente = Cliente(
        nome = "José da Silva",
        cpf = "123.456.333-98",
        clienteTipo = ClienteTipo.PF,
        senha = "1234567"
    )
    println(cliente)
    TesteAutenticado().autentica(cliente)
}