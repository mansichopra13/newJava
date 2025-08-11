package array;
//used in sorted array by repeatedly dividing search interval  in half
//time complexitity- o(logn)
public class Binsearch {
    public static int BinSearch(int numbers[],int key)
    {
        int start=0;
        int end =numbers.length-1;

        for(int i=0;i<=numbers.length;i++)
        {
            //introducing mid
            int mid= (start+end)/2;

            if( key==numbers[mid])
            {
                return mid;
            }
            else if(key>numbers[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args)
    {
       // int numbers [] = new int [5];
       int numbers[]={1,2,3,4,5};
       int key =  1;

       System.out.println(BinSearch(numbers,key));

    }
    
}
