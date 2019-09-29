import kotlinpakage.KtConstructerEg

/*
* 1.How to call functions
* 2.How to Call Function of class
* 3.Calling Function with differenr class and intializing members of that class
* 4.constructer with different package */


fun main(args : Array<String>)
{
    var name ="Salman"
    //1
    displayName(name)
    var sum:Int =sumOf2no(2,5)
    println("sum is $sum ")
    println("sum is : ${sumOf2nos(12,5)} ")
    println("largest no is ${largestsNo(55,66)} , ${largestNo1(12,5)}, ${largestNo1(12,5)}")
    println("default Argument volume is : ${findVolume(2,5)},${findVolume(2,5,7)}")
    findVolume1(h=2,b=5,l=9)
    //2
    var  nameObj= Name()
    var lname: String = nameObj.getLastName()
    println(lname)

    //3
    var  fnameObj = KtClassEg()
    fnameObj.fname=name+" "+lname
    fnameObj.displayFullName()

    //4
    var fnameObj2= KtConstructerEg(name+" "+lname)
    fnameObj2.displayFullName()
}

fun displayName(name : String)
{
    println(name)
}

fun sumOf2no( a : Int, b : Int) : Int//return type
{
    return a+b;
}

fun sumOf2nos( a : Int, b : Int) : Unit //like void
{
    println("sum f 2 no is ${(a+b)}")
}

fun largestsNo (a: Int , b: Int) :Int{

    return if(a>b)
        a
    else
        b
}
                                        //function As Expressions
fun largestNo1(a :Int , b : Int) :Int = if(a > b) a else b

fun largestNo2(a :Int , b : Int) :Int
        = if(a > b) {
                print("a is greater")
                a
            }else
            {
                print("a is greater")
                b
            }

                                    //Default Argument:Functions not present in java
fun findVolume (l :Int, b:Int, h:Int =10) : Int
{
    return l*b*h;
}

                                //Named Parameter: while calling function mention variable names , actually oder is does not matter

fun findVolume1 (l :Int, b:Int, h:Int =10) : Unit
{
    println("Named parameter:$l,$b,$h")

}

                    //Extension Functions :

class Name
{
    fun getLastName():String
    {
        return "Shaik";
    }
}