fun main() {
    println("=================================")
    println("    CALCULADORA DE REGRA DE 3    ")
    println("=================================")
    println("Para regra de 3 simples  [1]")
    println("Para regra de 3 composta [2]")
    print(":")
    var pick = readln().toInt()
    do {
        when (pick) {
            1 -> {
                regraDe3Simples()
            }
            2 -> {
                regraDe3Composta()
            }
            else -> {
                print("Escolha inválida, escolha novamente: ")
                pick = readln().toInt()
            }
        }
    }while (pick != 1 && pick != 2)
}