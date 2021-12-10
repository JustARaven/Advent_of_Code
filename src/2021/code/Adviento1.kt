import java.io.BufferedReader
import java.io.FileReader

fun main() {
    // Take the data from the input
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input.txt"))

    // Add all the lines of the input to a single mutable list
    val numeros = mutableListOf<Int>()
    var linea = f_ent.readLine()
    while (linea != null){
        numeros.add(linea.toInt())
        linea = f_ent.readLine()
    }
    // Count the amount of times of consecutive increment
    var cuenta = 0
    var num = numeros[0]
    for (i in numeros) {
        if (num < i) {
            cuenta++
        }
        num = i
    }
    // Print the answer
    println(cuenta)

}