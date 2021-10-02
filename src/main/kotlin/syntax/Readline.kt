package syntax

fun main() {
   // readLine() //이 시점에서 대기하는 효과
   // println(readLine()) //한줄을 읽어와서 println()이 출력한다

    println("이름을 입력하시오: ")
    var name = readLine()
    println("안녕하세요. ${name}님")


    print("나이를 입력하시오.")
    val temp = readLine() ?: ""
    val intage: Int = temp.toIntOrNull() ?: 0
    println("당신의 나이는 $intage 입니다")
}