package co;

public class SvsP
{
    //static vs public
    //static method can be accessed without creating an object
    //public method only be accessed by objects

    static void sMethod()
    {
        System.out.println("can be accessed without creating objects");
    }
    public void pMethod()
    {
        System.out.println("Accessed only by objects");
    }
    public static void main (String [] args)
    {
        sMethod();
        //object creation
        SvsP myObj= new SvsP();

        myObj.pMethod();
    }
}