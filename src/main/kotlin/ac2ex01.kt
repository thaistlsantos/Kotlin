/*
1. Crie uma variável global que indique o percentual de reajuste de um
determinado produto, que deve ser calculado a partir do método main definido na função.
Calcule o novo salário e exiba-o em console.
 */

fun recalcular(percentual: Int, valor: Int): Int{
    val novo_salario: Int = valor + (valor * percentual / 100)
    return novo_salario
}

fun main() {
    val percentual = 15
    println(recalcular(percentual, 3500))
}

/*
val reajuste = 20.0
class Salario(salarioBase: Double, reajuste: Double) {
    val salarioBase: Double
    var percentual: Double = reajuste / 100.0

    init {
        this.salarioBase = salarioBase
        this.percentual = percentual
    }

    fun calReajuste(): Double {
        val salarioAtual: Double = salarioBase + (percentual * salarioBase)
       	return salarioAtual
    }
}
fun main(){
    var novoSalario = Salario(3500.0, reajuste)
    println(novoSalario.calReajuste())
}
 */