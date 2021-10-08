import java.util.*

/*
    1. Print a Multi-dimensional Array
 */

fun main() {
    val array = arrayOf(intArrayOf(1,2),
    intArrayOf(1,2,3,4),
    intArrayOf(34,45,67,78,67))

    println(array.contentDeepToString())
}