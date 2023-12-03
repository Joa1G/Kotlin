fun main() {
    println("Primeiro diga a escala em que a temperatura está!")
    print("Para Celsius use [C], Para Fahrenheit use [F], Para Kelvin use [K]: ")
    var entrada = readln()
    val escalaI: Char = entrada[0]
    print("Agora digite a temperatura: ")
    val temperatura = readln().toDouble()
    print("Agora digite a escala que quer converter[C;F;K]: ")
    entrada = readln()
    val escalaF: Char = entrada[0]
    if (escalaI == 'C' && escalaF == 'F') {
        //(0 °C × 9/5) + 32 = 32 °F
        val temperaturaF = (temperatura * 1.8) + 32
        val tempF = String.format("%.2f", temperaturaF) // transforma a temperatura em String e mostra apenas o 2º numero depois da virgula
        println("Sua temperatura em Fahrenheit é: $tempF º$escalaF")
    }else if (escalaI == 'C' && escalaF == 'K') {
        //0 °C + 273,15 = 273,15 K
        val temperaturaF = temperatura + 273.15
        println("Sua temperatura em Kelvin é: $temperaturaF $escalaF")
    }
}