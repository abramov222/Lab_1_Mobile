package org.example

fun main(){
    var count = 0
    var sum_val = 0
    do {
        var digit = readln().toInt()
        count++
        sum_val += digit
    } while (digit != 0)

    var arithmetic_mean = sum_val / count
    println("Количество чисел: " + count + "\nСумма чисел: " + sum_val + "\nСреднее арифмитическое: " + arithmetic_mean)
}