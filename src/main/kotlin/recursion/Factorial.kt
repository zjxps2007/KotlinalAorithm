package recursion

fun main() {
    println(factorial1(5))
    println(factorial2(5))
}

    fun factorial1(number: Int): Int {
        return if (number <= 1) 1 else number * factorial1(number - 1)
    }

    fun factorial2(number: Int): Int {
    var total = 1
    if (number <= 0) {
        return 1
    }
    else {
        for (i in 1..number) {
            total *= i
        }
    }
    return total
}