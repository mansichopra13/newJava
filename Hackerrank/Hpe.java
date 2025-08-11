import java.util.*;
public class Hpe {

    private static final Scanner scanner = new Scanner(System.in);
    
        public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if(N%2 != 0)
            {
                System.out.println("Weird");
            }
            else if((N%2 ==0) && (N>20) && (N<5))
            {
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
            scanner.close();
        }

}
