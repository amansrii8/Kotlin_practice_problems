
/*
    1. Concatenate Two Arrays
 */

fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)

    println((array1 + array2).contentToString())

    println((array1.plus(array2)).contentToString())
}