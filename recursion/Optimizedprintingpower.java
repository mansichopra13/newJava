package recursion;
// o(log n ) complexity
public class Optimizedprintingpower {
    
    public static int OptimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = OptimizedPower(a, n/2);
        int half= halfPower*halfPower;//OptimizedPower(a, n/2) * OptimizedPower(a, n/2); thisgiveO(n)complexity
        // n is odd
        if(n%2 !=0){
            half = a * half;
         }
         return half;

    }
    public static void main(String [] args){
        int a=2;
        int n=5;
        System.out.println(OptimizedPower(a, n));
    }
}
