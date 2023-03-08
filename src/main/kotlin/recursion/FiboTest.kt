package recursion

fun main() {
    val fibo = Fibo()
    for (i in 0..fibo.MAX_N) {
        println(fibo.fib1(i))
    }
    println("----------------------------------")
    for (i in 0..fibo.MAX_N) {
        println(fibo.fib2(i))
    }
}