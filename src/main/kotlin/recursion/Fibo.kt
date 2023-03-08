package recursion

class Fibo {
    val MAX_N = 10
    fun fib1(n: Int): Int {
        var num1 = 0
        var num2 = 1
        for (i in 0 until n) { // repeat(n)
            num2 += num1
            num1 = num2 - num1
        }
//    for문 대신 이거 써도 됨
//    repeat(n) {
//        num2 += num1
//        num1 = num2 - num1
//    }

        return num1
    }

    fun fib2(n: Int) : Int {
        return if (n <= 1) n else fib2(n - 1) + fib2(n - 2)
    }
}