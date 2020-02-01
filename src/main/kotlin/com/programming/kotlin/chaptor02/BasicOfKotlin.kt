package com.programming.kotlin.chaptor02

fun main(args: Array<String>){
//    두가지 변수 선언 키워드
//      01 var과 val

//    var
//    값 재지정 및 다른 값으로 변경 가능
    var name01 = "kotlin01"

//    var는 초기화를 나중에 할 수도 있다.
    var name02: String
    name02 = "kotlin02"

//    val
//    읽기 전용 변수
//    반드시 선언시 초기화 해야함
    val name03 = "kotlin03"

//    02 타입 추론
//    변수 선언 시 변수 타입을 명시하지 않아도 타입 추론
//    ':'를 사용해 명시적으로 선언 할 수도 있음
    fun plusOne(x: Int) = x + 1

    val explicitType: Number = 12.3

//      03 기본 타입
//    숫자 리터럴을 생성하기 위한 형식
    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b01010101

//    코틀린은 자동으로 숫자를 확장하지 않음으로 반드시 명시적으로 변환해야 한다
    val int2 = 123
    val long2 = int2.toLong()
    val float2 = 12.34F
    val double2 = float2.toDouble()

//    코틀린의 비트연산자
    val leftShift = 1 shl 2
    val rightShift = 1 shr 2
    val unsignedRightShift = 1 ushr 2

    val and = 1 and 0x00001111
    val or = 1 or 0x00001111
    val xor = 1 xor 0x00001111
    val inv = 1.inv()

//    코틀린의 불리언(boolean)
    val x = 1
    val y = 2
    val z = 2

    val isTrue = x < y && x < z
    val alsoTrue = x == y || y == z

//    코틀린의 문자열
    val String = "string with \nnew line"
    val rawString = """
        raw string is super 
    usefule for strings 
        that span many lines """

//    코틀린의 배열
    var array = arrayOf(1, 2, 3)
    val perfectSquares = Array(10, {k -> k * k})
//    이터레이터와 get, set, size등 함수 제공
    perfectSquares.get(3)
//    괄호 문법도 가능
    perfectSquares[3]

//    문자열 템플릿
    val name = "sam"
    val sayHello = "hello " + name
    val sayHello2 = "hello $name and you have ${name.length} characters"

//    범위표현
    val aToz = 'a'..'z'
    val oneToNine = 1..9
    val isTrue2 = 'c' in aToz
    val isFalse = 11 in oneToNine
//    숫자를 하나씩 내리는 순으로 범위 생성: downTo()
//    숫자를 하나씩 올리는 순으로 범위 생성: rangeTo()
    val countingDown = 100.downTo(0)
    val rangeTo = 10.rangeTo(20)
//    범위 생성 후 새로운 범위를 반환하는 형식으로 범위를 변경
    val oneToFifty = 1..50
    val oddNumbers = oneToFifty.step(2)
//    범위를 거꾸로 변환
    val countingDownEvenNumbers = (2..100).step(2).reversed()
}
