package modifier;

public class st {
    
    static void myStaticMethod()
    {
        System.out.println("static can be called without creating objects");
    }
    public void myPublicMethod()
    {
        System.out.println("public can only be called by creating objects");
    }
    public static void main(String [] args)
    {
        myStaticMethod();
        st myObj = new st();
        myObj.myPublicMethod();
        
    }
}
