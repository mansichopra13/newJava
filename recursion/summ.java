package recursion;

public class summ {
    public static void main(String [] args)
    {
        int result = sum(3);
        System.out.println(result);
    }
    public static int sum(int m)
    {
        if(m>0)
        {
            return m+sum(m-1);

        }
        else
        {
            return 0;
        }
    }
}
