/*fun main() {

    val x: Double = 9.5
    val y: Double = 10.5

    /*
    Caso o usuário imputasse os dados, conforme o enunciado "Receba", ficaria:
    println("Digite o valor de X:")
    val x = readLine()?.toInt()
    println("Digite o valor de Y:")
    val y = readLine()?.toInt()
    */

    val xNovo = y
    val yNovo = x

    println("O resultado trocado é: X = $xNovo e Y = $yNovo ")
}

 */

fun valores(x: Double, y: Double): Unit {
    val xNovo = y
    val yNovo = x
    println("O novo valor de x é: $xNovo")
    println("O novo valor de y é: $yNovo")
}

fun main(){
    val x:Double = 9.5
    val y:Double = 10.5
    valores(x, y)
}
/* fun valores(x: Double, y: Double): Unit {
    var recebe:Double = y
    var y:Double = x
    var x:Double = recebe


    println("O novo valor de x é: $x")
    println("O novo valor de y é: $y")
}

fun main(){
    val x:Double = 9.5
    val y:Double = 10.5
    valores(x, y)
}

 */

