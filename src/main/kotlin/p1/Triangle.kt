package p1

fun main() {
    print("N : ")
    printTriangle(readln().toInt())

    print("N : ")
    printInverseTriangle(readln().toInt())
}

fun printTriangle(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

fun printInverseTriangle(n: Int) {
    for (i in 1..n) {
        for (j in n downTo i) {
            print("*")
        }
        println()
    }
}