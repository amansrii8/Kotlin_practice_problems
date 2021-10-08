
/*
    1. Union of two ArrayList
 */

fun main() {

    val list1 = ArrayList<String>()
    val list2 = ArrayList<String>()

    list1.add("1")
    list1.add("2")
    list1.add("3")

    list2.add("10")
    list2.add("2")
    list2.add("30")

    val finalList: ArrayList<String> = (list1.toSet().union(list2.toSet())).toList() as ArrayList<String>

    print(finalList)



}