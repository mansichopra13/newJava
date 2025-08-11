package array;
// to find maximum subarray sum
public class Maxsub {

    public static void maxSubArry(int sub[])
    {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;


        for (int i=0;i<sub.length;i++)
        {   int start=i;
            for(int j=i;j<sub.length;j++) //check subarray comment for j=i
            {
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++)
                {
                    currSum += sub[k];
                }
                System.out.println(currSum);
                if(maxSum <currSum)
                {
                    maxSum=currSum;
                }
            }
            
        }
        System.out.println("maxsum" + maxSum );
    }

    public static void main(String[] args)
    {
         int sub [] ={1,-2,6,-1,3};
        maxSubArry(sub);
    } 
}

    
