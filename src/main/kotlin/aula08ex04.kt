class CarroT(modelo: String, ano: Int, velocidade: Int){
    var modelo: String
    var ano = 1900
    var velocidade: Int

    init {
        this.modelo =  modelo
        this.ano = ano
        this.velocidade = velocidade
    }
}

fun main(){
    var c0 = CarroT("Peugeot", 2012, 200)
    var c1 = CarroT("HB20", 2020, 200)
    var c2 = CarroT(modelo = "Fusca", ano = 1950, velocidade = 250)
    println("Ano do carro 1: ${c1.ano} \nano do carro 2: ${c2.ano}")

    var carros = arrayListOf(c0, c1, c2)

    for (x in carros){
        if (x.ano < 2000){
            println("Você precisa vender o ${x.modelo}")
        }
    }
}