package syntax

fun main() {
    var x = 3
    var y =5

    println(x==y) //false
    println(x!=y) //true

    // && 연산자 : 둘 다 참일 떄만 참
    println(true && true)// true
    println(true && false) // false

    // || : 둘 중 하나만이라도 참일때 참
    println(true || false) // true
    println(false || false ) //false

    // !: 단항  not연산자
    println(!true) // false


}