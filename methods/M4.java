package methods;
import java.util.Scanner;

public class M4 {
    public static int calculateProduct(int a,int b)
    {
        return a*b;
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        int multi=calculateProduct(a, b);
        System.out.println(multi);
        
    }
    
}
