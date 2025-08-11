package recursion;
// printing number in  decreasing order
public class Basics {
    public static void printDec(int N){
        if(N==1){
            System.out.println(1);
            return;
        }

        System.out.println(N);
        printDec(N-1);
    }
    public static void main(String [] args)
    {
        int N=10;
        printDec(10);
    }
}
