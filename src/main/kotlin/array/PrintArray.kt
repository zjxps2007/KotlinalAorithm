package array

fun main() {
    val array1 = arrayOf(1, 2, 3, 4, 5)

    printArray(array1)
}

fun printArray(array: Array<Int>) {
    print("Output : ")
    print(array[0])
    for (i in 1 until array.count()) {
        print(", ${array[i]}")
    }
}