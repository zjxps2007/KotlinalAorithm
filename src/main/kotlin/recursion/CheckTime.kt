package recursion

const val MAX_N2 = 45

fun main() {
    val fibo = Fibo()
    var beforeTime = System.currentTimeMillis()

    for (i in 0..MAX_N2) {
        fibo.fib2(i)
    }

    var afterTime = System.currentTimeMillis()
    println("재귀함수 : ${(afterTime.toDouble() - beforeTime.toDouble()) / 1000}s")

    beforeTime = System.currentTimeMillis()

    for (i in 0..MAX_N2) {
        fibo.fib1(i)
    }
    afterTime = System.currentTimeMillis()

    println("반복문 : ${(afterTime.toDouble() - beforeTime.toDouble()) / 1000}s")
}