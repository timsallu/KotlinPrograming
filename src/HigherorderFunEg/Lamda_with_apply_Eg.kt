package HigherorderFunEg

fun main(args : Array<String>)
{
    var person =Person()

    person.name="SALMAN TIM"
    person.age=25
    person.id=10
    person.gender="Male"

    println("............................................normal .................................")
    println("${person.name}\n" +
            "${person.age}\n" +
            "${person.id}\n" +
            "${person.gender}")

    //instead using every time person object we can use 'with' keyword in kotlin

    with(person){
        name="SALMAN khan"
        age=26
        id=10
        gender="Male"
    }

    println("............................................with kw syn : with(obj){}  .................................")
    println("${person.name}\n" +
            "${person.age}\n" +
            "${person.id}\n" +
            "${person.gender}")

    //'apply' can be used same as with, using apply u can call fun of class as well

    println("............................................apply kw  syn : obj.apply{} .................................")
    person.apply {
        name="SALMAN Shaik"
        age=26
        id=10
        gender="Male"
    }.getName()


}

class Person
{
    var name: String ="tim"
    var id:Int =-1
    var age:Int =-1
    var gender:String = ""

    fun getName()
    {
        println(name)
    }
}