package array;
//find error

public class Multfr {
    public static void main (String [] args)
    {
        int [][] team = {{2,3,5},{7,8,9}};
        int i;
        for (i=0;i<=team.length-1;i++)
        {
            for (int j=0;j<=team[i].length-1;j++)
            {
                System.out.println(team[i][j]);
            }
        }
    }
    
}
