package array;
import java.util.*;
//big number with array
// for this we use -infinity or + infinity
//-infinity = integer.min_value
//+infinity = integer.max_value

public class Bignoarry {
    public static int bigNo( int numbers[])
    {
        int big=Integer.MIN_VALUE;  //-infinity

        for(int i=0;i<numbers.length;i++)
        {
            if(big<numbers[i])
            {
                big=numbers[i];
            }
        }
        return big;
    }
// same goes for small 
    public static void main (String [] args)
    {
        int  numbers[]={1,5,2,7,3};
        System.out.println("big number is " + bigNo(numbers));
    }
    
}
