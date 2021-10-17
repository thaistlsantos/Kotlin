/*
3. A classe Aluno possuí os atributos id, nome e curso. Receba todos os
parâmetros no método construtor e exiba-os em console. Adicione um
companion Object com a mensagem chamando método estático, que deve ser
acessado sem realizar a instância direta da classe.
 */

class AlunoF(id: Int, nome: String, curso: String) {
    var id: Int
    var nome: String
    var curso: String

    init {
        this.id = id
        this.nome = nome
        this.curso = curso
    }

    fun listar_aluno() {
        println("Id: ${this.id}\nNome: ${this.nome}\nCurso: ${this.curso}")
    }
}

fun main() {
    val aluno1 = AlunoF(1, "Fulano Beltrano", "Sistemas de Informação")
    aluno1.listar_aluno()
}
