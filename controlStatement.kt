fun main() {
    
    println("Enter number: ")
    val num = readln().toInt()

    if (num.rem(2) == 0) println("number is even")
    else println("number is odd")

    val num1 = 10
    val num2 = 15
    val max = if (num1 > num2) num1 else num2

    println("Max of $num1 and $num2 is $max")

    // range in kotlin
    if (num in 10..15) println("$num in range 10 to 15")
}