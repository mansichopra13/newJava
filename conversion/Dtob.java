package conversion;

public class Dtob {
    public static void deciToBin(int n)
    {
        int myNum=n;
        int binNum=0;
        int pow=0;

        while(n>0)
        {
            int rem=n%2;
            binNum = binNum+(rem *(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("value of "+myNum+ "=" +binNum);
    }
    public static void main(String [] args)
    {
        deciToBin(5);
    }

}
