package array;
// reverse the array
// public class Revarry {
//     public static void reverseIt(int rev[])
//     {
//         int first=0;
//         int last=rev.length-1;

//         while(first<=last)
//         {

//             int temp=rev[last];
//             rev[last]= rev[first];
//             rev[first]=temp;

//             first++;
//             last--;

//         }
//     }
//     public static void main(String [] args)
//     {
//         int rev[]={1,2,3,4,5};

//         reverseIt(rev);

//         //print
//         for(int i=0;i<=rev.length-1;i++)
//         {
//             System.out.print(rev[i] +" ");
//         }
//         System.out.println();
//     }
    
// }


public class Revarry{

 public static void main(String [] args){
    int nums[]={1,2,3,4};
int first=0;
         int last = nums.length-1;
   
    int i =0;
         while(i<nums.length/2){
            int temp= nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
             i++;
         }
    
        for(i=0;i<=nums.length-1;i++){
            System.out.println(nums[i]);
        }


 }
}