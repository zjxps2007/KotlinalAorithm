package library

class Book(private val name: String, private val writer: String, private val ID: Int) {

    fun print_info() {

    }

    fun get_name(): String {
        return name
    }

    fun get_writer(): String {
        return writer
    }

    fun get_ID(): Int {
        return ID
    }

    fun change_name(name: String) {

    }

    fun change_writer(writer: String) {

    }

    fun change_ID(ID: Int) {

    }
}