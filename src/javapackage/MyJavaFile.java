package javapackage;

import kotlinpakage.MyCustomKotlinFileName;

public class MyJavaFile {

    public static void main(String args[])
    {
        int sum = MyCustomKotlinFileName.add(5,6);
        int vol=MyCustomKotlinFileName.findVolume(5,6,7);
        int vol1=MyCustomKotlinFileName.findVolume(5,6);
        System.out.println("sum is"+sum);
        System.out.println("vol is"+vol+","+vol1);
    }

    public static int getArea(int l,int b)
    {
        return l*b;
    }
}
