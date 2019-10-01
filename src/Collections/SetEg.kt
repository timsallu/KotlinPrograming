package Collections

fun main(args :Array<String>) {
    //Set is to have Unique values

    println("...............................................Immutable  Set.............................")

    var set = setOf<Int>(2,4,66,7,888,88,7,7,7,7,7,9,0,7,1) //fixed size, read only md immutable ie u cannot modify

    for(element in set)
    {
        print("$element  ")
    }

    println()
    println("...............................................mutable  Set.............................")

    println()
    var set1 = mutableSetOf<Int>() //No fixed size, read nd write  md mutable ie u can modify
    var set2 = HashSet<Int>() //No fixed size, read nd write  md mutable ie u can modify,order may vary
    var set3 = hashSetOf<Int>(2,4,66,7,5,88,7,7,7,7,7,9,0,7,1)  //No fixed size, read nd write  md mutable ie u can modify,order may vary

    set1.addAll(set)
    set1.add(100)
    set2.addAll(set1)

    for(element in set1)
    {
        print("$element  ")
    }

    println()
    println("...........................check order............................")
    for(element in set2)
    {
        print("$element  ")
    }

    println()
    println("...........................check order............................")
    for(element in set3)
    {
        print("$element  ")
    }
}