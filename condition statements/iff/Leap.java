package iff;
import java.util.Scanner;

public class Leap {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year : ");
        int year=sc.nextInt();

        //year divisible by 4 or 400 is a leap year
        //also not divisible by 100 

        boolean x=(year % 4) == 0;
        boolean y=(year % 100) != 0;
        boolean z=((year % 100==0)&& (year %400==0));

        if (x &&(y||z))
        {
            System.out.println("leap year");        }
            else{
                System.out.println("not a leap year");
            }

    }

    
}
