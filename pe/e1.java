package pe;
import java.util.Scanner;

//calculating percentage of 5 subjects

public class e1 
{
    public static void main(String [] args)
    {
        Scanner marks = new Scanner(System.in);
        System.out.println("English");
            float eng = marks.nextInt();
                System.out.println(eng);

        System.out.println("Hindi");
             float hin = marks.nextInt();
                System.out.println(hin);

        System.out.println("Math");
               float mth = marks.nextInt();
                    System.out.println(mth);

        System.out.println("Science");
              float sci = marks.nextInt();
                    System.out.println(sci);

        System.out.println("Sst");
            float ss = marks.nextInt();
                System.out.println(ss);

                System.out.println(((eng+hin+mth+sci+ss)/500)*100);

    }

    
}
