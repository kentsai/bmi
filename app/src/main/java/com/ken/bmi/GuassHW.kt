package com.ken.bmi

fun main() {
    //    println(Random.nextInt(1,11)) //11 not above
//    println((1..10).random())
    val secrete = (1..10).random()
    println("serect: $secrete")
    var num =0
    var bingo = false
    while(num != secrete) {

//    for(i in 1..3) {
        if (!bingo) {
            println("PLZ enter a number between 1 to 10")
            bingo = true
        }
        val input = readLine()
        num = input?.toIntOrNull() ?: -1//?防null
        //num same name OK
        println("Ur Num is: $num ")//${input?.length}

        if (num < secrete) {
            println("PLZ enter a number between $num to 10")//${input?.length}
        } else if (num > secrete) {
            println("PLZ enter a number between 1 to $num")
        } else {
            println("U got it")

            break  //leave nearest loop
        }

    }
}