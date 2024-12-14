// Base class
open class Car(
    private val brand: String, // Accessible only within the Car class
    protected val model: String, // Accessible within Car and its subclasses
    internal var year: Int // Accessible within the same module
) {
    // Open method to allow overriding
    open fun displayDetails() {
        println("Car: $brand $model, Year: $year")
    }

    // Private method, accessible only within this class
    private fun maintenanceCheck() {
        println("$brand $model is undergoing maintenance.")
    }

    // Protected method, accessible in this class and its subclasses
    protected fun startEngine() {
        println("Starting the engine of $brand $model...")
    }

    // Internal method, accessible within the same module
    internal fun drive() {
        println("$brand $model is driving...")
    }
}

// Subclass that inherits from Car
class ElectricCar(
    brand: String,
    model: String,
    year: Int,
    private val batteryCapacity: Int // Specific to ElectricCar
) : Car(brand, model, year) {

    // Overriding a method and using the protected property
    override fun displayDetails() {
        super.displayDetails()
        println("Battery Capacity: $batteryCapacity kWh")
    }

    // Method to charge the car
    fun charge() {
        println("$model is charging...")
    }

    // Public method that accesses protected method from parent
    fun startAndDrive() {
        startEngine() // Accessing protected method
        drive() // Accessing internal method
    }
}

// Main function to test the classes
fun main() {
    val car = Car("Toyota", "Corolla", 2020)
    car.displayDetails() // Public method
    // car.startEngine() // Error: Cannot access 'startEngine': it is protected
    // car.maintenanceCheck() // Error: Cannot access 'maintenanceCheck': it is private
    car.drive() // Internal method, works within the same module

    println()

    val electricCar = ElectricCar("Tesla", "Model 3", 2023, 100)
    electricCar.displayDetails() // Public method
    electricCar.charge() // Public method
    electricCar.startAndDrive() // Accesses protected and internal methods
}
