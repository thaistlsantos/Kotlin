class AlunoN(ID: Int, nome: String, notas: List<Double>) {
    val ID: Int
    val nome: String
    val notas: List<Double>

    init {
        this.ID = ID
        this.nome = nome
        this.notas = notas

    }

    override fun toString(): String {
        return "ID: $ID, nome: $nome, notas: $notas"
    }
}
fun main() {
    val lista = arrayListOf<Double>()
    var aluno = AlunoN(28, "Thais", lista)

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
    print(aluno)

    for (valor in lista){
        println(valor)
    }
}




