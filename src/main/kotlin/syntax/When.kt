package syntax

fun main() {
    var x= 2

    when(x) {
        1 -> println("1입니다.")
        2 -> println("2입니다.")
        else -> {
            println("1과 2가 아닙니다.")
        }
    }

    println("가장 좋아하는  프로그램언어는?")
    print("1. c\t")
    print("1. Java\t")
    print("1. c++\t")
    print("1. Kotlin\n")

    val choice = (readLine() ?: "").toIntOrNull() ?: 0
    when (choice) {
        1 -> println("c 선택")
        2 -> println("Java 선택")
        in 3..4 -> println("c++ 선택") // 3과 4사이 범위를지정
        else -> println("Kotlin 선택")
    }

}