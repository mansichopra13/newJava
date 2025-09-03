package array;
//linear search
//checks one by one from start is there a key or not

// public class Linear {
//     public static int linearSearch(int arr[],int key){
//         for(int i=0;i<=arr.length;i++){
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//        int  arr[]={5,2,1,7,5,4,3};
//         int key =1;

//         int index = linearSearch(arr, key);
//         if(index==-1){
//         System.out.println("not found");
//         }
//         else {

//             System.out.println(index);
//         }
//     }
// }

public class Linear{
    static int linearSearch(int nums[],int key){
        for(int i =0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }return -1;
    }
    public static void main(String [] args){
        int nums[]={4,5,8,1,6};
        int key=5;
        int index=linearSearch(nums,key);
        if(index==-1){
            System.out.println("keyy not found");
        }else{
            System.out.println(index);
        }
    }
}