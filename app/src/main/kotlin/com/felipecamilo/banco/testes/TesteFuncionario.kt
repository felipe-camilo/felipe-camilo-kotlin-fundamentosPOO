package com.felipecamilo.banco.testes
import com.felipecamilo.banco.Funcionario

fun main(){
    val funcionario = Funcionario(nome = "Joao", cpf = "112.334.556.778.90", salario = "2000")

    println("${funcionario.nome} - ${funcionario.cpf} ")
}