fun main ( args : Array<String>)
{
    println("....................for loop EG.............................")

    for(i in 0..4)
    {
        println("Hello $i")
    }

    for(i in 0..10 step 2)
        println("hello step increment by 2 $i")

    for(i in 10 downTo 0 step 2)
        println("hello step decrement by 2 $i")


    println("....................WHILE EG.............................")
    var i=0
    while (i < 5)
    {
        println("w Hello $i")
        i++
    }

    println("....................DO WHILE EG.............................")

    var j=0

    do
    {
        println("d Hello $j")
        j++
    }
        while(j != 5)

    println("....................break EG.............................")
    for(i in 1..10)
    {
        println("break $i")
        if(i==5)
            break
    }

    for(i in 1..3)
    {
        for(j in 1..3)
        {

            if(i==2 && j==2)
                break
            println("$i $j")
        }
    }

    println("....................break EG myloop@.............................")

    myloop@ for(i in 1..3)
    {
        for(j in 1..3)
        {

            if(i==2 && j==2)
                 break@myloop
            
            println("$i $j")
        }
    }


    println("....................continue EG.............................")
    for(i in 1..10)
    {
        println("break $i")
        if(i==5)
            continue
    }

    for(i in 1..3)
    {
        for(j in 1..3)
        {

            if(i==2 && j==2)
                continue
            println("$i $j")
        }
    }

    println("....................continue EG myloop@.............................")

    myloop@ for(i in 1..3)
    {
        for(j in 1..3)
        {

            if(i==2 && j==2)
                continue@myloop

            println("$i $j")
        }
    }
}