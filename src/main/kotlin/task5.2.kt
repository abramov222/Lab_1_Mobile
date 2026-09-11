package org.example

fun main(){
    val digit_array = arrayOf<Int>(5,7,1,84,43,12,7,8,1,10,43)

    digit_array.forEachIndexed { i,v ->

        if (i > 0 && i < digit_array.size - 1){
            var prev = digit_array[i - 1]
            var next = digit_array[i + 1]

            if (v > prev && v > next) {
                println(v)
            }
        }
    }
}
