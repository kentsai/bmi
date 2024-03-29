package com.ken.bmi

class Person constructor(val name:String, val weight:Float, val height: Float){
//    var weight:Float = 0f
//    var height:Float = 0f

    fun bmi() : Float {
        val bmi = weight/(height*height)
        return bmi
    }
    fun hello() {
        println("Hello") //println跳行
    }
}