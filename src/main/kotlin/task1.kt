package org.example

fun main() {
    val digit = readln().toInt()
    val last_digit = digit % 10
    var first_digit: Int

    var temp = digit
    while (temp >= 10){
        temp /= 10
    }
    first_digit = temp

    println("Первое число - " + first_digit + "\nПоследнее число - " + last_digit)
}