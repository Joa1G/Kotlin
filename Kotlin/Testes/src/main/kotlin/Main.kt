package Kotlin.Testes.src.main.kotlin
import java.util.Scanner


fun main() {
    val reader = Scanner(System.`in`)
    print("Qual o seu nome? ")
    val name = readln()
    print("Que ano você nasceu? ")
    val year: Int = reader.nextInt()
    val age = 2023 - year
    var resp = if (age >= 20) && (age <= 30) {
                "Uau $name! então você tem $age anos de idade, que jovem"
            } else if (age < 20){
                    "Uau $name! você é tão novinho, $age anos "
            } else {
                    "Sai daqui velho imundo"
            }
    }
}