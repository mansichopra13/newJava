package recursion;

public class Printpower {
    public static int printingPower(int x, int n){
        
        if(n==0){
            return 1;
        }
        /*int xnm1= printingPower(x, n-1);
        int xn = x * xnm1;
        return xn;*/
        return x* printingPower(x,n-1);
            
    }
    public static void main(String[] args){
        System.out.println(printingPower(2,5 ));
    }
}
