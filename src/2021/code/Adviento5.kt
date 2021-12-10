package `2021`.code

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    // Take the data from the input
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input3.txt"))
    // Variables for the answer
    val gamma: String
    var epsilon = ""

    // Make a mutable list of my own class Num and fill it with the same amount of Num classes for the length of a data line
    var linea = f_ent.readLine()
    val listaNumeros = mutableListOf<Num>()
    for (i in linea.indices) {
        listaNumeros.add(Num())
    }
    // Put each line of data to a Char Array and the uses the method to check the input data
    while (linea != null){
        val charArray: CharArray = linea.toCharArray()

        comprobar(charArray, listaNumeros)

        linea = f_ent.readLine()
    }
    // Fill the gamma variable with the right answer and the make the epsilon variable by changing the bits 0 -> 1 && 1 -> 0
    gamma = verificar(listaNumeros)
    val gammaArray: CharArray = gamma.toCharArray()
    for (i in gammaArray.indices){
        if (gammaArray[i] == '0'){
            epsilon += "1"
        } else epsilon += "0"
    }
    // Transform the answers to Decimal form Binary
    val gammaDecimal: Long = gamma.toLong(2)
    val epsilonDecimal: Long = epsilon.toLong(2)
    // Calculate the result and print it
    val resultado = gammaDecimal * epsilonDecimal
    println(resultado)

}
// Check each of the given numbers and increment or decrement its individual Num class
fun comprobar(charArray: CharArray, nums: MutableList<Num>){
    for (i in charArray.indices){
        if (charArray[i] == '0'){
            nums[i].decrementar()
        } else nums[i].incrementar()
    }
}
// Checks the amount of times the number repeat and the sets the right value according to the specifications
fun verificar(nums: MutableList<Num>): String{
    var gamma = ""
    for (i in 0 until nums.size){
        if (nums[i].obtener() > 0){
            gamma += "1"
        } else gamma += "0"
    }
    return gamma
}
// My Num class that count the amount of times a number repeats
class Num {
    var num = 0
    fun incrementar(){ num += 1 }
    fun decrementar(){ num -= 1 }
    fun obtener(): Int { return num }
}
