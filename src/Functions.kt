import package2.KtConstructerEg

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




class Name
{
    fun getLastName():String
    {
        return "Shaik";
    }
}