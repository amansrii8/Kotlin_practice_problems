
/*
    1. Join Two Lists using addAll()
 */

fun main() {
    val list1 = ArrayList<String>()
    val list2 = ArrayList<String>()
    val finalList = ArrayList<String>()

    list1.add("1")
    list1.add("2")
    list1.add("3")

    list2.add("10")
    list2.add("2")
    list2.add("30")

    finalList.addAll(list1)
    finalList.addAll(list2)

    print(finalList)



}