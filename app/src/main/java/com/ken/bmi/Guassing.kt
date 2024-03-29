package com.ken.bmi

fun main() {
    println("PLZ enter a number bwn 1 to 10")
    val input= readLine()
    val num:Int = input?.toIntOrNull() ?: -1//?防null

    println("Ur Num is: $num ")//${input?.length}
}