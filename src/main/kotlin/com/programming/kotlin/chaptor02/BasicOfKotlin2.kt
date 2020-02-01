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
    
}