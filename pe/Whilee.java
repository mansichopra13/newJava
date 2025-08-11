import java.util.Scanner;

public class Whilee {
    public static void print_series(int n)
    {
         /* Print the following series 
            1 4 9 16 25 36 to n. Note print all the numbers in a seperate line*/

            int i=1;
            while(i<=n){
                
                System.out.println(i*i);
                i++;
            }
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        print_series(n);
    }
}
