package NullSafe

fun main (args: Array<String>)
{
     /*
     late in it used only with mutable data type
     lateinit used only with non -nullable
     values must be intialized before u use it
     * */
    var country = Country()
      country.name="csakjsabk"  // must be intialized before u use it else uninitializedpropertyaccessexception
        println("${country.name}")

}

class  Country
{
   // var name : String //must intialize
//    var name1 : String? =null //using  intialize
    //or
   lateinit var name : String  //using  intialize

}