package imp;
//find error
public class Prime {

    public static void isPrime(int n)
    {
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                System.out.println("not prime");
            }
            System.out.println("prime");
        }
    }
    public static void main(String [] args)
    {
        System.out.println(isPrime(5));

    }
}
