fun nulo(n1: Int? = null , n2: Int? = null ,n3: Int? = null ,n4: Int?){

    if (n1 != null) {
        println("O primeiro parâmetro não é nulo")
    } else{
        println("Primeiro é nulo")
    }
    if (n2 != null){
        println("O segundo parâmetro não é nulo")
    } else{
        println("Segundo é nulo")
    }
    if (n3 != null){
        println("O terceiro parâmetro não é nulo")
    } else {
        println("Terceiro é nulo")
    }
    if (n4 != null){
        println("O quarto parâmetro não é nulo")
    } else{
        println("Quarto é nulo")
    }
    println("-----------------------------------")
}

fun main() {
    nulo(null, null, null, null)
    nulo(10, 5, 1, 101)
    nulo(5, n4 = 50)
    nulo(n4 = 35)
}
