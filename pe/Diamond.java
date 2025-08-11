public class Diamond {
    //this will always be based on n*n matrix
    //primary daigonal i=j
    //secondaRY daigonal i+j=n-1

    public static int diagonalSum(int matrix[][])
    {  
        int sum=0;

        /*  //this will have complexity O(n^2)
        for(int i=0;i<=matrix.length;i++)
        {
            for(int j=0;j<=matrix[0].length;j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1)
                {
                    sum+=matrix[i][j];
                } 
            }
        }*/
        //this will be the optimised code
        for(int i=0;i<matrix.length;i++)
        {
            //pd
            sum+=matrix[i][i];
            //sd
            if(i !=matrix.length-i-1)
            {
            sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }    
    //this is optimised code

    public static void main(String[]args)
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
    
}
