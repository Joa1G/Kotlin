fun main() {
    println("=================================")
    println("    CALCULADORA DE REGRA DE 3    ")
    println("=================================")
    println("Para regra de 3 simples  [1]")
    println("Para regra de 3 composta [2]")
    print(":")
    var pick = readln()
    if (pick != "1" && pick != "2") {
        do {
            print("ERRO! Escolha utilizando 1 ou 2 :")
            pick = readln()
        } while (pick != "1" && pick != "2")
    }
    when (pick) {
        "1" -> regraDe3Simples()
        "2" -> regraDe3Composta()
    }
}