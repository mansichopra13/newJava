package iff;

import java.util.Scanner;
// program to find whether the given number is positive or negative
public class Posneg {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        if (a>0)
        {
            System.out.println("it is positive number");
        }
        else{
            System.out.println("it is a negative number");
        }
    }
    
}
