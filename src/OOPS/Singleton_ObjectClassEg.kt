package OOPS

import java.awt.geom.CubicCurve2D

fun main(args : Array<String>)
{
    CustomerData.count=100
    var cd =CustomerData.count
    CustomerData.typeofCustomer()
    CustomerData.test()
    CustomerData.tes2()

    println(cd)


}

open  class AG
{
    open fun test()
    {
        println("AG TEst")
    }

     fun tes2()
    {
        println("AG TEst 2")
    }
}

object CustomerData : AG() //cannot create instance for this, u can inherit any class
{
    var count : Int =-1

    fun typeofCustomer()
    {
        println("Indian")
    }

    override fun test() {
        super.test()
        println("TEst obj")
    }
}