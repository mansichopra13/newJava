package co;

public class constructor {
    int a;

    //creating a constructor(classes have it by default)
    //class name = contructor name(called when object is created)
    //contructor cannot have a return type
    public constructor()
    {
        a=5;
    }
    public static void main(String [] args)
    {
        constructor myObj=new constructor();
        System.out.println(myObj.a);
    }
}
