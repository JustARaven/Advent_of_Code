import java.io.BufferedReader
import java.io.FileReader

fun main() {
    // Take the data from the input
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input.txt"))

    // Add all the lines of the input to a single mutable list
    val numero = mutableListOf<Int>()
    var linea = f_ent.readLine()
    while (linea != null){
        numero.add(linea.toInt())
        linea = f_ent.readLine()
    }
    // Count the amount of times that the sum of three numbers increases
    var sumaAnterior = 0
    var cuenta = 0
    for (i in 0 until numero.size){
        if (i < numero.size-3){
            val suma = numero[i] + numero[i+1] + numero[i+2]
            if (suma > sumaAnterior){
                cuenta++
            }
            sumaAnterior = suma
        }
    }
    // Print the answer
    println(cuenta)
}