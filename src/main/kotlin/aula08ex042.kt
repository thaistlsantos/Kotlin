// Exemplo de classe em Kotlin e de construtores
class Carro5(){

    // Atributos da Classe
    var modelo: String = ""
    var ano: Int = 1900
    var velocidade: Int = 0
}

fun main(){

    val c0: Carro5
    val c1: Carro5 = Carro5()
    val c2 =  Carro1()

    c0 =  Carro5()

    c0.modelo = "Fusca"
    c0.ano = 1993
    c0.velocidade = 20

    c1.modelo = "BMW"
    c1.ano = 2018
    c1.velocidade = 200

    c2.modelo = "Ferrari"
    c2.ano = 2021
    c2.velocidade = 260


    println("Valores atribuídos para o objeto c0 foram:")
    println(c0.modelo)
    println(c0.ano)
    println(c0.velocidade)

    println("Valores atribuídos para o objeto c1 foram:")
    println(c1.modelo)
    println(c1.ano)
    println(c1.velocidade)

    println("Valores atribuídos para o objeto c2 foram:")
    println(c2.modelo)
    println(c2.ano)
    println(c2.velocidade)

    if(c0.ano<2000 || c1.ano<2000 || c2.ano<2000){
        println("Você precisa realizar a venda de um ou mais veículos, por serem inferiores ao ano 2000")
    }
}