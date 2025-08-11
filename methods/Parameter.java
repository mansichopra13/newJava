package methods;
//function overloading with parameters

public class Parameter {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a ,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String [] args)
    {
        int x=sum(3,5);
        int y=sum(1,2,3);
        System.out.println(x);
        System.out.println(y);
    }
}
