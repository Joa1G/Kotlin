fun main() {
    println("=================================")
    println("    CALCULADORA DE REGRA DE 3    ")
    println("=================================")
    println("Para regra de 3 simples  [1]")
    println("Para regra de 3 composta [2]")
    print(":")
    var pick = readln().toInt()
    var control = 0
    do {
        when (pick) {
            1 -> {
                regraDe3Simples()
                control = 1
            }
            2 -> {
                regraDe3Composta()
                control = 1
            }
            else -> {
                print("Escolha inválida, escolha novamente: ")
                pick = readln().toInt()
            }
        }
    }while (control == 0)
}