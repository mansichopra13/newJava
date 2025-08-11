package conversion;

public class Btod {

    public static void binToDec(int binNum)
    {   int myNum=binNum;
        int pow=0;
        int deciNum=0;

        while(binNum > 0)
        {
            int lastDigit=binNum % 10;
            deciNum= deciNum + (lastDigit* (int)Math.pow(2,pow));

            pow++;
            binNum=binNum/10;

        }
        System.out.println("value of "+ myNum + "=" + deciNum);
    }
    public static void main(String [] args)
    {
        binToDec(101);
        
    }
}
