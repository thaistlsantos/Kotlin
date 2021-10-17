/*
5. Com base na resolução do exercício 4, se o atributo informado for do tipo Aluno,
instancie o objeto com o tipo da Classe Turma.
Ao final, apresente o último tipo do objeto instanciado.
 */

class AlunoA(nome: String, id: Int){
    var nome: String
    var id: Int

    init{
        this.nome = nome
        this.id = id
    }
}

class TurmaA(curso: String, id: Int){
    var curso: String
    var id: Int

    init{
        this.curso = curso
        this.id = id
    }
}

class ProfessorA(nome: String, id: Int){
    var nome: String
    var id: Int

    init{
        this.nome = nome
        this.id = id
    }
}

fun main(){
    val obj: Any? = AlunoA("SI", 3)

    if (obj is TurmaA){
        println("é da classe Turma")
    }
    else if (obj is AlunoA){
        val objrevisa: Any? = TurmaA(obj.nome, obj.id)
        if (objrevisa is TurmaA){
            println("é da classe Turma")
        }
        else{println("é da classe Aluno")}
    }
    else if (obj is ProfessorA){
        println("é da classe Professor")
    }
}