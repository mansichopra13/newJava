package array;
//looping through array via for loop and for each
public class Arylp {
    public static void  main(String [] args)
    {
        String [] food = {"dosa","paneer tikka","chowmin","burger","rajma rice"};
       

        //array with for loop
        for(int i=0;i<food.length;i++)
        {
            System.out.println(food [i]);
        }
        // array with for each
        System.out.println("-------for each------");
        //for(datatype variablename :arrayname)
        for(String i:food)
        {System.out.println(i);}

        int num[]={5,7,8,3,6,1};
        for(int j:num){
            System.out.println(j);
        }
    }
}
