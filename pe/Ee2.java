import java.util.Scanner;

//to find greatest of two numbers

public class Ee2 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int m=sc.nextInt();

        if(m>n)
        {
            System.out.println("print m: "+m);
        }
        else
        {
            System.out.println("print n: "+n);
        }
    }
}
