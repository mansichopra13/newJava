package methods;

public class Callvalue {

    public static void swap(int a,int b)
    {
        
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String [] args)
    {
        //swap-- exchange the number
        int a=5;
        int b=7;
        swap(a,b);
        //this will give a=7 b=5

        //if we add sout in main function instead of swap function then it will return a=5 b=7
        //bcz the changes in swap function will not effect main function 
        //as only copied values was sent in swap function
        //call by value only copy actual parameters into formal parameters

/* 
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);       */
    }
}
