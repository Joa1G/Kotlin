fun regraDe3Composta() {
    println("    REGRA DE 3 COMPOSTA    ")

    print("Quantas grandezas possuem ao todo? :")
    var numGreatnessStr = readln()
    if (numGreatnessStr.containsLetters()){
        do {
            print("ERRO! Digite apenas números: ")
            numGreatnessStr = readln()
        }while (numGreatnessStr.containsLetters())
    }
    var numGreatness = numGreatnessStr.toInt()
    if (numGreatness < 3){
        do {
            print("Regras de 3 compostas possuem no mínimo 3 grandezas, Digite novamente: ")
            numGreatnessStr = readln()
            if (numGreatnessStr.containsLetters()){
                do {
                    print("ERRO! Digite apenas números: ")
                    numGreatnessStr = readln()
                }while (numGreatnessStr.containsLetters())
            }
            numGreatness = numGreatnessStr.toInt()
        }while (numGreatness < 3)
    }

    val nameGreatness: MutableList<String> = mutableListOf()
    val startValuesOfGreatness: MutableList<Any> = mutableListOf()
    val finalValuesOfGreatness: MutableList<Any> = mutableListOf()

    println("Digite o nome dado a cada grandeza: ")
    for (i in 0..<numGreatness) {

        print("${i + 1}º grandeza: ")
        nameGreatness.add(readln())

        println("Utilize 'X' para grandeza!")

        print("Valor inicial de ${nameGreatness[i]} : ")
        var sVG = readln()
        if (sVG == "X") {
            startValuesOfGreatness.add(sVG.uppercase())
        } else if (sVG.containsLetters()) {
            do {
                print("ERRO! valor inválido, Digite novamente: ")
                sVG = readln()
            } while (sVG.containsLetters() && sVG != "X")
            if (sVG != "X") startValuesOfGreatness.add(sVG.toDouble()) else startValuesOfGreatness.add(sVG.uppercase())
        } else {
            startValuesOfGreatness.add(sVG.toDouble())
        }

        print("Valor final de ${nameGreatness[i]} : ")
        var fVG = readln()
        if (fVG == "X") {
            finalValuesOfGreatness.add(fVG.uppercase())
        } else if (fVG.containsLetters()) {
            do {
                print("ERRO! valor inválido, Digite novamente: ")
                fVG = readln()
            } while (fVG.containsLetters() && fVG != "X")
            if (fVG != "X") finalValuesOfGreatness.add(fVG.toDouble()) else finalValuesOfGreatness.add(fVG.uppercase())
        } else {
            finalValuesOfGreatness.add(fVG.toDouble())
        }
    }
    println("Produto é a grandeza no qual as outras grandezas operam em prol.")
    print("Quais dessas grandezas $nameGreatness é o produto? [DIGITE A GRANDEZA DA MESMA FORMA] :")
    var product = readln()
    var indexProduct = nameGreatness.indexOf(product)
    if (indexProduct == -1) {
        do {
            print("DIGITE A GRANDEZA CORRETAMENTE: ")
            product = readln()
            indexProduct = nameGreatness.indexOf(product)
        } while (indexProduct == -1)
    }

    val storageOfStartGreatnessValue = startValuesOfGreatness[indexProduct]
    startValuesOfGreatness[indexProduct] = finalValuesOfGreatness[indexProduct]
    finalValuesOfGreatness[indexProduct] = storageOfStartGreatnessValue

    var lineOfX = ""
    if (hasX(startValuesOfGreatness) == "Have") {
        lineOfX = "SVG"
    } else if (hasX(startValuesOfGreatness) == "Don't Have") {
        lineOfX = "FVG"
    }
    val multiplicationOfFirstLine: Double
    val multiplicationOfSecondLine: Double
    var result: Double? = null
    if (lineOfX == "SVG") {
        startValuesOfGreatness.remove("X")
        multiplicationOfFirstLine = ((startValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        multiplicationOfSecondLine = ((finalValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        result = (multiplicationOfSecondLine / multiplicationOfFirstLine)
    } else if (lineOfX == "FVG") {
        finalValuesOfGreatness.remove("X")
        multiplicationOfSecondLine = ((finalValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        multiplicationOfFirstLine = ((startValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        result = multiplicationOfFirstLine / multiplicationOfSecondLine
    }
    println("O valor de 'X' é: $result")
}