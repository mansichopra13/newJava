public class Spiral{
    public static void printSpiral(int matrix[][])
    {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol= matrix[0].length-1;
        //matrix of zero will give zeroth row fr jo uski length nikalenge to milenge total col

        while(startRow<=endRow && startCol<=endCol)
        {
            //top -- here row is fix col is increasing
            for(int j=startCol;j<=endCol; j++)
            {
                System.out.print(matrix[startRow][j] + " ");
            }
            //right -- col fix row inc --
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(matrix[i][endCol] + " " );
            }
            //bottom ---row vary col fix
            for(int j=endCol-1; j>=startCol;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1;i--)
            {
                if(endCol==startCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
            

        }System.out.println();

    }
    //spiral matrix
    public static void main(String []args)
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
}
    

