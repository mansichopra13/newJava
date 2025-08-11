package recursion;
//Q- in a party a person can stand in pair and paired person cannot make pair with any other member
// and we need to find ways

public class Singleorpair {
    public static int singleOrPair(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        //int fnm1= singleOrPair(n-1);
        //pair
        //int fnm2 = singleOrPair(n-2);
        //int pairWays =fnm1 *fnm2;
        //totalways
        //int totalWays=fnm1 *pairWays;
       // return totalWays;
        //or instead of writing big code write only below statement
        return singleOrPair(n-1) + (n-1) * singleOrPair(n-2);
    }
    public static void main(String [] args){
        int n=3;
        System.out.println(singleOrPair(n)); 
    }
}
