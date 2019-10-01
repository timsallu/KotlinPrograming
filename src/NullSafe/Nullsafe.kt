package NullSafe

fun main (args: Array<String>)
{
    /*  NULL Safety
      1) Safe Call Operator ?.
      2)Not null Assertion
      3)Elvis ?:
      4)?.let Safe call with let
    * */

    var name:String? ="xcdsvn"
    name=null

    println("lenght: ${name?.length}")

    name?.let {
        println("lenght: ${name?.length}")  //block of executes nly if not null
    }

    //Elvis ?:
    val lenth=name?.length ?: -1
    println("lenght: ${name?.length}")

    //Non assertion !!
    println("lenght : ${name!!.length}") //!! through null pointer exception if null
}