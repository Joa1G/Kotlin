fun String.containsLetters(): Boolean {
    return any { it.isLetter() }
}
fun hasX(list: MutableList<Any>): String{
    var verify = 0
    for (index in list.indices){
        if (list[index] == "X"){
            verify = 1
        }
    }
    return if (verify == 1) "Have" else "Don't Have"
}
fun List<Double>.mult(): Double{
    var accumulator = 1.0
    for (element in this){
        accumulator *= element
    }
    return accumulator
}