package com.ken.bmi

fun main() {
    var name:String? ="Ken"

    if (name != null) {
        println(name.length)
    } //? if not null => length
    println(name?.get(0))//? if not null => get
    println( name ?: 0 ) //貓王表示法
//    name = null

//    var counter = 0;
//    counter += 1
//    counter --
//    println(10%4)
//    println(10/3.0)
//    println(counter)
//    //Boolean
//    var b =false;
//    var a =true
//    println(a && b)
//    println(a || b)
//    //
//    var num = 9
//    println(num <=5 && num >= -3)
//    println(num > 5 || num < -3)

}