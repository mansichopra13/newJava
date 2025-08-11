package array;
import java.util.*;
public class Subarry {
    public static void subArry(int sub[])
    {
        for (int i=0;i<sub.length;i++)
        {   int start=i;
            for(int j=i;j<sub.length;j++)
            //j=i coz j will consider number from ith index i.e 
            //0 to the length of array
            {
                int end = j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(sub[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int sub [] ={1,2,3,4,5};
        subArry(sub);
    }
    
}
