package loop;
import java.util.Scanner;
public class Factorial {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int fact=1;

        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
            //1=1*1
            //1=1*2
            //2=2*3
            //6=6*4
            //24=24*5....and so on
            
        }
        System.out.println(fact);

    }
}
