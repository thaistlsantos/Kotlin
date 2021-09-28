/*6) Mude todas as propriedades, como no exemplo “private var modelo” e tente executar o exercício 5.
Caso haja erro, solucione-o mudando as propriedades para public.

 */
class Carro6(modelo: String, ano: Int, velocidade: Int){
    private var modelo = modelo
    private var ano = 1900
    private var velocidade = velocidade

    init {
        this.modelo = modelo
        this.ano = ano
        this.velocidade = velocidade
    }

    fun getAno(): Int{
        return ano
    }

    fun getModelo():String{
        return modelo
    }
}

fun main(){
    var c0 = Carro6("Amarok", 2018, 200)
    var c1 = Carro6("Fusca", 1900, 140)
    var c2 = Carro6(modelo = "Cruze", ano = 2020, velocidade = 240)

    if (c0.getAno() < 2000){
        println("Você deve realizar a venda do(a) ${c0.getModelo()}.")
    }
    if (c1.getAno() < 2000){
        println("Você deve realizar a venda do(a) ${c1.getModelo()}.")
    }
    if (c2.getAno() < 2000){
        println("Você deve realizar a venda do(a) ${c2.getModelo()}.")
    }
}