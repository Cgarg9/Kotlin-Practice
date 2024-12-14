fun sum(num1:Int, num2:Int, callBack: () -> Unit){
    println("sum of two numbers is ${num1 + num2}")
    callBack()
}

fun main() {
    sum(1,2, {
        println("Done")
    })

    sumNNums(12,13,14, message = "The sum is")
}

// to take variable arguments
fun sumNNums(vararg num: Int, message : String) {
    var sum = 0
    for (i in num) sum += i
    println(message + sum.toString())
}