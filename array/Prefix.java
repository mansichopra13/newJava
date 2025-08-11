package array;
//prefix sum
public class Prefix {
    public static void pre(int numbers[])
    {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        //new array creation
        int prefix[]=new int [numbers.length];

        prefix[0]=numbers[0];

        //calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {   //[2 , 2+4 , 2+4+6 , 2+4+6+8 , 2+4+6+8+10]
            //[0th , 0th+num[i] , 1st + num[i] , 2nd + num[i], 3rd +num[i] ]
            prefix[i]=prefix[i-1] + numbers[i];
        }
        for (int i=0;i<numbers.length;i++)
        {   int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end = j;
                // ternary operator 
                currSum = start==0? prefix[end] : prefix[end]-prefix[start-1];
                
                if(maxSum <currSum)
                {
                    maxSum=currSum;
                }
            }
            
        }System.out.println("maxsum" + maxSum);
    }   
    

        public static void main(String[] args)
    {
            int numbers[]= {2,4,6,8,10};
            pre(numbers);
    }

}            
