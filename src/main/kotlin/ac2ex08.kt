/*
8. Crie uma expressão lambda que realiza a divisão de 2 valores e exiba os resultados em console.
 */

fun main(args: Array<String>){
    val product = { a: Int, b: Int -> a / b }
    println(product(50,5))
}

/*
fun main(args: Array<String>) {
    val soma = { x: Int, y: Int -> x + y }

}
 */