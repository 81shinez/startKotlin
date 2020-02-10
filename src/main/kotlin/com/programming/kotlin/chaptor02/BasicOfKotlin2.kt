package com.programming.kotlin.chaptor02

import java.io.File
import java.io.IOException
import java.math.BigDecimal
import java.nio.file.Files
import java.nio.file.Path

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
    fun readFile(path: Path): Unit {
        val input = Files.newInputStream(path)
        try{
            var byte = input.read()
            while(byte != -1){
                println(byte)
                byte = input.read()
            }
        } catch (e: IOException){
            println("Error reading from file. Error was ${e.message}")
        } finally {
            input.close()
        }
    }

//    클래스 인스턴스화 하기
    val file = File("/etc/nginx/nginx.conf")
    val date = BigDecimal(100)

//    참조 동등성(call by reference), 구조 동등성(call by value)
    val a = File("/mobydic.doc")
    val b = File("/mobydic.doc")
    val sameRef = (a === b) // false, a와 b는 서로 다른 인스턴스이기 때문이다
    val structural = (a==b) // true, a와 b는 같은 값을 가졌다

//    this 표현식
    class Person(name: String) {
        fun printMe() = println(this)
    }

//    스코프
//    중첩 스코프에서 바깥 인스턴스를 참조하기 위해서는 this 사용 권한을 얻어야 한다
//    레이블을 사용해 이를 얻을 수 있다
    class Building(val address: String){
        inner class Reception(telephone: String){
            fun printAddress() = println(this@Building.address)
        }
    }

//    가시성 제어
//    public, internal, protected, private (default: public)
//    private는 오직 같은 파일 내에서만 접근 가능
    class Person02{
        private fun age(): Int = 21
    }
//    최상위 함수, 클래스, 인터페이스, 객체는 protected로 선언 할 수 없다
//    클래스나 인터페이스 내부에서 protected로 선언한 함수나 프로퍼티는 해당 클래스, 인터페이스, 서브클래스멤버까지 접근 가능
//
//    internal은 모듈 개념
//    같은 모듈의 다른 클래스, 함수에서 접근 가능
//    internal class Person03{
//        fun age(): Int = 21
//    }

}