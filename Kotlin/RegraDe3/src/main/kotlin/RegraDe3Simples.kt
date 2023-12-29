fun regraDe3Simples(){
    println("    REGRA DE 3 SIMPLES   ")

    print("1º Grandeza: ")
    val greatnessOne = readln()
    print("2º Grandeza: ")
    val greatnessTwo = readln()
    print("Para DIRETAMENTE [D] para INVERSAMENTE [I]: ")
    var dirOuInv = readln()
    if (dirOuInv != "D" && dirOuInv != "I") { //previne entradas inesperadas(diferentes de D ou I)
        do {
            print("ERRO! Digite 'D' ou 'I' : ")
            dirOuInv = readln()
        }while (dirOuInv != "D" && dirOuInv != "I")
    }

    var hasXSaved = 0
    println("Utilize 'X' para a variável")
    print("Valor inicial da grandeza $greatnessOne: ")  //V1G1
    var val1GreatOne = readln()
    if (val1GreatOne == "x") val1GreatOne = val1GreatOne.uppercase()

    if (val1GreatOne == "X") hasXSaved = 1

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val1GreatOne != "X" && val1GreatOne.containsLetters()) { // se variável diferente de X e não for número
            print("VALOR INVÁLIDO! Digite novamente: ")
            val1GreatOne = readln()
            if (val1GreatOne == "x") val1GreatOne = val1GreatOne.uppercase()
            if (val1GreatOne == "X") hasXSaved = 1
        }
    } while (val1GreatOne != "X" && val1GreatOne.containsLetters())

    val v1G1: Double = if (val1GreatOne != "X"){
        val1GreatOne.toDouble()
    }else {
        0.0
    }
    print("Valor final da grandeza $greatnessOne: ") //V2G1
    var val2GreatOne = readln()
    if (val2GreatOne == "x") val2GreatOne = val2GreatOne.uppercase()
    if (val2GreatOne == "X" && hasXSaved == 0){
        hasXSaved = 1
    }else if (val2GreatOne == "X"){
        do {
            print("Não podem haver 2 variáveis 'X', Digite novamente: ")
            val2GreatOne = readln()
            if (val2GreatOne == "x") val2GreatOne = val2GreatOne.uppercase()
        }while (val2GreatOne == "X")
    }

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val2GreatOne != "X" && val2GreatOne.containsLetters()) { // se variável diferente de X e não for número
            print("VALOR INVÁLIDO! Digite novamente: ")
            val2GreatOne = readln()
            if (val2GreatOne == "x") val2GreatOne = val2GreatOne.uppercase()
            if (val2GreatOne == "X" && hasXSaved == 0){
                hasXSaved = 1
            }else if (hasXSaved == 1 && val2GreatOne == "X"){
                do {
                    print("Não podem haver 2 variáveis 'X', Digite novamente: ")
                    val2GreatOne = readln()
                    if (val2GreatOne == "x") val2GreatOne = val2GreatOne.uppercase()
                }while (val2GreatOne == "X")
            }
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
    print("Valor inicial da grandeza $greatnessTwo: ") //V1G2
    var val1GreatTwo = readln()
    if (val1GreatTwo == "x") val1GreatTwo = val1GreatTwo.uppercase()
    if (val1GreatTwo == "X" && hasXSaved == 0){
        hasXSaved = 1
    }else if (val1GreatTwo == "X"){
        do {
            print("Não podem haver 2 variáveis 'X', Digite novamente: ")
            val1GreatTwo = readln()
            if (val1GreatTwo == "x") val1GreatTwo = val1GreatTwo.uppercase()
        }while (val1GreatTwo == "X")
    }

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val1GreatTwo != "X" && val1GreatTwo.containsLetters()) { // se variável diferente de X e contém letras
            print("VALOR INVÁLIDO! Digite novamente: ")
            val1GreatTwo = readln()
            if (val1GreatTwo == "x") val1GreatTwo = val1GreatTwo.uppercase()
            if (val1GreatTwo == "X" && hasXSaved == 0){
                hasXSaved = 1
            }else if (hasXSaved == 1 && val1GreatTwo == "X"){
                do {
                    print("Não podem haver 2 variáveis 'X', Digite novamente: ")
                    val1GreatTwo = readln()
                    if (val1GreatTwo == "x") val1GreatTwo = val1GreatTwo.uppercase()
                }while (val1GreatTwo == "X")
            }
        }
    } while (val1GreatTwo != "X" && val1GreatTwo.containsLetters())

    val v1G2: Double = if (val1GreatTwo != "X") {
        val1GreatTwo.toDouble()
    }else {
        0.0
    }

    print("Valor final da grandeza $greatnessTwo: ") //V2G2
    var val2GreatTwo = readln()
    if (val2GreatTwo == "x") val2GreatTwo = val2GreatTwo.uppercase()

    if (val2GreatTwo == "X" && hasXSaved == 0){
        hasXSaved = 1
    }else if (val2GreatTwo == "X"){
        do {
            print("Não podem haver 2 variáveis 'X', Digite novamente: ")
            val2GreatTwo = readln()
            if (val2GreatTwo == "x") val2GreatTwo = val2GreatTwo.uppercase()
        }while (val2GreatTwo == "X")
    }

    do {                                                              // repete enquanto as condições não forem atendidas
        if (val2GreatTwo != "X" && val2GreatTwo.containsLetters()) { // se variável diferente de X e contém letras
            print("VALOR INVÁLIDO! Digite novamente: ")
            val2GreatTwo = readln()
            if (val2GreatTwo == "x") val2GreatTwo = val2GreatTwo.uppercase()

            if (val2GreatTwo == "X" && hasXSaved == 0){
                hasXSaved = 1
            }else if (hasXSaved == 1 && val2GreatTwo == "X"){
                do {
                    print("Não podem haver 2 variáveis 'X', Digite novamente: ")
                    val2GreatTwo = readln()
                    if (val2GreatTwo == "x") val2GreatTwo = val2GreatTwo.uppercase()
                }while (val2GreatTwo == "X")
            }
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