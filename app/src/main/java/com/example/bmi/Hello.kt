package com.example.bmi

import android.media.metrics.PlaybackErrorEvent

class Hello {

}

fun main() {
    val p = Person("Ken",65.5f, 1.7f)
    println(p.bmi())
    val ken = Person("Tsai",70.9f,1.82f)
    println(p.name + " "+ p.bmi())
    println(ken.name + " "+ ken.bmi())
    println("Hello Kotlin!")
    val age =20//val cannt change
    println(age.inc())

    val c = 'A'
    println(c)
}