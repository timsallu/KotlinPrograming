fun main(args : Array<String>): Unit
{
    println("Hello world")
    println(10-9)
    println(10.0-9)
    println(10/9)
    println(10.0/9)

                             /*Variables*/
     // var key word
    // is mutable in nature

    var myString="Hello World"
    println(myString)

    var myString1: String
    myString1="Hello world 1"
    println(myString1)

    var number = 10
    println(number)

    //val keyword immutable same like final in java ,constant value

    val myStr="Hello world 2"
   // myStr="Heeloo" we cannot change value of myStr
    println(myStr)

    val myStr1:String
    myStr1="Hello"
    println(myStr1)

    //println with value

    println("Mystr value is: $myStr1")

}