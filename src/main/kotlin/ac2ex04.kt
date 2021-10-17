/*
4. Crie três classes chamadas, Aluno, Turma e Professor.
Na função main, crie um atributo chamado obj instanciando uma das classes,
valide se o atributo é do tipo da Classe Aluno, Turma ou Professor
e exiba em console o tipo de dado que ele pertence.
 */

class AlunoImpacta(nome: String, id: Int, ){
    var nome: String
    var id: Int

    init{
        this.nome = nome
        this.id = id
    }
}

class TurmaImpacta(curso: String, id: Int, ){
    var curso: String
    var id: Int

    init{
        this.curso = curso
        this.id = id
    }
}

class Professor(nome: String, id: Int, ){
    var nome: String
    var id: Int

    init{
        this.nome = nome
        this.id = id
    }
}

fun main(){
    // Any= Qualquer variavel e nullos
    val obj: Any? = TurmaImpacta("SI", 3)

    if (obj is TurmaImpacta){
        println("é da classe Turma")
    }
    else if (obj is AlunoImpacta){
        println("é da classe Aluno")
    }
    else if (obj is Professor){
        println("é da classe Professor")
    }
}
