package HigherorderFunEg

fun main(args : Array<String>)
{
    var lamdas = lamdas()
    lamdas.reversAstring("Hello") {s-> s.reversed()}

    //in kotlin we have 'it' keyword in case of single parameter

    lamdas.reversAstring("SALMAN TIM") {it.reversed()}

    var sal:Double= 0.0
    lamdas.getSalary("2.0"){s -> sal = s*s}
    println("sal is $sal")

    lamdas.getSalary("2.0"){sal=it*it}

    println("sal is $sal")

}

class lamdas
{
    fun reversAstring(str: String, res:(String) -> String):Unit
    {
        println("Reverse of Hello is: "+ res(str)) //here res function is called again
    }

    fun getSalary(sal: String, res: (Double) -> Unit) {
        return  res(sal.toDouble())
    }
}