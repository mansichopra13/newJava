public class math 
{
    public static void main(String [] args)
    {
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.abs(-55));
        System.out.println(Math.random());

    // to print random number between 0 to 100
    
        int randomNum = (int)((Math.random())*101);
        System.out.println(randomNum);
    }
}
