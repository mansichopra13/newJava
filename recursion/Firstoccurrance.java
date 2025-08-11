package recursion;

public class Firstoccurrance {
    public static int firstOccurr(int arr[] , int key , int i){
        if(i==arr.length){
            return  -1;
        }
        if(arr[i]==key){
            return i;
        }
         return firstOccurr(arr, key,i+1);
    }

    public static void main(String [] args){
        int arr[]= {6,7,4,6,4,5,3,2,0,1};
        System.out.println(firstOccurr(arr, 3, 0));
    }
}
