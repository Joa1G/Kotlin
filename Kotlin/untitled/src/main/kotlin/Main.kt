
fun main() {
    do {
        print("Digite um número e verifique se ele é par ou impar: ")
        var num: Double = readln().toDouble()
        if (num % 2 == 0.toDouble()) {
            println("Seu número é PAR")
        } else {
            println("Seu número é IMPAR")
        }
        print("Deseja continuar?[S/N]: ")
        var resp = readln()
    } while (resp == "S")
}
