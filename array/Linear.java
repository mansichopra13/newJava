package array;
//checks one by one from start is there a key or not

public class Linear {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
       int  arr[]={5,2,1,7,5,4,3};
        int key =1;

        int index = linearSearch(arr, key);
        if(index==-1){
        System.out.println("not found");
        }
        else {

            System.out.println(index);
        }
    }
}
