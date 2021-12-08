import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input2.txt"))
    var horizontal = 0
    var profundidad = 0
    var direccion = 0

    var linea = f_ent.readLine()
    while (linea != null){
        val parts: List<String> = linea.toString().split(" ")

        if (parts[0] == "forward"){
            horizontal += parts[1].toInt()
            profundidad += (direccion * parts[1].toInt())
        } else if (parts[0] == "down"){
            direccion += parts[1].toInt()
        } else if (parts[0] == "up"){
            direccion -= parts[1].toInt()
        }
        linea = f_ent.readLine()
    }

    val resultado = profundidad * horizontal
    println(resultado)

}