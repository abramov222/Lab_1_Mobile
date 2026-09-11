package org.example

fun main(){
    val digit_array = arrayOf<Int>(5,7,1,84,43,12,7,8,1,10,43)

    var i = 1
    while (i != digit_array.size-1) {
        when {
            (digit_array[i] > digit_array[i+1]) && (digit_array[i] > digit_array[i-1]) -> println(digit_array[i])
        }
        i++
    }
}
