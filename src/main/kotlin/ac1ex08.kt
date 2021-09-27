fun main() {

    val num1: Double = 10.0
    val num2: Double = 6.0
    val num3: Double = 8.0
    val media3: Double = (num1 + num2 + num3) / 3

    if (media3 > 6) {
        println("Você foi aprovado de PRIMEIRA !!!")
    }
    else {
        val num4: Double = 0.0
        val media4 = (num1 + num2 + num3 + num4) / 4
        if (media4 > 6) {
            println("Você conseguiu ser aprovado !!!")}
        else{
            println("Infelizmente você foi reprovado !!!")
            }
    }
}
