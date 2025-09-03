package array;
//pairs in array



// public class Pair {
//     public static void printPair(int p[])
//     {   int tp=0;
//         for (int i=0 ; i<p.length;i++)
//         {
//             int current=p[i];//2,4,6,8,10
            
//             for(int j=i+1;j<p.length;j++)
//             {
//                 System.out.print("(" + current +"," + p[j] + ")");
//                 tp++;
//             }
//             System.out.println();
            
//         }
//         System.out.println("total pairs" + tp);
//     }

//     public static void main(String[] args)
//     {
//         int p []={2,4,6,8,10};

//         printPair(p);
//     }
    
// }


public class Pair{
    public static void main(String [] args){
        int nums[]={1,2,3,4,5};

        for(int i =0 ; i<nums.length ; i++){
            for(int j =i+1; j<nums.length; j++){
                System.out.print("("+nums[i]+ ","+nums[j]+")");
            }
            System.out.println();
        }
    }
}