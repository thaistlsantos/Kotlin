class AlunoP(id: Int, nome: String) {
    val lista = arrayListOf<Double>()

    init {
        //você deve montar a lista
        exibeLista(lista, id, nome)
    }


    fun <T> exibeLista(lista: ArrayList<T>, id:Int, nome:String) {
        var valor:Double = 1.0
        println("O aluno: $id, de nome:$nome, teve as seguintes notas")
        for (valor in lista){
            println(valor)
        }
    }
}

fun main() {
    var obj = AlunoP(2, "Fabio")
}

/*
class Aluno(id: Int, nome: String) {
    val lista = arrayListOf<Double>()
    init {
        lista.add(5.2)
        lista.add(3.3)
        lista.add(7.2)
        lista.add(7.1)
        lista.add(8.3)
        lista.add(1.1)
        lista.add(1.2)
        lista.add(1.3)
        lista.add(1.8)
        lista.add(9.3)

        exibeLista(lista, id, nome)
    }

    fun <T> exibeLista(lista: ArrayList<T>, id:Int, nome:String) {
        var valor:Double = 1.0
        println("O aluno: $id, de nome:$nome, teve as seguintes notas")
        for (valor in lista){
            println(valor)
        }
    }
}

fun main() {
    var obj = Aluno(2, "Fabio")
}

 */