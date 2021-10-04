package syntax

fun main() {
    var kor =100
    var eng = 90
    var tot =0
    var avg =0.0


    tot = kor + eng // 총점 구하기
    avg = tot / 2.0// 평균구하기  나눌때 실수로 나눠줘야 실수값이 나옴

    var score = 60
    if (score >= 60) {
        println("합격")
    }

    var s1 = "hello"
    var s2 = "hello"
    if (s1==s2){
        println("same")
    }

    if (s1.equals(s2)){
        println("same")
    }

    var bln : Boolean = false
    if (!bln)
        println("True")

    var a =10
    if (a ==10 && a> 9)
        println("맞습니다")

    var sco = 50
     if(sco > 20) {
         println("합격")

     }
    else    print("불합격")

    println("첫번쨰 수:")
    var first: Int = ((readLine()) ?: "").toIntOrNull() ?: 0

    println("두번쨰 수:")
    var second: Int = ((readLine()) ?: "").toIntOrNull() ?: 0

    if(first >= second){
        println("큰 값 : $first")
    }
    else{
        println("큰 값: $second")
    }

    var goal = 0
    var grade ='F'
    println("당신의 점수는?")
    score = (readLine() ?: "").toIntOrNull() ?:0
     if (goal >= 90)
         grade= 'A'
    else if(goal >=80)
        grade = 'B'
    else
        grade= 'F'

    println("학점 : $grade")

}