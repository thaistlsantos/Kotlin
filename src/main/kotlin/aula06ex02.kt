open class Pessoa(nome: String, idade: Int) {
    val nome: String
    val idade: Int

    init {// bloco de inicialização
        this.nome = nome
        this.idade = idade
    }

    open fun adicionarDesconto(desconto: Int) {
        println("Desconto para a pessoa de $desconto")
    }

    override fun toString(): String {
        return "Pessoa: $nome, idade: $idade"
    }

}


class Aluno(nome: String, idade: Int): Pessoa(nome, idade) {

    override fun adicionarDesconto(desconto: Int) {
        println("Desconto para o aluno de $desconto")
    }
}

fun main(args: Array<String>) {
    val a1 = Aluno("Thais", 28)
    println(a1)
    println("Aluno: ${a1.nome}, idade: ${a1.idade}")
    a1.adicionarDesconto(10)
}