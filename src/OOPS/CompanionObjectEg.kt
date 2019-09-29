package OOPS


fun main(args : Array<String>)
{
    MyClass.count=100
    var cd =MyClass.count
    MyClass.typeofCustomer()
    MyClass.test()
    MyClass.tes2()

    println(cd)


}

open  class AGC
{
    open fun test()
    {
        println("AG TEsts")
    }

    fun tes2()
    {
        println("AG TEsts 2")
    }
}

class MyClass {

    //used to have create static methods
    //u can remove CustomerData1 also it will access data class name
    companion object CustomerData1  : AGC()
    {
        var count: Int = -1

        fun typeofCustomer() {
            println("Indiann")
        }

        override fun test() {
            super.test()
            println("TEst objj")
        }
    }
}