package com.programming.kotlin.chaptor02

fun main(args: Array<String>){
//    루프
    /*
    while(true){
        println("무한반복")
    }
    */
    var list = listOf(1, 2, 3, 4)
    for(k in list){
        println(k)
    }
    val set = setOf(1, 2, 3, 4)
    for(k in set){
        println(k)
    }
    val oneToTen = 1..10
    for(k in oneToTen){
        for(j in 1..5){
            println(k*j)
        }
    }
//    이터레이터
    val string = "print my characters"
    for(char in string){
        println(char)
    }
//    배열의 indices 확장함수
    var array = arrayOf('c', 'b', 'n')
    for(index in array.indices){
        println("Element $index is ${array[index]}")
    }

//    예외 처리


}