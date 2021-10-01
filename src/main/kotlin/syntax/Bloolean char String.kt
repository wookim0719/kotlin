package syntax

fun main() {
    //숫자 이외의 데이터 형식 : Boolean, Char, String 등의 숫자 이외의 데이터 저장
    var grade: Char = 'A'
    var kor = 'C'

    println(grade)
    println(kor)

    //문자열 보간(string Interpolation")
    var name: String = "김정우"
    println("안녕하세요. ${name}입니다")
    println("name: " + name)

    //논리자료형형
   var bln:Boolean = true //참
    println(bln)
}