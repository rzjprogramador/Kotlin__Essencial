

fun main() {
    var lista = listOf(1,2,3,4,5,6,7,8,9,10)
    var maiorQueCinco = lista.filter{int-> int >= 5}
    println(maiorQueCinco)
}