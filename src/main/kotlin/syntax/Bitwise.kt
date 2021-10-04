package syntax

fun main() {
    var x: Int = 0b1010 //10  0b는 이진수 의미
    var y: Int = 0b1100 //12


    var z: Int =  x and y // 1and 1 ->1
    println(z) // 1000 = 8

    var k: Int =  x or y // 1or 0 -> 1
    println(k) // 1110

    var t: Int = x xor y  // 서로 다르면 1  같으면 0
    println(t) // 0110

    var l: Int = x.inv() // 0000_1010 -> 1111_0101
    println(l) // 0101

    var number =2 // 0b_0000_0010 <<1 >>1 shift left  shift right
// println(number shl 1 ) //왼쪽으로 한칸씩 0100

}