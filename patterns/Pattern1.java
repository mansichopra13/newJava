package patterns;
//reactangle
public class Pattern1
{
    public static void main(String  [] args)
    {
        //int n=4
        // int m=5
        //rows work is done by outer loop
        //column work is done by inner loop
    
       for (int i=0;i<4;i++)
       {
        for(int j=1;j<5;j++)
        {
        System.out.print("*");
        }
        System.out.println("*");
       }
    }
}