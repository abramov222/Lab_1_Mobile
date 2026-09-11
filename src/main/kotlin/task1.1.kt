package org.example

fun main() {
    val digit = readln()
    val last_digit = digit.last()
    var first_digit = digit.first()

    println("Первое число - " + first_digit + "\nПоследнее число - " + last_digit)
}