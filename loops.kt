fun main() {

    // while loop 
    var count = 0;
    while (count < 10) {
        if (count == 8) break 

        println("count is $count")
        count++

    }

    // do while loop
    do {
        println("count is $count but in do while")
        count++
    }
    while (count < 12) 

    // for loop
    // unlike traditional use range. also last number included here
    for (i in 1..10) println("for $i")

    for (i in 10 downTo 2 step 2) println("for $i")

    // write a program to take a number from user and sum the digits, reverse it and find sum of cube of each digit
    print("Enter a number: ")
    val input = readln().toInt() // Convert input to an integer

    // find the sum of digits
    var sumofdigit = 0;
    var reverse = 0
    var sumOfCube = 0
    var temp = input
    while (temp != 0) {
        var digit = temp%10
        sumofdigit += digit
        sumOfCube += digit*digit*digit
        reverse = reverse*10 + digit
        temp /= 10
    }

    println("sumofdigit: $sumofdigit")
    println("reverse: $reverse")
    println("sumOfCube: $sumOfCube")
}