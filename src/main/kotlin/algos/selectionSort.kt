package algos

fun selectionSort(list: MutableList<Int>) {
    val l = list.size
    var sum = 0
    for (i in 0 until l) {
        var middle: Int = i
        for (j in i until l) {
            sum += 1
            if (list[j] < list[middle]) {
                middle = j
                sum += 1
            }
        }
        val tmp = list[i]
        list[i] = list[middle]
        list[middle] = tmp
    }
    println("Сф+Мф: $sum")
}