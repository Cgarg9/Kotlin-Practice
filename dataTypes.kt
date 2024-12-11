fun main() {

    // Kotlin doesn't have primitive types directly !!

    // no need to specify data type but can be done
    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String

    // data type conversion:
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
    // println(x == y)  // clearly wrong since diff data types

    // data types are defined as objects therefore they have different methods
    println(myNum.compareTo(9)) // will give false
    println(myLetter.dec()) //  It returns the character that comes just before the current character in Unicode
}