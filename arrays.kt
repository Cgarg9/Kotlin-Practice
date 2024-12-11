fun main() {
    var cars : Array<String> = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    cars[0] = "Opel"
    println(cars[0])

    println(cars.size)

    // check if elements exists
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) {
        println(x)
    }
}