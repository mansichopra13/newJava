package methods;
//method parameters

public class m1 {
    static void surName(String sname) // declaring method
    {
        System.out.println(sname+" chopra");
    }
    public static void main(String [] args)
    {
        System.out.println("The siblings are");
        surName("Mansi"); //calling method
        surName("Manik");
        surName("Shivani");
    }
}
