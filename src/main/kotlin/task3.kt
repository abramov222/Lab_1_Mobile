package org.example

fun main() {
    var random_digit = (0..10).random()

    while (true) {
        var user_digit = readln().toInt()

        when {
            user_digit > random_digit -> println("Много")
            user_digit < random_digit -> println("Мало")
            else -> break
        }
    }
    println("Угадал")
}