package syntax

fun main() {
    println(3 + 5)
    println(3 - 5)
    println(3 / 5)
    println(3 * 5)
    println(3 % 5) // 산술연산자  항이 두개여서 이항연산자라고 한다.


    var value: Int = 0
    value = 8
    value = -value // -8
    value = -value // 8

    var days = 29
    println("2월달은 " + days + "일입니다.") //암시적이다 println이 알아서 정수형을 문자형으로 바꿔줌
    println("2월달은"+ days.toString() + "일입니다.") //명시적이다
    println("2월달은 ${days}일입니다.") //문자열 보간법 템플릿 문자열
}