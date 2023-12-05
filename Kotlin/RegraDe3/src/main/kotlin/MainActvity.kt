// futuramente preciso melhorar esse programa com classes e arrays, mas ainda não sei
//talvez substituir as variáveis val1GreatOne e etc por uma array
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
    var val1GreatOne = readlnOrNull()

    if (val1GreatOne != "X"){
        val1GreatOne?.toDouble()
    }else {
        val1GreatOne = null
    }
    print("Valor final da grandeza $greatnessOne: ") //V2G1
    // verifica se o valor da variável é "X" se for X, variável recebe vazio, senão recebe A string e converte pra Double
    var val2GreatOne = readlnOrNull()

    if (val2GreatOne != "X"){
        val2GreatOne?.toDouble()
    }else {
        val2GreatOne = null
    }
    /*
    verifica se alguma das duas variáveis estão vazias, se sim vai verificar qual e mostrar X no lugar dela
    na sáida do código
     */

    if (val1GreatOne == null){
        println("OK, valor inicial da grandeza $greatnessOne: 'X' e final: $val2GreatOne")
    }else if (val2GreatOne == null) {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatOne e final: 'X' ")
    }else {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatOne e final: $val2GreatOne")
    }

    println("Por fim, preciso de: ")
    print("Valor inicial da grandeza $greatnessTwo: ") //V1G2
    // verifica se o valor da variável é "X" se for X, variável recebe vazio, senão recebe A string e converte pra Double
    var val1GreatTwo = readlnOrNull()

    if (val1GreatTwo != "X") {
        val1GreatTwo?.toDouble()
    }else {
        val1GreatTwo = null
    }

    print("Valor final da grandeza $greatnessTwo: ") //V2G2
    // verifica se o valor da variável é "X" se for X, variável recebe vazio, senão recebe A string e converte pra Double
    var val2GreatTwo = readlnOrNull()

    if (val2GreatTwo != "X") {
        val2GreatTwo?.toDouble()
    }else {
        val2GreatTwo = null
    }
    /*
    verifica se alguma das duas variáveis estão vazias, se sim vai verificar qual e mostrar X no lugar dela
    na sáida do código
     */

    if (val1GreatTwo == null){
        println("OK, valor inicial da grandeza $greatnessOne: 'X' e final: $val2GreatTwo")
    }else if (val2GreatTwo == null) {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatTwo e final: 'X' ")
    }else {
        println("OK, valor inicial da grandeza $greatnessOne: $val1GreatTwo e final: $val2GreatTwo")
    }

    // calculos de diretamente proporcional e de inversamente proporcional(falta adicionar)
    //https://brasilescola.uol.com.br/matematica/regra-tres-simples.htm
    /*
    tenho que verificar qual variável está vazia, se ela estiver vazia passa a receber o cálculo dos outros valores
    Diretamente {
    [se v1g1 = (v1g2 * v2g1)/v2g2 ]
    [se v2g1 = (v1g1 * v2g2)/v1g2 ]
    [se v1g2 = (v1g1 * v2g2)/v2g1 ]
    [se v2g2 = (v1g2 * v2g1)/v1g1 ]
    }
    */
  when (dirOuInv) {
        "D" -> {

        }
        "I" -> {

        }
    }

}