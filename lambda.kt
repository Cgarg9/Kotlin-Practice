// can be simply made using {}

fun main() {
    val square = {
        x: Int -> x*x
    }
    val addition = {
        x: Int, y: Int -> x + y
    }
    println(square(25))
    println(addition(30,4))
}