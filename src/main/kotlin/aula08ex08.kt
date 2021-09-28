/*
 *  Checagem de tipos
 */

fun main(){
    var forma: Any? = null
    forma = Quadrado()
    if	(forma is	Circulo) {
        print("é um Circulo")
    }	else if	(forma is	Quadrado) {
        print("é um Quadrado")
    }	else if	(forma is	Retangulo) {
        print("é um Retângulo")
    }
}
class Circulo(){
}
class Quadrado(){
}
class Retangulo(){
}