package OOPS

fun main(args : Array<String>)
{
    println(".........................................primary const...............................")
    var student = Student(); //Object creation
    var student1 = Student1("salman shaik"); //Object creation

    var student2 = Student2("salman imran"); //Object creation

    student2.name="salman khan 2"
    student.name="salman khan"

    println("Student name is: ${student.name},${student2.name}")

    println(".........................................secondary const...............................")

    var employee =Employee("Khan")
    var employee1 =Employee("salman tim","1")


}

class Student
{
    var name: String ="salman"

    init {
        //like statick bloack in java it executes first
        println("Student name is: ${name}")
    }
}

//primary constructor
class Student1 constructor(name: String)
{
    var name: String ="salman"

    init {
        this.name=name
        //like static block in java it executes first
        println("Student name is: ${name}")
    }
}

//primary constructor declaring property inside constructor
class Student2 (var name: String)
{
    init {
        println("Student name is: ${name}")
    }
}


//Secondary Constructor
class Employee(var name : String)
{
    init {
        println("Employee Name is:$name") //behaves like body of primary const here
    }

    //secondary constructor
    constructor(name1 : String, id : String) : this(name1) //must call primary const
    {
        //secondary const has its own body
        println("name is $name, $name1, $id")
    }
}