package OOPS

fun main (args : Array<String>)
{
    var myButton =MyButton()
    myButton.OnClick()
    myButton.onTouch()
    myButton.OnLongClick() //u can call interface methods like this
}

interface MyinterfaceListener
{
    var name: String  ///property cannot be initialized in  interface

    fun onTouch() //if no body, methods are abstract by default and must override when implemented

    fun OnClick() //by default public & open in nature , not necessary to override
    {
        println("On Clicked in Interface")
    }

}

interface MyinterfaceListenerSec
{
    var name: String  ///property cannot be initialized in  interface

    fun onTouch()
    {
        println("On touched interface")
    }

    fun OnClick() //by default public & open in nature , not necessary to override
    {
        println("On Clicked in Interface 2")
    }

    fun OnLongClick()
    {
        println("OnLongClick")
    }

}


class MyButton : MyinterfaceListener, MyinterfaceListenerSec
{
    override var name: String ="dfbsdhfuyd"

    override fun onTouch() { // must override when implemented

        super.onTouch() //i can call ontouch method if interface 2
        println("On touched")
    }

    override fun OnClick() {
        super<MyinterfaceListener>.OnClick()
        super<MyinterfaceListenerSec>.OnClick()
        println("On Clicked in class")
    }
}
                                    /*CONCLUSION:
                                    * Interface can contain both Normal methods(OnClick()) and Abstract (onTouch) methods
                                    * but they contains only abstarct properties
                                    * interface cannot be instantiated
                                    * when we Implement 2 interface in same class like above
                                    * suppose it has same name means we must override that method like Onclick
                                    * if only one normal method not necessary to override like  OnLongClick
                                    * to call interface methods from override methods use super key word
                                    * incase of same methods present in mutliple interface specify
                                    * which interface method u want to invoke (super<MyinterfaceListener>.OnClick()
                                            super<MyinterfaceListenerSec>.OnClick() )*/