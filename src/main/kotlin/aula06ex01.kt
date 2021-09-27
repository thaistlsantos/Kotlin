class Aluno2(nome: String, idade: Int) {
    val nome: String
    val idade: Int
    init {
        // bloco de inicialização
        this.nome = nome
        this.idade = idade
    }


    override fun toString(): String {
        return "Aluno: $nome, idade: $idade"
    }

}

fun main(args: Array<String>) {
    val a1 = Aluno("Fabio", 28) //instanciando a classe Aluno
    println(a1)
    println("Aluno: ${a1.nome}, idade: ${a1.idade}")
}