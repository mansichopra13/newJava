import java.util.Scanner;

public class a1 {
    

    public static void main (String [] args)
    {
        //leap year program
        System.out.println("enter year::");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();

        //both ifs are right
       // if(((x % 4== 0) &&(x % 100 !=0)||(x % 400 ==0)))
       if((x % 4== 0) &&(x % 100 !=0))

        {
            {
            System.out.println("leap");
            }

        }
        else
        {
            System.out.println("common");
        }
        
    }
    
}
