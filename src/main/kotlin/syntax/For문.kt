package syntax

fun main() {

    for (i in 0..2)
        println("안녕하세요")


    for (i in 5 downTo 1 step 2)
        println("$i\t") // 5에서 하나씩 줄면서 출력


    for (i in 1 until 5) {
        print("$i\t")
    }   // 1 2 3 4

    for (c in "HElloworld") {
        print("%$c\n")

        var n = 3
        var sum = 0
        for (i in 1..n) {
            sum += i
        }

    }
    //구구단
    for (i in 1..9) { //행 출력{
        for (j in 2..9) // 열 출력
            print("$j*$i=${String.format("%2s", (j * i))} ")


        println()
    }
}
