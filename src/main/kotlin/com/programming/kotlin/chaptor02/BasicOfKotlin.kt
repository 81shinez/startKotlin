package com.programming.kotlin.chaptor02

fun main(args: Array<String>){
//    두가지 변수 선언 키워드
//    01 var과 val

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

}