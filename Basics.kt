package com.example.myapplication

import kotlin.math.sign


fun main() {
    getAgeDetails()
}

fun getAgeDetails() {
    var age: Int?
    age = readLine()?.toInt()
    if (age != null) {
        if (age in 18..39) {
            println("you are good to go")
        } else {
            println("you are not allowed to go in because of age restriction")
        }
    } else {
        println("Age is not specified")
    }
}