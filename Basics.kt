package com.example.myapplication

import kotlin.math.sign


fun main() {
    rockPapaer();
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

fun rockPapaer() {
    var computerChoice = ""
    var userChoice: String = readLine().toString()
    var randomValue = (1..3).random();
    if (randomValue == 1) {
        computerChoice = "Rock"
    } else if (randomValue == 2) {
        computerChoice = "Paper"
    } else if (randomValue == 3) {
        computerChoice = "Scissors"
    }
    if (!userChoice.isNullOrBlank()) {
        val winner = when {
            userChoice == computerChoice -> "tie"
            userChoice == "Rock" && computerChoice == "Paper" -> "you lose computer choice is ${computerChoice}"
            userChoice == "Paper" && computerChoice == "Scissors" -> "You loose computerchoice is ${computerChoice}"
            userChoice == "Scissors" && computerChoice == "Rock" -> "You loose Computer Choice is ${computerChoice}"
            else -> {
                "you won ${computerChoice}"
            }
        }
        println(winner)
    } else {
        println("Please enter a valid input")
    }
}