package `2021`.code

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input3.txt"))
    val gamma: String
    var epsilon = ""

    val listaNumeros = mutableListOf<Num>()
    for (i in 0..11) {
        listaNumeros.add(Num())
    }

    var linea = f_ent.readLine()
    while (linea != null){
        val charArray: CharArray = linea.toCharArray()

        comprobar(charArray, listaNumeros)

        linea = f_ent.readLine()
    }

    gamma = verificar(listaNumeros)
    val gammaArray: CharArray = gamma.toCharArray()
    for (i in gammaArray.indices){
        if (gammaArray[i] == '0'){
            epsilon += "1"
        } else epsilon += "0"
    }

    val gammaDecimal: Long = gamma.toLong(2)
    val epsilonDecimal: Long = epsilon.toLong(2)

    val resultado = gammaDecimal * epsilonDecimal

    println(resultado)

}
fun comprobar(charArray: CharArray, nums: MutableList<Num>){
    for (i in charArray.indices){
        if (charArray[i] == '0'){
            nums[i].decrementar()
        } else nums[i].incrementar()
    }
}
fun verificar(nums: MutableList<Num>): String{
    var gamma = ""
    for (i in 0 until nums.size){
        if (nums[i].obtener() > 0){
            gamma += "1"
        } else gamma += "0"
    }
    return gamma
}
class Num {
    var num = 0
    fun incrementar(){ num += 1 }
    fun decrementar(){ num -= 1 }
    fun obtener(): Int { return num }
}
