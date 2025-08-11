import java.util.Scanner;
//find error
public class StorePrime {
    public static int[] printPrimes(int n){
        int count=0;
        int [] primes=new int[n];
        int isPrime=2;
        for(int i=0;i<count;i++){
            boolean flag =true;
            for(int j=2;j<isPrime;j++){
                if(isPrime%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                primes[count]=isPrime;
                count++;
            }isPrime++;
        }
        return primes;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int output[]=printPrimes(n);
        for(int i=0;i<n;i++){
            System.out.println(output[i]);
        }
    }
}
