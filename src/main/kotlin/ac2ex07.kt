/*
7. Inicialize a classe Carro modelo do tipo de dado String,
ano do tipo de dado inteiro e velocidade do tipo de dado inteiro.
Na classe Carro, o atributo ano deve ser iniciado com o valor 1900.
Na função main crie 3 instâncias da classe Carro, nomeadas como c0, c1 e c2.
Inicialize o atributo ano de c2 com o valor 2020.
Em seguida exiba o ano do carro acessado por meio do objeto c1 e o ano do carro acessado por meio do objeto c2.
 */

class CarroTop(modelo: String, ano: Int = 1900, velocidade: Int){
    var modelo = modelo
    var ano = ano
    var velocidade = velocidade

    init {
        this.modelo = modelo
        this.ano = ano
        this.velocidade = velocidade
    }
}

fun main(){
    var c0 = CarroTop("Pegeout", 2012, 190)
    var c1 = CarroTop( "Onix", 2018,  220)
    var c2 = CarroTop(modelo = "Fusca", velocidade = 300)
    // quando passar valores atribuitos na classe, na main ele considera nulos.

    //println(c0.ano)
    println(c1.ano)
    println(c2.ano)
}