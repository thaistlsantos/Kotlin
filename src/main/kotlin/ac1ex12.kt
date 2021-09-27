fun main(){
    val inicializado: Int = 200
    div5(inicializado)
}

fun div5(inicializado: Int){
    var x: Int = 1
    while (x < inicializado) {
        if (x % 5 == 0) {
            println(x)
        }
        x++
    }
}

/*
fun main(){


    var x: Int = 1
    val inicializado: Int = 200

    while (x < inicializado) {
        if (x % 5 == 0) {

            println(x)
        }
        x++
    }
}
 */