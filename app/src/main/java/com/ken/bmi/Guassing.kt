package com.ken.bmi

import kotlin.random.Random

fun main() {

//    println(Random.nextInt(1,11)) //11 not above
//    println((1..10).random())
    val secrete = (1..10).random()
    println("serect: $secrete")
    var num =0
//    while(num != secrete) {
    var bingo = false
    for(i in 1..3) {
        println("PLZ enter a number bwn 1 to 10")
        val input = readLine()
        num = input?.toIntOrNull() ?: -1//?防null
        //num same name OK
        println("Ur Num is: $num ")//${input?.length}

        if (num < secrete) {
            println("Bigger")//${input?.length}
        } else if (num > secrete) {
            println("Smaller")
        } else {
            println("LUCK")
            bingo = true
            break  //leave nearest loop
        }
    }
    if (!bingo)
        println("Failed, its $secrete")
//    }

}