
fun main() {

    val num1: Int = 1050
    val num2: Int = 53
    val num3: Int = 475
    calcula(num1)
    calcula(num2)
    calcula(num3)
}

fun calcula (valor:Int){
    if(valor > 1000 || valor < 100){
        println("Está fora do Range: $valor \n")
    }
    else {
        println("Está dentro do Range: $valor")
    }
}

/*
fun exibir(valor: Int) {

    if (valor > 1000 || valor < 100){
    }
    if(valor in 101..999){
        println("O valor $valor está dentro do range solicitado")
    }
}

fun main(){
    val n1: Int = 1050
    val n2: Int = 53
    val n3: Int = 475

    exibir(n1)
    exibir(n2)
    exibir(n3)
}

 */

    /*

    var num1: Int = 1050
    var num2: Int = 53
    var num3: Int = 475

  for (num1 || num2 || num3 in 1..1000) {

    if (num1 || num2 || num3) < 100 {
        println("$num1, $num2, $num3 ")
    }

 */

