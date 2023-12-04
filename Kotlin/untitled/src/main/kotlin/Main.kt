
fun main() {
    do {
        print("Digite um número e verifique se ele é par ou impar: ")
        val num: Double = readln().toDouble()
        if (num % 2 == 0.toDouble()) {
            println("Seu número é PAR")
        } else {
            println("Seu número é IMPAR")
        }
        print("Deseja continuar?[S/N]: ")
        val resp = readln()
    } while (resp == "S")
}
