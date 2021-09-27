fun main() {

    qtd_impar_par(1, 800)
}
fun qtd_impar_par (inicio: Int, fim: Int){
    var somapares: Int = 0
    var qtdimpares: Int = 0
    for (x in inicio..fim){
        if (x % 2 == 0){
            somapares += x
        }
        else {
            qtdimpares ++
        }
    }
    println("Soma pares: $somapares")
    println("Quantidade de Ímpares: $qtdimpares")
}