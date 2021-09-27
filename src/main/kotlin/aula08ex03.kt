class Carro(Modelo: String, Ano: Int, Velocidade: Int) {
    val Modelo: String
    val Ano: Int
    val Velocidade: Int

    init {
        this.Modelo = Modelo
        this.Ano = 1900
        this.Velocidade = Velocidade

    }

    override fun toString(): String {
        return "Modelo: $Modelo, Ano: $Ano, Velocidade: $Velocidade \n"
    }
}
fun main() {
    val c1 = Carro("Celta", 2020, 250)
    val c2 = Carro("Corsa", 2010, 100)
    val c3 = Carro("Gol", 1900, 250)
    print(c1)
    print(c2)
    print(c3)
}