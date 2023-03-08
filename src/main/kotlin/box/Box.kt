package box

class Box (private var width: Int, private var height: Int, private var depth: Int) {
    constructor(): this(1, 1, 1)

    fun volume(): Int {
        return width * height * depth
    }
}