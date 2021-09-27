fun diferenca(n1:Double, n2:Double): Unit {
    if (n1 > n2){
        println (" A diferença é: " + (n1 - n2))
    } else {
        println ("A diferença é: " + (n2 - n1))
    }
}

fun main(){
    diferenca(3.0, 10.0)
}


/*
fun calcula(n1:Int, n2:Int){
    if(n1 < n2){
        println(n2 - n1)
    }
    else{
        println(n1 - n2)
    }
}
fun main(){
    val n1:Int = 700
    val n2:Int = 100
    calcula(n1, n2)
}

 */
