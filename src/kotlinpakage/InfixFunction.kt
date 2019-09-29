package kotlinpakage

fun main(args : Array<String>)
{
    /*All Infix fun are Entension fun but not all Extension fun are Extension
    * bcs infix contains only one parameter */

    var a: Int =10
    var b=30
    var gValue : Int =b.greaterthan(a)
    var gValue1 : Int =b greaterthan a
    println("Greater Value: $gValue $gValue1")
}

infix fun Int.greaterthan(a :Int) = if(this>a) this else a