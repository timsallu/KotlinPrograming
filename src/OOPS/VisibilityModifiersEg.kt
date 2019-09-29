package OOPS

/*
* public --bY default all the classes var fun public in kotlin
* protected --only visible for sub classes
* private --only to specific class
* internal -- will be visible in module */

fun main(args : Array<String>)
{
    var bobj = B()
    bobj.test()
    var cobj = C()

}

open class A
{
    private var a: String="test";
     protected  var b : String="Test1";
    internal open var c : String="TEst2";
    var d = "sal";

    init {
        println(a)
    }

    open fun test():Unit
    {
        println("$a")
    }

}

class B : A() //is a relationship
{
    // a a is not accessible
    override var c="sjvdsjkvbds"

   init
    {
        b="salman";//protected accessible in sub class
        // accessible in full module
        d="khan" //accessible any where

        println("$b,$c,$d") //b,c,d accessible
    }

   override fun test():Unit
    {
        println("$c")
    }
}

class C //has a relationship
{
    var bobj = B()
    init {
        // bobj.a not accessible
        // bobj.b not accessible
        bobj.c ="tim"
        bobj.d ="khan"

        println("${bobj.c},${bobj.d}") //c,d accessible

    }



}