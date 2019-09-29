package kotlinpakage

import java.math.BigInteger

fun main (args : Array<String>)
{
    println("Fibonacci no:${fibonaccino(10, BigInteger("1"),BigInteger("0"),true)}")
}

//tailrec keyword is used for recursive fun to avoid stackocerflow error

tailrec fun fibonaccino(n: Int , a: BigInteger, b:BigInteger,flag: Boolean) :BigInteger
{
    if(flag)
        print("$b")

    if(n==0) {
        println()
        return b
    }
    else {
        print(" $a")
        return fibonaccino(n - 1, b + a, a,false)
    }
    //0,1,1,2,3,5,8
}