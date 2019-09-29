@file : JvmName("MyCustomKotlinFileName")

package kotlinpakage

import javapackage.MyJavaFile

fun main(args: Array<String>) {

        var area : Int =javaeg.getArea(5,6);
        var area1 : Int =MyJavaFile.getArea(5,6);
        println("area from kotlin file is $area")
    }


    fun add(a: Int, b: Int): Int {
        return a + b;
    }
@JvmOverloads //allows java function to call default argument functions
fun findVolume (l :Int, b:Int, h:Int =10) : Int
{
    return l*b*h;
}
