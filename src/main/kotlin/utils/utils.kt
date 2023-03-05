package utils

fun newSlice(): MutableList<Int>
{
    print("Укажите размер массива: ")
    return generateSlice(readln().toInt())
}

private fun generateSlice(size: Int): MutableList<Int> {
    val list: MutableList<Int> = MutableList(size){0}
    for (i in 0 until size) {
        list[i] = (0..1000).random()
    }
    return list
}