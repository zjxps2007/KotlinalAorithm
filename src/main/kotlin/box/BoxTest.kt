package box

fun main() {
    val box1 = Box()
    val box2 = Box(2, 2, 2)

    println(box1.volume())
    println(box2.volume())
}