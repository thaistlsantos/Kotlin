import java.util.Arrays  // importou a classe java.util.Arrays que permite a utilização de alguns métodos específicos

fun main(){
    val nums = arrayOf(1, 2, 3, 4, 5)  // criou um vetor com 5 elementos/valores
    println(nums.get(0))  // printou o valor que estava no index[0], ou seja o valor 1
    nums.set(0, 0)  // alterou o primeiro elemento do vetor para 0 (de 1 para 0)
    println(Arrays.toString(nums))  // converteu os elementos do array "nums" para string e apresentou na tela

    val nums2 = nums.plus(1)  // definiu uma nova val "nums2" com os elementos do array "nums" e passando a função plus(1) para adicionar 1 ao final
    println(Arrays.toString(nums2))  // converteu os elementos do array "nums2" para string e apresentou na tela

    val slice = nums.sliceArray(1..3)  // definiu uma nova val "slice" com os elementos de "nums" mantendo apenas os valores que estão no indice 1 ao 3 com a função sliceArray (1..3)
    println(Arrays.toString(slice))  // converteu os elementos do array "slice" para string e apresentou na tela
    println(nums.first())  // apresentou na tela o primeiro elemento do vetor "nums"
    println(nums.last())  // apresentou na tela o último elemento do vetor "nums"
    println(nums.indexOf(5)) // apresentou na tela a posição do índex do elemento/valor (5) referente a val "nums"
}
