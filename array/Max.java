package array;

public class Max {
    public static void getMax(int arr[])
    {
        int maximum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maximum<arr[i]){
                maximum=arr[i];
            }
        }
        System.out.println(maximum);
        
    }
    public static void main(String [] args)
    {
        int arr[]={5,4,3,8,1};
        getMax(arr);
    }
    
}
