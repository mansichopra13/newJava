package array;

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
    }
}
