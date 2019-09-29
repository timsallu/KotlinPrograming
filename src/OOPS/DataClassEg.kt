package OOPS

fun main(args : Array<String>)
{

    var user=User ("sam", "20")
    var user1=User ("sam", "20")

    //Example of normal class
    println(".................................normal class........................................")

    if(user == user1)
        println("Equal")
    else
        println("Not Equal")

    println(user.toString())

    println(".................................DATA class........................................")

    var user2=dataUser ("sam", "20")
    var user3=dataUser ("sam", "20")

    //example of data class
    if(user2 == user3)
        println("Equal")
    else
        println("Not Equal")

    println(user2)
    println(user2.toString()) //super class method ANY

    println(user2.copy())   //only data class object can use copy method
    println(user2.copy("tim"))
    println(user2.copy("tim","25"))

}

class User(var name: String , var id:String)
{

}

data class dataUser(var name: String , var id:String)
{

}

/* super class 'ANY' has folllowing fun
   equals()
   tostring()
   hasCode()
   copy()
   like u c above any class object can use this method
* */