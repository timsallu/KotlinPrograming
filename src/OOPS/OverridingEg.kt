package OOPS

fun main(args : Array<String>)
{
    println("............................Overide....................")

    var bike = Bike()
    bike.gear()

    var car = Car()
    car.gear()

    var vehicle = Vehicle()
    vehicle.gear()

    println("${bike.color}  ${car.color}")

}

open class Vehicle
{
   open var color : String ="White"

  open  fun gear()  //inorder to override this method in child class make it open
    {
        println("Vehicle Gear")
    }

}

class Bike : Vehicle(),Test
{
    var oil: String =""

    init {
        println("$color")
    }

    fun ride()
    {
        println("Ride.. Ride..")
    }

    override fun gear()
    {
        super<Vehicle>.gear()  //in case multiple super methods available u have specify which class method u overriding
        println("Bike Gear")
    }
}

class Car : Vehicle()
{
    var age: Int = 10

    override var color: String ="Red"

    fun drive()
    {
        println("Drive.. Drive..")
    }

    override fun gear()
    {
        println("Car Gear..")
    }
}

interface Test //eg to show multiple method overide confusion
{
    fun gear()
    {
        println("dsdvdsvds")
    }
}