fun main () {
    println("Sua idade é: ${datas(2021, 1991)} anos")
    println("Daqui a 25 anos você terá: ${datas(2021, 1991) + 25} anos")
}

fun datas (anoAtual: Int, anoNasc: Int): Int {
    return anoAtual - anoNasc
}

    /*
    fun dataA (anoAtual: Int) {
        return anoAtual
    }

    val idade: Int = dataA() - dataN()
    println("Sua idade é: $idade anos")

    var idade2: Int = idade + 25
    println("Daqui a 25 anos você terá: $idade2 anos")



    val anoNasc: Int = 1991
    val anoAtual: Int = 2021

    val idade: Int = anoAtual - anoNasc
    println("Sua idade é: $idade anos")

    var idade2: Int = idade + 25
    println("Daqui a 25 anos você terá: $idade2 anos")

     */
