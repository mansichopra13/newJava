package modifier;

public class F1 {
    

        //this will show error as final value cannot be reassigned
            
            final int x =5;
            final double PI =3.14;
            public static void main(String [] args)
            {
                F1 myObj = new F1();
                myObj.x=5;
                myObj.PI=3.14;
                System.out.println(myObj.x);
            }
}
