package syntax

fun main(args: Array<string>) {
    //변수: 프로그램에서 사용할 데이터를 임시로 저장해놓는 그릇이다.
    var number: Int = 1234
    var message: String = "Hello"
    number =200 // 상수가 아니므로 오류가 나지 않는다.
    //상수
    var PI = 24
    println(number)
    println(message)
    println(PI)
    //리터럴
    println(1234) // 정수 리터럴
    println(3.14) // 실수 리터럴
    println('a') //문자 리터럴 문자 하나만 들어올수있다.
    print("Hello") // 문자열 리터럴

    //상수: 변하지 않는 변수 , 읽기 전용변수
    val max = 100
    //max = 200 오류가 난다 변수가 아니고 상수이므로
    println(max)
}