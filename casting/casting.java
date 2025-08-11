package casting;
public class casting 
{
    public static void main(String [] args)
    {
        // assigning value of primitive datatype to another type
        //PRACTICE IT
        //widen will do automatically when passing from small to large size

        int marks =5;
        double mymarks =marks;
        System.out.println(marks);
        System.out.println(mymarks);

        //narrow done by placing type in parenthesis

        double my=89.7d;
        int ym=(int)my;
        System.out.println(ym);


    
    
    }
}
