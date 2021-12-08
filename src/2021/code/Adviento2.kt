import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input.txt"))

    val numero = mutableListOf<Int>()
    var linea = f_ent.readLine()
    while (linea != null){
        numero.add(linea.toInt())
        linea = f_ent.readLine()
    }

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
    println(cuenta)
}