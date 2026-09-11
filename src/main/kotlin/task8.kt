package org.example

class NumberArray(val numbers: Array<Int>) {

    fun sumOfPositives(): Int {
        var sum = 0
        for (num in numbers) {
            if (num > 0) {
                sum += num
            }
        }
        return sum
    }

    fun product(): Int {
        if (numbers.isEmpty()) return 0
        var prod = 1
        for (num in numbers) {
            prod *= num
        }
        return prod
    }

    fun average(): Double {
        if (numbers.isEmpty()) return 0.0
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return sum.toDouble() / numbers.size
    }
}

fun main() {
    val my_array = arrayOf(3, -2, 4, -1, 5)
    val processor = NumberArray(my_array)

    println("Сумма положительных элементов: " + processor.sumOfPositives())
    println("Произведение элементов: " + processor.product())
    println("Среднее арифметическое: " + processor.average())
}