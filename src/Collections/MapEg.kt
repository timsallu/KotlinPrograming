package Collections

fun main(args :Array<String>)
{
    //map is to key value pair
    //key value pair can be of any type like int int, int string, flaot string etc'
    //key is unique

    println("...............................................Immutable  map.............................")

    val map = mapOf<Int,String>( 2 to "Sam" , 5 to "Jam", 98 to "cam")  //fixed size, read only md immutable ie u cannot modify

    for(element in map)
    {
        println("${element.key} -> ${element.value}")
    }

    println("...............................................mutable  map.............................")

    val map1 = mutableMapOf<Int,String>( 2 to "Sam" , 5 to "Jam", 98 to "cam")  //No fixed size, read nd write  md mutable ie u can modify
    map1.put(100,"tim")


    for(element in map1)
    {
        println("${element.key} -> ${element.value}")
    }

    println("---------------------------------------------------------------------------")
    val map2:HashMap<Int,String> = HashMap<Int,String>()  //No fixed size, read nd write  md mutable ie u can modify
    val map3 =HashMap<Int,String>() //No fixed size, read nd write  md mutable ie u can modify

    map3.putAll(map)  //in case of hashmap order may vary
    map3.put(99,"pain")
    map3.put(100,"tim") //key is unique
    map3.put(100,"tim")
    map3.put(100, null.toString())

    map3.remove(99)
    map3.remove(88)


    for(index in map3.keys)
    {
        println("${map3[index]} -> ${map3.get(index)}")
    }

}