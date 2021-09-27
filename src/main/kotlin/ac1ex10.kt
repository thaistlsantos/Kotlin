fun quadrado(){
    for (x in 40..200 ){
        if (x % 2 == 0){
            println("O quadrado de $x é: " + x * x)
        }
    }
}

fun main(){
    quadrado()
}

