package algos

fun mergeSort(list: MutableList<Int>): MutableList<Int> {
    if (list.size <= 1) {
        return list
    }

    val middle = list.size / 2
    val left = list.subList(0,middle)
    val right = list.subList(middle,list.size)

    return merge(mergeSort(left), mergeSort(right))
}
private fun merge(left: MutableList<Int>, right: MutableList<Int>): MutableList<Int>  {
    var indexLeft = 0
    var indexRight = 0
    val newList : MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
    return newList
}