fun regraDe3Composta(){
    println("    REGRA DE 3 COMPOSTA    ")
    print("Quantas grandezas possuem ao todo? :")
    val numGreatness = readln().toInt()
    val nameGreatness: MutableList<String> = mutableListOf()
    val startValuesOfGreatness: MutableList<Int> = mutableListOf()
    val finalValuesOfGreatness: MutableList<Int> = mutableListOf()
    println("Digite o nome dado a cada grandeza: ")
    for (i in 0..<numGreatness){
        print("${i+1}º grandeza: ")
        nameGreatness.add(readln())
        print("Valor inicial de ${nameGreatness[i]} [Use 'X' para à variável]: ")
        startValuesOfGreatness.add(readln().toInt())
        print("Valor final de ${nameGreatness[i]} [Use 'X' para à variável]: ")
        finalValuesOfGreatness.add(readln().toInt())
//        println("${nameGreatness[i]}, i: ${startValuesOfGreatness[i]} f: ${finalValuesOfGreatness[i]}")
    }
}