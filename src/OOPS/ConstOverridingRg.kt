package OOPS

fun main(args : Array<String>)
{
  //  var employee= Employees("Salman", 5000.0)
    var employee1= Employees("Salman", 5000.0,10)
    var h= H("salman",10)
}

open class Person(var name: String)
{
    init {
        println("Name is $name")
    }
}

class Employees (name: String, salary: Double): Person(name)
{
    init {
        println("Name is $name and Salary is $salary")
    }

    //with primary and secondary constructor
    constructor(name: String,salary: Double,age:Int):this(name,salary)
    {
        println("Name is $name and Salary is $salary and $age")
    }
}

//only Secondary const Eg
open class G
{
    var name:String ="g"
    constructor(name:String)
    {
        this.name=name
        println("Secondary const name:"+name)
    }
}

class H : G
{
    var age: Int =20

    constructor(name: String, age: Int):super(name) //kotlin we must call primary const
    {
        println("Secondary const $name $age")
    }

}

