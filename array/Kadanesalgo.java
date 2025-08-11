package array;
//if array contains -ve currentSum then it takes currentsum as 0
public class Kadanesalgo {

    public static void kadane(int numbers[])
    {
        int ms=Integer.MIN_VALUE;//maxsum
        int cs=0;//currentsum

        for(int i=0;i<numbers.length;i++)
        {
            cs= cs + numbers[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("maxsum" +ms);
    }
    public static void main(String[]args)
    {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
            kadane(numbers);
    }
    
}
