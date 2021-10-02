package syntax

fun main() {
    // 할당(대입) 연산자 =

    //변수값 서로 바꾸기

    var i = 24;
    var j = 25;
    var temp: Int = i
    i=j
    j=i

    //  shortcut operator
    var num = 10;
    num += 1 // 1 증가 시키기
    num -= 1 // 1 감소 시키기

    var num2 = 100
    ++num2 // 101
    --num2 // 100    전위 증감 연산자: 우선순위가 높음(대입연산자보다 우선순위)

    var num3 = 3
    var num4: Int = i++ // num4에 대입이 먼저 되고 num3에 1이 더해져서 num3: 4, num4 : 3
    // 후위 증감 연산자: 우선순위가 낮음(대입연산자보다 후순위)

}