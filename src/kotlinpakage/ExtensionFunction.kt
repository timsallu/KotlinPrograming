package kotlinpakage


fun main(args : Array<String>)
{
    var ispass = Student();

    println("Student is passed: ${ispass.isPassed(34.0)}")
    println("Student is passed with FCD: ${ispass.isFCD(78.0)}")

    //practical use of Extension fun
    var str1: String ="Hello"
    var str2: String ="World"

    var str3: String ="Hey"

    var len: Int = str3.len(str1,str2)

    println("Length of string  $str3 $str1 $str2   is :$len")

    var a: Int =10
    var b=30
    var gValue : Int =b.greater(a);
    println("Greater Value: $gValue")
}

//isFCD is part of student class
fun Student.isFCD(marks: Double): Boolean
{
    return marks >= 70
}

class Student
{
    fun isPassed(marks : Double):Boolean
    {
        return marks>=35
    }
}

//custom length fun
fun String.len(str1: String, str2:String) : Int
{
    return this.length+str1.length+str2.length
}

fun Int.greater(a :Int) = if(this>a) this else a
