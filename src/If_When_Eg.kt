fun main(args : Array<String>)
{

                                    /* if Eg*/
    println("------------------------------------if Eg----------------------------------")
    val a : Int = 10
    val b : Int = 20

    var max : Int

    if(a>b)
        max = a
    else
        max = b

    println(max)

    var max2 : Int = if(a>b) a else b

    println(max2)


    //when multiple line r thr it always consider last line as out put
    var max3 : Int =     if(a > b)
                                {
                                 println("a is greater ")
                                    a
                                }
                                else {
                                 println("b is greater ")
                                 b
                                }

    println(max3)


                               /*When
                               * instead of switch , when leyword is used in kotlin
                               * no brak or continue in kotlin
                               */
      println("------------------------------------when Eg----------------------------------")

    val x=12

    when (x)
    {
        1 -> println("x is 1")
        2 -> {
            //for multiplelines of code
            println("x is 2")
        }

        3,4,5 -> {
            //when u want check 2 or more condition
            println("x is 3 , 4 or 5")
        }

        in 1..10 -> println("$x lies in 1 to 10")

        !in 1..10 -> println("$x lies in 1 to 12")

        else -> println("x is $x") //behaves like default in java
    }


    //when as expression

    val y= 1

    var str : String = when(x)
    {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "x is unknown"
            "x is ...." //aalways last statment is considerd for result
        }

    }

    println("str is $str")


}