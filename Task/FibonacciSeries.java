package Task;
import java.util.Scanner;

public class FibonacciSeries {
    public static void Fibo(int Number){
        int F1=0;
       int F2= 1;
       int F3,i;
       System.out.print(F1+" ");
       System.out.print(F2+" ");
       for(i=2;i<Number;i++)
       {
        F3=F1+F2;
        if(F3<Number){
        System.out.print(F3+" ");
        }
        //swap
        F1=F2;
        F2=F3;
       }
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number to get Fibonacci series :" );
        int Number=sc.nextInt();
        if(Number<0){
            System.out.println("Please enter a valid positive number!");
         
        }else{
       Fibo(Number);
        }
    }
}