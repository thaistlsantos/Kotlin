import javax.swing.JOptionPane

fun main (args: Array<String>) {

    //Pede o nome do usuário:
    val nome = JOptionPane.showInputDialog("Digite seu nome: ")

    //formata a mensagem de saída
    val saida = String.format("%s %s", "Bem-Vindo", nome)

    // apresenta o texto em uma interface gráfica
    JOptionPane.showMessageDialog(null, saida)

    println("Bem-vindo $nome")

}