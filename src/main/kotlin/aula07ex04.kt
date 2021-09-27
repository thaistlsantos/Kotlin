fun main(){
    val lista_notas = arrayListOf<Double>()
    lista_notas.add(10.0)
    lista_notas.add(5.6)
    lista_notas.add(9.1)
    lista_notas.add(6.7)
    lista_notas.add(7.5)
    lista_notas.add(7.5)
    lista_notas.add(3.0)
    lista_notas.add(8.0)
    lista_notas.add(9.2)
    lista_notas.add(6.5)

    var aluno1 = AlunoT(1,"Thais Lima", lista_notas)

}

class AlunoT(id: Int, nome: String, notas: List<Double>){
    init {
        println("ID: $id, Nome aluno: $nome, notas: $notas")
    }

}