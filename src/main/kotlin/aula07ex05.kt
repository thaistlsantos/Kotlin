// Exemplo de classe em Kotlin e de construtores
class Carro1(){

    // Atributos da Classe
    var modelo: String = ""
    var ano: Int = 1900
    var velocidade: Int = 0
}

fun main(){

    val c0: Carro1
    val c1: Carro1 = Carro1()
    val c2 =  Carro1()

    c0 =  Carro1()

    c2.ano = 2020

    println(c1.ano)
    println(c2.ano)
}