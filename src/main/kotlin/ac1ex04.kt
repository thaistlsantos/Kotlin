/*
fun main() {
Caso o usuário imputasse os dados, ficaria:
   println("Digite o valor do seu depósito: ")
   val deposito = readLine()!!.toDouble()
 */
    /*
    var deposito: Double = 3800.00
    var acrescimo: Double =  0.013
    var resultado: Double = (deposito + (deposito * acrescimo))
    println("O salário é: $deposito")

    println("Após 1 mês aplicado o valor do seu depósito é: ${calcula(3800)} ")
}

fun calcula(n1:Double){
    var porcentagem: Double = n1 * 0.013
    return println((n1 + porcentagem))

}*/
fun poupanca(valor:Double): Unit {
    var rendimento:Double = (valor + (valor * 0.013))
    println("O salário é: $valor")
    println("Após 1 mês de aplicação seu valor será de: R$ $rendimento.")
}

fun main(){
    poupanca(3000.00)
}

/*
fun calcula(deposito: Double): Double {
    var rendimento: Double = deposito + (deposito * 0.013)
    println(rendimento)
    return rendimento
}

fun main(){
    calcula(3800.00)
}

 */