/*
2. A classe Aluno possuí os atributos id, nome e curso. Receba todos os
parâmetros no método construtor e exiba-os em console, sem a utilização de
métodos estáticos.
 */
class AlunoFit(id: Int, nome: String, curso: String) {
    var id: Int
    var nome: String
    var curso: String

    init {
        this.id = id
        this.nome = nome
        this.curso = curso
    }
}

fun main() {
    var aluno1 = AlunoFit(1, "Fulano Beltrano", "Sistemas de Informação")
    println("Id: ${aluno1.id}\nNome: ${aluno1.nome}\nCurso: ${aluno1.curso}\n")
}
