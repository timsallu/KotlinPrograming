package Collections

fun main(args :Array<String>)
{
    //list is immutable bcs once defined u cannot alter

    println("...............................................Immutable  list.............................")
    var list = listOf<String>("sam","jam","kam") //fixed size, read only md immutable ie u cannot modify
    val list1:List<Int> = listOf<Int>(2,5,6,6,6,8,8,9)

    for(ls in list.indices)
    {
        println("${list[ls]}, ${list.get(ls)}")
    }

    for(ls in list1.indices)
    {
        println("${list1[ls]}, ${list1.get(ls)}")
    }

    for(ls in list1)
    {
        println(ls)
    }

    println("...............................................Mutable......................................")

    var mlist: MutableList<String> = mutableListOf() //No fixed size, read nd write and mutable
    var mlist1: ArrayList<Int> = arrayListOf() //No fixed size, read nd write and mutable,type not req
    var mlist2  = ArrayList<String>() //No fixed size, read nd write and mutable,type req

    var mlist3: ArrayList<ListEg> = ArrayList<ListEg>() //No fixed size, read nd write and mutable

    mlist3.add(ListEg("name1",10))
    mlist3.add(ListEg("name2",21))

    mlist.add("sam")
    mlist.add("jam")
    mlist.add("sam")

    mlist.remove("jam")
    mlist.add(1,"sam")

    mlist1.add(1)
    mlist1.add(5)
    mlist1.add(6)
    mlist1.add(10)

   mlist2.addAll(mlist)

    for(ls in mlist)
    {
        println(ls)
    }


    for(ls in mlist1)
    {
        print("$ls ")
    }

    println()

    for(ls in mlist2)
    {
        print("$ls ")
    }

    println()

    for(ls in mlist3)
    {
        print("${ls.name},${ls.age} ")
    }
}

class ListEg
{
    var name: String=""
    var age:Int=10

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }


}