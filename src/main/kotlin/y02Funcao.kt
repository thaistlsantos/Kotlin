// max nome da função
// lista de parametros está entre (): define uma funcao
// função = nome, lista de parametros e retornos
// argumentos = chama a função pronta
// tipo de retorno sempre depois da declaracao

fun main() {
    println(max(10, 5))
    println(max1(10, 5))
}

// corpo de bloco = o que está dentro de {}

fun max(a:Int, b:Int):Int {
    return if (a > b) a else b
}

// Corpo de expressão ---- IF = expressão tem valor próprio
fun max1(a:Int, b:Int):Int = if (a > b) a else b
