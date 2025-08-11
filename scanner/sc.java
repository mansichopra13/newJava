package scanner;
import java.util.Scanner;

public class sc 
{ 

    public static void main(String [] args)
    {
        Scanner name = new Scanner(System.in);
        System.out.println("name of the applicant");
        String li= name.next();
        String lin = name.nextLine();
      System.out.println(li);
      System.out.println(lin);
    }
}