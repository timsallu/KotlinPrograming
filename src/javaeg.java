public class javaeg {
    public static void main(String args[])
    {
       int sum= FunctionInteroperabilityKt.add(5,6);
       System.out.println("sum is"+sum);
    }

    public static int getArea(int l,int b)
    {
        return l*b;
    }
}
