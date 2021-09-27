
fun salario(valor: Double): Unit {
    var acrescimo: Double = (valor + (valor * 0.20))
    println("O salário é: $valor")
    println("O valor do seu salário acrescido de 20% é de: R$ $acrescimo.")
}

fun main(){
    salario(5000.0)
}

/*fun main() {

    val vatual: Double = 3800.00
    val vacrescido = vatual + (vatual * 0.20)

    println("Salário acrescido é: $vacrescido ")

}

 */