
class Turma(id: Int, nome: String, qtdAlunos:Int) {

    init {
        println("ID: $id \nNome: $nome\nQuantidade de alunos:$qtdAlunos")
    }

}

fun main() {
    var obj = Turma(1202134, "SI", 28)
}

/*
open class Turma(ID: Int, NOME: String, QDTALUNOS: Int){
    val id_turma: Int
    var nome: String
    var qtd_alunos: Int

    init {
        this.id_turma = ID
        this.nome = NOME
        this.qtd_alunos = QTDALUNOS
    }
}

fun main (args:Array<String>){
    val turma1 = Turma(10, "SI3B", 15)
    println(turma1)
    println("ID da turma: ${turma1.id_turma}, Nome da turma: ${turma1.nome}, quantidade alunos ${turma1.qtd_alunos}")
}

 */