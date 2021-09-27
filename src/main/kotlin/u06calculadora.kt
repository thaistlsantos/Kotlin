 fun main (args: Array<String>) {

     // readline = recebe entrada de dados do usuário
     // ? assegura que o dado não seja nulos
     // toInt = convertendo para inteiro
     // !! caso o numero seja nulo , o codigo não será executado

     println("Digite o valor X: ")
     val x = readLine()?.toInt()!!

     println("Digite o valor Y: ")
     val y = readLine()?.toInt()!!
     val z = (x+y)

     println("Resultado = $z")
 }