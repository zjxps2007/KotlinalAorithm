package p1

fun main() {
    print("N : ")
    println(sum(readln().toInt()))

    print("N : ")
    println(sum(readln().toInt(), 3))
}

fun sum(n: Int): Int{
    var total = 0
    for (i in 1..n) {
        total += i
    }
    return total
}

fun sum(n: Int, except: Int): Int {
    var total = 0
    for (i in 1..n) {
        if (i % except != 0) {
            total += i
        }
        else {
            println("제외 : $i")
        }
    }
    return total
}