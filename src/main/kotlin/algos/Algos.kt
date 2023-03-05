package algos

import utils.newSlice
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

class Algos {
    companion object
    {
        @OptIn(ExperimentalTime::class)
        fun run()
        {
            print("Введите номер задачи: ")
            when (readln().toInt())
            {
                1 -> {
                    val list: MutableList<Int> = newSlice()
                    println("--- Unsorted --- $list")
                    val time = measureTime {
                        selectionSort(list)
                    }
                    println("--- Sorted --- $list")
                    println("Время выполнения: $time")
                }
                2 -> {
                    val list: MutableList<Int> = newSlice()
                    println("--- Unsorted --- $list")
                    val time = measureTime {
                        quicksort(list)
                    }
                    println("--- Sorted --- $list")
                    println("Время выполнения: $time")
                }
                3 -> {
                    val list: MutableList<Int> = newSlice()
                    println("--- Unsorted --- $list")
                    val time = measureTime {
                        mergeSort(list)
                    }
                    println("--- Sorted --- $list")
                    println("Время выполнения: $time")
                }
                else -> println("Такой задачи нет")
            }
        }
    }

}