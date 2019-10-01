package NullSafe

val pi1: Float = 3.14f //waste of memory in case u dont use it in prog
val pi: Float by lazy{ 3.14f}

fun main (args: Array<String>)
{
    /*LAZY
    * lazy initialization was designed to prevent unnecessary intia.. of obj
    * ur variables will not b initia.. unless u use it in ur code
    * first time it intialize , next time it loads from cache
    * it is  thread safe*/

    var areaofcircle= pi*4*4

    println(areaofcircle)


}
