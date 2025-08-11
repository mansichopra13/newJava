package recursion;

public class Lastoccurrance {
    public static int lastOccurr(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound =lastOccurr(arr,key,i+1);

        if(isFound ==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static void main(String [] args){
        int arr[]= {6,4,3,7,4,8,5,3,2,7};

        System.out.println(lastOccurr(arr, 3, 0));
    }
}
