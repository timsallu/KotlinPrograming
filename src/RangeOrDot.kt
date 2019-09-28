fun main(args :Array<String>)
{
    /*Ranges
    DOT
    in
    step
    downTo
    */

    val  r1 = 1..5
    //This Range Contains the number 1,2,3,4,5

    val  r2 = 5 downTo 1
    //This Range Contains the number 5,4,3,2,1

    val r3= 5 downTo 1 step 2
    //skip 2 values means i-2 ,5,3,1

    val  r4 = 1..5 step 2 //1,3.5

    val r5= "a".."z" // a....................z

    val ispresent= "c" in r5

    val a= 10.downTo(1) //10,9.....1
    val b = 1.rangeTo(10) //1,2,....10

    println(r1)
    println(r2)
    println(r3)
    print(ispresent)

}