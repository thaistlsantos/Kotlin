fun main(){
    var forma: Any? = null
    forma = ""
    if (forma is Int){
        println("É um inteiro")
    }
    else{
        println("É uma string")
    }
}