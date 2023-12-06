// futuramente preciso melhorar esse programa com classes e arrays, mas ainda não sei
//talvez substituir as variáveis val1GreatOne e etc por uma array
//verificar automaticamente se é direta ou inversamente proporcional
//previnir possíveis entradas inesperadas no programa
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
    val dirOuInv = readln()
    println("Agora preciso de: ")
    print("Valor inicial da grandeza $greatnessOne: ")  //V1G1
    // verifica se o valor da variável é "X" se for X, variável recebe vazio, senão recebe A string e converte pra Double
    val val1GreatOne = readln()

    val v1G1: Double = if (val1GreatOne != "X"){
        val1GreatOne.toDouble()
    }else {
        0.0
    }
    print("Valor final da grandeza $greatnessOne: ") //V2G1
    // verifica se o valor da variável é "X" se for X, variável recebe vazio, senão recebe A string e converte pra Double
    val val2GreatOne = readln()

    val v2G1: Double = if (val2GreatOne != "X"){
        val2GreatOne.toDouble()
    }else {
        0.0
    }
    /*
    verifica se alguma das duas variáveis estão vazias, se sim vai verificar qual e mostrar X no lugar dela
    na sáida do código
     */

    if (v1G1 == 0.0){
        println("OK, valor inicial da grandeza $greatnessOne: 'X' e final: $val2GreatOne")
    }else if (v2G1 == 0.0) {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatOne e final: 'X' ")
    }else {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatOne e final: $val2GreatOne")
    }

    println("Por fim, preciso de: ")
    print("Valor inicial da grandeza $greatnessTwo: ") //V1G2
    // verifica se o valor da variável é "X" se for X, variável recebe vazio, senão recebe A string e converte pra Double
    val val1GreatTwo = readln()

    val v1G2: Double = if (val1GreatTwo != "X") {
        val1GreatTwo.toDouble()
    }else {
        0.0
    }

    print("Valor final da grandeza $greatnessTwo: ") //V2G2
    // verifica se o valor da variável é "X" se for X, variável recebe vazio, senão recebe A string e converte pra Double
    val val2GreatTwo = readln()

    val v2G2: Double = if (val2GreatTwo != "X") {
        val2GreatTwo.toDouble()
    }else {
        0.0
    }
    /*
    verifica se alguma das duas variáveis estão vazias, se sim vai verificar qual e mostrar X no lugar dela
    na sáida do código
     */

    if (v1G2 == 0.0){
        println("OK, valor inicial da grandeza $greatnessOne: 'X' e final: $val2GreatTwo")
    }else if (v2G2 == 0.0) {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatTwo e final: 'X' ")
    }else {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatTwo e final: $val2GreatTwo")
    }

    // calculos de diretamente proporcional e de inversamente proporcional(falta adicionar)
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