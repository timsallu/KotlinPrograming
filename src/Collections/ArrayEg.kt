package Collections

fun main(args :Array<String>)
{
    // element:  0 0 0 0 0
    //Index:     0 1 2 3 4

    //array is mutable bcs we can put values to any index
    var myArray = Array<Int>(5) {0} //by def all the ele of array is 0
    myArray[0]=3
    myArray[3]=5

    println("array ele at 3rd pos: ${myArray[3]}")

    println("All the Array element is ")
    for (a in myArray)
    {
        println(a)
    }

    for(a in 0..myArray.size-1)
    {
        print("$a,")
    }

    println()

    for(a in myArray.indices)
    {
        print("$a,")
    }

    var myArray2 =Array<Int>(5) {0}





}