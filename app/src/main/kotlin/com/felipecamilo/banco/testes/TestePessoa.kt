package com.felipecamilo.banco.testes
import com.felipecamilo.banco.Pessoa


fun main(){
    val pessoa = Pessoa("Felipe", cpf = "123.456.789-00")
    //println(pessoa.pessoaInfo())
    println(pessoa.nome)
    println(pessoa.cpf)
}
