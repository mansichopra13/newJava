package sort;
public class Insertion {

    //by kunal kushwaha
    static void insertion(int arr[]){
        for(int i =0; i<arr.length-1 ;i++){
            for(int j =i+1 ; j>0 ; j--){
                if(arr[j] <arr[j-1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++) 
        {
            int current =arr[i];
            int prev= i-1;

            while( prev>=0 && arr[prev]>current)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        } 
    }
    public static void printArr(int arr[])
    {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={5,7,13,3,1,4};
        // insertionSort(arr);
        insertion(arr);
        printArr(arr);
    }
    
}
