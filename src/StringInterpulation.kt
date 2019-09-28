fun main(args :Array<String>)
{
    val str: String
    str="Sam"

    println("Hello " +str)
    println("Hello $str")//String interpolation
    println("Hello $str length is ${str.length}")//String interpolation

    val a= 10
    val b= 20

    println("value of $a and $b is: ${a+b}")


    var rect = Rectangle()
    rect.len = 5
    rect.breadth = 3

    print("The length of the Rectangle is ${rect.len} breadth of Rect is ${rect.breadth} . The Are is ${rect.len*rect.breadth}")




}

class Rectangle
{
    var len: Int  = 0
    var breadth: Int = 0
}