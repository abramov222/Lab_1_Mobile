package org.example

class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double {
        return Math.sqrt(x * x + y * y + z * z)
    }

    infix fun dot(other: Vector): Double {
        return this.x * other.x + this.y * other.y + this.z * other.z
    }

    operator fun times(other: Vector): Double {
        return this.x * other.x + this.y * other.y + this.z * other.z
    }
}

fun dotProduct(v1: Vector, v2: Vector): Double {
    return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z
}

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Длина вектора v1: " + v1.length())
    println("Скалярное произведение (метод): " + v1.dot(v2))
    println("Скалярное произведение (infix): " + (v1 dot v2))
    println("Скалярное произведение (оператор *): " + (Vector(1.0, 2.0, 3.0) * Vector(3.0, 2.0, 1.0)))
    println("Скалярное произведение (внешняя функция): " + dotProduct(v1, v2))
}