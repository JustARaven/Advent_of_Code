import java.io.BufferedReader
import java.io.FileReader

fun main() {
    // Take the data from the input
    val f_ent = BufferedReader(FileReader("src\\2021\\inputs\\input2.txt"))
    // Variables for the movement
    var horizontal = 0
    var profundidad = 0

    //Split each line of data in a word and a number, then based on the word increase or decrease one of the variables
    var linea = f_ent.readLine()
    while (linea != null){
        val parts: List<String> = linea.toString().split(" ")

        if (parts[0] == "forward"){
            horizontal += parts[1].toInt()
        } else if (parts[0] == "down"){
            profundidad += parts[1].toInt()
        } else if (parts[0] == "up"){
            profundidad -= parts[1].toInt()
        }
        linea = f_ent.readLine()
    }
    // Calculate the result
    val resultado = profundidad * horizontal
    println(resultado)

}