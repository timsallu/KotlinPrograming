package HigherorderFunEg

fun main (args : Array<String>)
{
    val list: List<Int> = listOf(2,5,6,8,90,50,4)

    for(ls in list)
    {
        print("$ls ")
    }

    println()

    val filterlist = list.filter { ls->  ls > 10 } // also we can {it>10}

    for(ls in filterlist)
    {
        print("$ls ")
    }

    println()

    val maplist = list.map { ls->  ls * 10 } // also we can {it*10}

    for(ls in maplist)
    {
        print("$ls ")
    }

    val list1 = listOf<Prsn>(Prsn("Test",10),Prsn("set",20),Prsn("Sep",20),Prsn("pet",40))

    val newList = list1.map {it.name  }.filter { it.startsWith("s")}

    println()

    for(ls in newList)
    {
        print("$ls ")
    }

    println("...................................................PredicateExample........................................")

    val lislastele: Int = list.last { ls -> ls>10 }

        println("Last ele in the list vch is greter than 10 is: $lislastele , ")

    val lisfirstele: Int = list.first() { ls -> ls>10 }

    println("First ele in the list vch is greter than 10: $lisfirstele , ")

    val countlist: Int = list.count() { ls -> ls>10 }

    println("Count in the list vch is greter than 10: $countlist ")

    val alleg: Boolean = list.all{ ls -> ls>1 }

    println("is ALL element greter than 1: $alleg ")

    val anyeg: Boolean = list.any{ ls -> ls < 0 }

    println("is Any element greter than 1: $anyeg ")
}

class Prsn(var name:String, var age: Int){


}