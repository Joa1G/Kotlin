//função abaixo verifica se A String chamada possui caracteres letras
fun String.containsLetters(): Boolean { // função pra identificar se a variável possui número.
    return any { it.isLetter() }
}
fun main() {
    println("=================================")
    println("CALCULADORA DE REGRA DE 3 SIMPLES")
    println("=================================")

    println("Utilize 'X' para a variável")
    print("1º Grandeza: ")
    val greatnessOne = readlnOrNull()
    print("2º Grandeza: ")
    val greatnessTwo = readlnOrNull()
    println("OK, temos a grandeza: '$greatnessOne' e a grandeza: '$greatnessTwo' ")

    println("Preciso saber se a grandeza é direta ou inversamente proporcional!")
    print("Para DIRETAMENTE [D] para INVERSAMENTE [I]: ")
    var dirOuInv = readln()
    if (dirOuInv != "D" && dirOuInv != "I") { //previne entradas inesperadas(diferentes de D ou I)
        do {
            print("ERRO! Digite 'D' ou 'I' : ")
            dirOuInv = readln()
        }while (dirOuInv != "D" && dirOuInv != "I")
    }
    println("Agora preciso de: ")
    print("Valor inicial da grandeza $greatnessOne: ")  //V1G1
    var val1GreatOne = readln()

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val1GreatOne != "X" && val1GreatOne.containsLetters()) { // se variável diferente de X e contém letra
            print("VALOR INVÁLIDO! Digite novamente: ")
            val1GreatOne = readln()
        }
    } while (val1GreatOne != "X" && val1GreatOne.containsLetters())

    val v1G1: Double = if (val1GreatOne != "X"){
        val1GreatOne.toDouble()
    }else {
        0.0
    }
    print("Valor final da grandeza $greatnessOne: ") //V2G1
    var val2GreatOne = readln()

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val2GreatOne != "X" && val2GreatOne.containsLetters()) { // se variável diferente de X e contém letra
            print("VALOR INVÁLIDO! Digite novamente: ")
            val2GreatOne = readln()
        }
    } while (val2GreatOne != "X" && val2GreatOne.containsLetters())

    /* se variável primária diferente de X transforma em double e coloca numa variável secundária,
     se igual a X variável secundária recebe 0.0 */
    val v2G1: Double = if (val2GreatOne != "X"){
        val2GreatOne.toDouble()
    }else {
        0.0
    }

    if (v1G1 == 0.0){
        println("OK, valor inicial da grandeza $greatnessOne: 'X' e final: $val2GreatOne")
    }else if (v2G1 == 0.0) {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatOne e final: 'X' ")
    }else {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatOne e final: $val2GreatOne")
    }

    println("Por fim, preciso de: ")
    print("Valor inicial da grandeza $greatnessTwo: ") //V1G2
    var val1GreatTwo = readln()

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val1GreatTwo != "X" && val1GreatTwo.containsLetters()) { // se variável diferente de X e contém letras
            print("VALOR INVÁLIDO! Digite novamente: ")
            val1GreatTwo = readln()
        }
    } while (val1GreatTwo != "X" && val1GreatTwo.containsLetters())

    val v1G2: Double = if (val1GreatTwo != "X") {
        val1GreatTwo.toDouble()
    }else {
        0.0
    }

    print("Valor final da grandeza $greatnessTwo: ") //V2G2
    var val2GreatTwo = readln()

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val2GreatTwo != "X" && val2GreatTwo.containsLetters()) { // se variável diferente de X e contém letras
            print("VALOR INVÁLIDO! Digite novamente: ")
            val2GreatTwo = readln()
        }
    } while (val2GreatTwo != "X" && val2GreatTwo.containsLetters())

    /* se variável primária diferente de X transforma em double e coloca numa variável secundária,
     se igual a X variável secundária recebe 0.0 */
    val v2G2: Double = if (val2GreatTwo != "X") {
        val2GreatTwo.toDouble()
    }else {
        0.0
    }

    if (v1G2 == 0.0){
        println("OK, valor inicial da grandeza $greatnessTwo: 'X' e final: $val2GreatTwo")
    }else if (v2G2 == 0.0) {
        println("OK, valor inicial da grandeza $greatnessTwo: $val1GreatTwo e final: 'X' ")
    }else {
        println("OK, valor inicial da grandeza $greatnessTwo: $val1GreatTwo e final: $val2GreatTwo")
    }

    // calculos de diretamente proporcional e de inversamente proporcional
    /*
    tenho que verificar qual variável está vazia, se ela estiver vazia passa a receber o cálculo dos outros valores
    Diretamente {
    [se v1g1 = (v1g2 * v2g1)/v2g2 ]
    [se v2g1 = (v1g1 * v2g2)/v1g2 ]
    [se v1g2 = (v1g1 * v2g2)/v2g1 ]
    [se v2g2 = (v1g2 * v2g1)/v1g1 ]
    }

    Inversamente {
    [se v1g1 = (v2g1 * v2g2)/v1g2 ]
    [se v2g1 = (v1g1 * v1g2)/v2g2 ]
    [se v1g2 = (v2g1 * v2g2)/v1g1 ]
    [se v2g2 = (v1g1 * v1g2)/v2g1 ]
    }
    */
    var result = 0.0
  when (dirOuInv) {
        "D" -> {
            if (v1G1 == 0.0){
                result = (v1G2 * v2G1)/v2G2
            }else if (v2G1 == 0.0){
                result = (v1G1 * v2G2)/v1G2
            }else if (v1G2 == 0.0){
                result = (v1G1 * v2G2)/v2G1
            }else if (v2G2 == 0.0) {
                result = (v1G2 * v2G1)/v1G1
            }
        }
        "I" -> {
            if (v1G1 == 0.0){
                result = (v2G1 * v2G2)/v1G2
            }else if (v2G1 == 0.0){
                result = (v1G1 * v1G2)/v2G2
            }else if (v1G2 == 0.0){
                result = (v2G1 * v2G2)/v1G1
            }else if (v2G2 == 0.0) {
                result = (v1G1 * v1G2)/v2G1
            }
        }
  }
    val resultChange = String.format("%.2f", result)
    // resultado personalizado conforme grandeza
    if (v1G1 == 0.0 || v2G1 == 0.0) {
        println("O valor de 'X' é: $resultChange $greatnessOne")
    }else if (v1G2 == 0.0 || v2G2 == 0.0) {
        println("O valor de 'X' é: $resultChange $greatnessTwo")
    }

}