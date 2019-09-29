package OOPS

fun main (args : String)
{
    /*
    * abstract class fun var bydefault Open in nature
    * abstract can be directly overridden
    * cannot create object for abstract class*/
}

abstract class Country
{
    open var name: String ="Country_name"
    abstract var name1: String //cannot initialize

   abstract fun getGDP() //cannot have body,open in nature

   open fun getFLag() //fun is open can override in child class
    {

    }

    fun test(){ //normal fun specific to class cannot be overridden in child class

    }
}

class India:Country()
{

    override var name: String ="India"
    override var name1: String ="India"

    override fun getGDP() {  //must implement abstract methods
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

/*Conclusion
* cannot create objects of abstract class
* needs to override ABSTARCT methods,properties inside derived/child class */