package com.ken.bmi

class Hello {

}

fun main() {
//    val p =Person()
    val p = Person("Ken",65.5f, 1.75f)
    p.hello()
    val hank = Person("Tsai",80f,160f)

    println(p.bmi())
    println(hank.name + ":"+hank.bmi())
    //BMI
    val wgt = 65.5f
    val hgh = 1.7f
    val bmi = wgt / (hgh*hgh)
    println("BMI:" + bmi)


//    println("Hello Kotlin@@")

   /* val age =20//cant Change
    val age:Int = 20
    val population:Long = 9999L //L:Long
    println(age.dec())
    println(age.inc())
    var name = "Ken" //var can change
    println(name.get(1))
    name = "Tsai"
    println(name)
    val c = 'X'
    println(c)
    //Float(32), Double(64)
    val weight:Float = 65.5f//.toFloat()//f:float
    //true false
    val isAdult = false  //true
    //Char
    val Y = 'A'*/

}