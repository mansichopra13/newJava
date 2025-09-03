package sort;
//pushing the bigger one at last by swaping
public class Bubb {
    public static void bubbleSort(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)//why to touch the sorted part that's why -i
            {
            if(arr[j]>arr[j+1])
            {
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {

    int arr[]={5,4,1,3,2};
    bubbleSort(arr);
    printArr(arr);
    }
    
}
