import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input.txt"))

    val numeros = mutableListOf<Int>()
    var linea = f_ent.readLine()
    while (linea != null){
        numeros.add(linea.toInt())
        linea = f_ent.readLine()
    }

    var cuenta = 0
    var num = numeros[0]
    for (i in numeros) {
        if (num < i) {
            cuenta++
        }
        num = i
    }
    println(cuenta)

}