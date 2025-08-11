package loop;

//find error
import java.util.Scanner;
public class Adding {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int eve=0;
        int odd=0;

        do{
            System.out.println("enter number");
            number=sc.nextInt();
        
        if (number%2==0)
        {
            eve+=number;
        
        }
        else{
            odd+=number;
            
        }
        System.out.println("do you want to continue? press 1 for yes or 0 for no");
        choice=sc.nextInt();
    } while(choice==1);
    System.out.println(eve);
    System.out.println(odd);
    }
}   
