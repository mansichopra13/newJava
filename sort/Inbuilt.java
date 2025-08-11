import java.util.Arrays;
//for reverse order we can import collection class
//import java.util.collections
//and can write it as a

//Arrays.sort(arr,Collections.reverseOrder())
//reverse order only works on object & not on primitive type therefore we have to change"int to Integer" 

public class Inbuilt {
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int arr[]={5,4,7,2,1};

        Arrays.sort(arr);//we can also pass starting index  and ending index

        printArr(arr);

    }
}
