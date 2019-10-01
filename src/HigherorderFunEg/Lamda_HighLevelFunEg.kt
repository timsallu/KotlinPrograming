package HigherorderFunEg

fun main(args : Array<String>)
{

    val program =Program()
    program.add2Nos(5,7)

    program.add2Nos1(5,7, object : interFaceTest {
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    program.add2Nos(5,7) { s:Int -> println(s)}

    var mylamda: (Int) ->Int = {s-> s}

   var sum : Int =  program.add2Nos1(5,7,mylamda)
    println("Sum Is $sum")


    println("............................................In Detail .................................")
    val lambda : (Int) -> Unit ={x-> print(x)}
    val lambda1 : (Int,Int) ->Int = { x,y -> x+y }
    val lambda2 : (Int,Int,Int) ->Int = { x,y,z -> x+y+z }

    //different ways to call
    program.addition(3,5,{x,y -> x+y})

    program.addition(3,5) { x, y -> x+y} //u can take out

    program.addition(3,5,lambda1)

    //addition of 3
   val total:Int= program.additionof3(3,5,2,lambda2)
    println("Total : $total")

    println("............................................Closure In Detail .................................")
    //a2+b2-ab  in java its not possible alter value in kotlin its possible

    var some:Int= 0

    program.someformula(2,2) {x,y -> some=((x*x)+(y*y) - (x*y))}

    println("some formula result: $some")

}

class Program
{
    //simple fun
    fun add2Nos(a:Int , b:Int)
    {
        var sum: Int = a+b
        println(sum)
    }

    //using interface
    fun add2Nos1(a:Int , b:Int, action: interFaceTest)
    {
        var sum: Int = a+b
        action.execute(sum)
    }

    //using Lamdas
    fun add2Nos(a:Int , b:Int, action: (Int) -> Unit)
    {
        var sum: Int = a+b
        action(sum)
    }

    fun add2Nos1(a:Int , b:Int, action: (Int) -> Int) :Int
    {
        var sum: Int = a+b
        return action(sum)
    }

    fun addition(a:Int, b:Int, c:(Int,Int)->Int)
    {
        println(c(a,b))
    }

    fun additionof3(a:Int, b:Int, c:Int, sum:(Int,Int,Int)->Int) :Int
    {
        return sum(a,b,c)
    }

    fun someformula(a:Int,b:Int, result: (Int,Int)->Unit) :Unit
    {
        result(a,b)
    }
}

interface interFaceTest
{
    fun execute(sum: Int)
}