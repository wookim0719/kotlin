package syntax

fun main() {
    // 숫자 데이터 형식: Int, Long (큰정수), Float(32비트 실수), Double (64비트 실수)등
    var min: Int = -2147483648 //정수형이 가질 수 있는 가장 작은 값
    var max: Int = +2147483647// 정수형이 가질 수 있는 가장 큰 값

    var pi: Double = 3.141592; // 배정밀도 부동 소수점 변수를 선언하고 값을 할당

    //숫자 구분자
    var lValue = 2_147_483_647;
    //형식 변환
    val ii: Int = 1234
    var ll: Long = ii.toLong();
    val dbl =12.34
    val iii : Int = dbl.toInt()
    println(iii)


}