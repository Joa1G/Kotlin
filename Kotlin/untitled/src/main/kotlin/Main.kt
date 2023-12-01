import java.util.Scanner

fun main() {
    val leitor = Scanner(System.`in`)
    print("Digite um número e verifique se ele é par ou impar: ")
    var num: Double = leitor.nextDouble()
    if (num % 2 == 0.toDouble()){
        println("Seu número é PAR")
    } else {
        println("Seu número é IMPAR")
    }

}
