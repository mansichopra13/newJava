package recursion;

import java.net.SocketTimeoutException;

public class Inc {
   /*  public static void printInc(int n){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        printInc(n+1);
    }
    public static void main(String [] args)
    {
        int n=1;
        printInc(1);
    }*/
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static void main (String[] args)
    {
        int n=10;
        printInc(n);
    }
}
