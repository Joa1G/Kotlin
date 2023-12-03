fun main() {
    println("==============================")
    println("   CONVERSOR DE TEMPERATURA   ")
    println("==============================")
    println("Primeiro diga a escala em que a temperatura está!")
    print("Para Celsius use [C], Para Fahrenheit use [F], Para Kelvin use [K]: ")
    var entrada = readln() // ler a entrada do usuário em String
    var escalaI: Char = entrada[0] // atribui valor à variável Char passando o caractere na posição 0 da String

    var condicional: Int? = null
    do {

        when (escalaI) {
            'C' -> {
                print("Agora digite a temperatura: ")
                val temperatura = readln().toDouble() // ler a entrada do usuário em String e converte pra Double
                val kelvin = temperatura + 273.15
                val fahrenheitUn = (temperatura * 1.8) + 32
                val fahrenheit = String.format("%.1f", fahrenheitUn)  /* transforma a val fahrenheitUn em String(val fahrenheit)
             e mostra apenas o 2º numero depois da virgula de val fahrenheitUn */
                println("Sua temperatura em fahrenheit é: $fahrenheit ºF")
                println("Sua temperatura em kelvin é: $kelvin K")
                condicional = 1

            }
            'F' -> {
                print("Agora digite a temperatura: ")
                val temperatura = readln().toDouble() // ler a entrada do usuário em String e converte pra Double
                val celsiusUn = (temperatura - 32) / 1.8
                val kelvinUn = celsiusUn + 273.15
                val celsius = String.format("%.1f", celsiusUn)  /* transforma a val celsiusUn em String(val celsius)
             e mostra apenas o 2º numero depois da virgula de val celsiusUn */
                val kelvin = String.format("%.2f", kelvinUn) /* transforma a val kelvinUn em String(val kelvin)
             e mostra apenas o 2º numero depois da virgula de val kelvinUn */
                println("Sua temperatura em celsius é: $celsius ºC")
                println("Sua temperatura em kelvin é: $kelvin K")
                condicional = 1

            }
            'K' -> {
                print("Agora digite a temperatura: ")
                val temperatura = readln().toDouble() // ler a entrada do usuário em String e converte pra Double
                val celsiusUn = temperatura - 273.15
                val fahrenheitUn = (celsiusUn * 1.8) + 32
                val celsius = String.format("%.1f", celsiusUn)  /* transforma a val celsiusUn em String(val celsius)
             e mostra apenas o 2º numero depois da virgula de val celsiusUn */
                val fahrenheit = String.format("%.2f", fahrenheitUn) /* transforma a val fahrenheitUn em String(val fahrenheit)
             e mostra apenas o 2º numero depois da virgula de val fahrenheitUn */
                println("Sua temperatura em celsius é: $celsius ºC")
                println("Sua temperatura em fahrenheit é: $fahrenheit ºF")
                condicional = 1
            }
            else -> {
                print("Erro! Adicione uma Escala Válida [C] [F] [K]: ")
                 entrada = readln() // ler a entrada do usuário em String
                 escalaI = entrada[0] // atribui valor à variável Char passando o caractere na posição 0 da String
            }
        }
    } while (condicional == null)
}
