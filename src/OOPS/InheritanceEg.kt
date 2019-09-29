package OOPS

import java.util.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/*By default all the classes in Kotlin public and final
* we cannot inherit directly bcs class is final
* to use inheritance we need define class as  open
* Types oh Inheritance:
           * Single  class A -> class B
           * Multilevel  class c -> class B - >class A
           * Hierarchial class B , Class C -> class A
           * */


fun main (arg : Array<String>)
{
    var dog=Dog()
    dog.color="Black"
    dog.breed="Street"
    dog.eat()
    dog.bark()

    var cat= Cat()
    cat.age=15
    cat.color="yellow"
    cat.eat()
    cat.Meow()

    var animal = Animal()
    animal.eat()
    animal.color="White"
}

open class Animal
{
    var color : String =""

    fun eat()
    {
        println("Eat")
    }

}

class Dog : Animal()
{

    var breed: String =""

    fun bark()
    {
        println("BOW.. BOW..")
    }
}

class Cat : Animal()
{
    var age: Int = 10

    fun Meow()
    {
        println("Meow.. Meow..")
    }
}



