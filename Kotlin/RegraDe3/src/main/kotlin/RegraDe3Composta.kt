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

    for (i in 0..<numGreatness) {

        print("Digite o nome da ${i + 1}º grandeza: ")
        nameGreatness.add(readln())

        println("Utilize 'X' para a variável!")

        print("Valor inicial de ${nameGreatness[i]} : ")
        var sVG = readln()
        if (sVG == "x") sVG = sVG.uppercase()
        if (sVG == "X") {
            startValuesOfGreatness.add(sVG)
        } else if (sVG.containsLetters()) {
            do {
                print("ERRO! valor inválido, Digite novamente: ")
                sVG = readln()
                if (sVG == "x") sVG= sVG.uppercase()
            } while (sVG.containsLetters() && sVG != "X")
            if (sVG != "X") startValuesOfGreatness.add(sVG.toDouble()) else startValuesOfGreatness.add(sVG)
        } else {
            startValuesOfGreatness.add(sVG.toDouble())
        }

        print("Valor final de ${nameGreatness[i]} : ")
        var fVG = readln()
        if (fVG == "x") fVG = fVG.uppercase()
        if (fVG == "X") {
            finalValuesOfGreatness.add(fVG)
        } else if (fVG.containsLetters()) {
            do {
                print("ERRO! valor inválido, Digite novamente: ")
                fVG = readln()
                if (fVG == "x") fVG = fVG.uppercase()
            } while (fVG.containsLetters() && fVG != "X")
            if (fVG != "X") finalValuesOfGreatness.add(fVG.toDouble()) else finalValuesOfGreatness.add(fVG)
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

    val lineOfX = if (hasX(startValuesOfGreatness) == "Have") "SVG" else "FVG"

    val indexOfX = if (hasX(startValuesOfGreatness) == "Have") {
        startValuesOfGreatness.indexOf("X")
    } else {
        finalValuesOfGreatness.indexOf("X")
    }

    val multiplicationOfFirstLine: Double
    val multiplicationOfSecondLine: Double
    val result: Double
    if (lineOfX == "SVG") {
        startValuesOfGreatness.remove("X")
        multiplicationOfFirstLine = ((startValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        multiplicationOfSecondLine = ((finalValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        result = (multiplicationOfSecondLine / multiplicationOfFirstLine)
    } else {
        finalValuesOfGreatness.remove("X")
        multiplicationOfSecondLine = ((finalValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        multiplicationOfFirstLine = ((startValuesOfGreatness.map { it.toString() }).map { it.toDouble() }).mult()
        result = (multiplicationOfFirstLine / multiplicationOfSecondLine)
    }
    println("O valor de 'X' é: $result ${nameGreatness[indexOfX]}")
}