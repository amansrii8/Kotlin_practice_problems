/*
    1. Convert List to Set (HashSet) and Vice-Versa
 */

fun main() {
    val list = listOf("1", "2", "3", "3")

    println(list.toSet())

    val set = setOf("1", "2", "3", "3")

    println(set.toList())

}