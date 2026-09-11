package org.example

fun main() {
    var n = readln().toInt()

    var count = 0
    var current = 2

    while (count < n) {
        var temp = true
        for (i in 2..Math.sqrt(current.toDouble()).toInt()){
            if (current % i == 0){
                temp = false
                break
            }
        }

        if (temp) {
            count++
            println("Число " + count + ": " + current)
        }
        current++
    }
}