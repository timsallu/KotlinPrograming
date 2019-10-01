package Collections

import java.util.*

fun main(args :Array<String>) {

    //Set is to have Unique values

    println("...............................................HashTable.............................")

    var table = Hashtable<Int,String>()
    var table1 = Hashtable<Int,HashTableEg>()


    table.put(1,"tim")
    table.put(10,"kim")
    table.put(51,"rim")
    table.put(17,"gim")

    table1.put(1,HashTableEg("name1",19,false))
    table1.put(2,HashTableEg("name2",23,true))
    table1.put(3,HashTableEg("name3",5,true))
    table1.put(3,HashTableEg("name3",5,true))

    for(ele in table)
    {
        println("${ele.key} -> ${ele.value}")
    }

    for(ele in table1)
    {
        println("${ele.key} -> ${ele.value.a} -> ${ele.value.b} -> ${ele.value.c} ")
    }
}

class HashTableEg
{
    var a:String=""
    var b:Int=0
    var c:Boolean= false

    constructor(a: String, b: Int, c: Boolean) {
        this.a = a
        this.b = b
        this.c = c
    }
}