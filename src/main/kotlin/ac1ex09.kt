fun calcula(salario: Double, opcao: Int){

    when(opcao){
        1 -> println(salario + (salario * 0.30))
        2 -> println(salario + (salario * 0.40))
        3 -> println(salario + (salario * 0.60))
        4 -> println(salario + (salario * 0.60))
        else -> {
            println("Erro, digite uma opção válida")
        }
    }
}

fun main(){
    calcula(1100.0, 1)
    calcula(1100.0, 2)
    calcula(1100.0, 3)
    calcula(1100.0, 4)
    calcula(1100.0, 5)
}

/*
fun calcula (salario:Double, opcao:Int){

    var porcentagem: Double

    if(opcao == 1){
        porcentagem = salario * 0.3
        println(salario + porcentagem)
    }
    else if(opcao == 2){
        porcentagem = salario * 0.4
        println(salario + porcentagem)
    }
    else if(opcao == 3){
        porcentagem = salario * 0.5
        println(salario + porcentagem)
    }
    else if(opcao == 4){
        porcentagem = salario * 0.6
        println(salario + porcentagem)
    }
    else{
        println("Opção inválida")
    }
}

fun main() {
    calcula(1100.0, 1)
    calcula(1100.0, 2)
    calcula(1100.0, 3)
    calcula(1100.0, 4)
    calcula(1100.0, 5)
}

 */
