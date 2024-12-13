fun main() {
    myFunction("Chirag", 21)
    val fact = factorial(5)
    println("Factorial of 5 is $fact")
    println(add())
}

// fun myFunction() {
//     println("I just got executed!")
//   } 

fun myFunction(fname: String, age: Int) {
    println("$fname is $age")
  }
 

  fun factorial(x: Int): Int {
    var base: Int = 1
    for (i in 1..x) {
        base = base*i
    }
    return base
  }

// can be done without writing return statements
// can give default values to the params as well
fun add(x: Int = 9, y: Int = 2) = x + y