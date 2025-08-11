package methods;
//method overloading---method can have---same name different parameters

public class m3 
{
   static int plusMethod(int x, int y)
   {
    return x+y;
   } 
   static double plusMethod(double x, double y)
   {
    return x+y;
   }
   public static void main(String [] args)
   {
    int z= plusMethod(5,5);
    double v =plusMethod(7.7,7.7);
    System.out.println("int" + z);
    System.out.println("double"+ v);


   }
}
