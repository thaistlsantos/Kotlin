/*
6. Cria uma classe chamada Aluno com os atributos ID do aluno, nome do Aluno e semestre.
Passe 10 notas por meio da utilização de um ArrayList inicializadas no método construtor
e imprima cada um dos valores em console a partir de uma nova função.

 */

class AlunoTec(id: Int, nome: String, notas: ArrayList<Double>, semestre: Int){
    var id: Int
    var nome: String
    var notas: ArrayList<Double>
    var semestre: Int

    init {
        this.id = id
        this.nome = nome
        this.notas = notas
        this.semestre = semestre
    }

    fun listar_notas(){
        println(this.notas)
    }
}

fun main(){
    val lista_notas = arrayListOf<Double>()
    lista_notas.add(7.0)
    lista_notas.add(9.9)
    lista_notas.add(8.0)
    lista_notas.add(6.0)
    lista_notas.add(7.5)
    lista_notas.add(5.5)
    lista_notas.add(3.9)
    lista_notas.add(8.0)
    lista_notas.add(7.5)
    lista_notas.add(4.5)

    val aluno1 = AlunoTec(1,"Joao", lista_notas, 8)
    aluno1.listar_notas()
}
