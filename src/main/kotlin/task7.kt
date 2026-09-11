package org.example
import kotlin.math.*



fun sqr(n: Double): Double = n * n
fun discriminant(a: Double,b: Double,c: Double): Double = (b*b - 4*a*c).pow(0.5)
fun rootsNumber(a: Double,b: Double,c: Double): Int {
    when {
        discriminant(a,b,c) > 0 -> return 2
        discriminant(a,b,c) == 0.toDouble() -> return 1
        else -> return 0
    }
}
fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + d) / (2 * a)
            val x2 = (-b - d) / (2 * a)
            println("Два корня: x1 = $x1, x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Один корень: x = $x")
        }
        else -> {
            println("Действительных корней нет")
        }
    }
}

fun main(){
    quadraticRoot(1.0, -3.0, 2.0)
}