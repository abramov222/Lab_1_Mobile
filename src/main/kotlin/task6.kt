package org.example



fun main(){
    val digits_array = arrayOf(5,8,1,7,97,4,5,2)
    var product: Int = digits_array.first()
    for (i in 0..digits_array.size-1) {
        if (i != 0) {
            product *= digits_array[i]
        }
    }
    println("Произведение for = $product")

    product = digits_array.first()
    var i = 0
    while(true){
        if (i != 0) {
            product *= digits_array[i]
        }
        if (i == digits_array.lastIndex) break
        i++
    }
    println("Произведение while = $product")

    product = 1

    digits_array.forEach{product *= it}
    println("Произведение forEach = $product")

    product = digits_array.reduce { acc, e -> acc*e }
    println("Произведение reduce = $product")

    println("Минимальный элемент: ${digits_array.min()}\nМаксимальный элемент: ${digits_array.max()}")
}