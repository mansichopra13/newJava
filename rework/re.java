package rework;
import java.util.Scanner;

class Ip{
    public int io(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        return x;
    }
    
}
class Cal {
    Ip i=new Ip();

    public void add(){
        int a,b,c;
        System.out.println("enter value of a,b");
        a=i.io();
        b=i.io();
        c=a+b;
        System.out.println("The addition is :"+c);

    }
     public void sub(){
        int a,b,c;
        System.out.println("enter value of a,b");
        a=i.io();
        b=i.io();
        c=a-b;
        System.out.println("The subtraction is :"+c);

    }
     public void mul(){
        int a,b,c;
        System.out.println("enter value of a,b");
        a=i.io();
        b=i.io();
        c=a*b;
        System.out.println("The multiplication is :"+c);

    }
     public void div(){
        int a,b,c;
        System.out.println("enter value of a,b");
        a=i.io();
        b=i.io();
        c=a/b;
        System.out.println("The division is :"+c);

    }
    
}


public class re {

    public static void main(String [] args){

        

        while(true){

            Cal c=new Cal();
        Ip iobj=new Ip();

            System.out.println("enter your choice");
            System.out.println("1 to add");
            System.out.println("2 to sub");
            System.out.println("3 to mul");
            System.out.println("4 to div");
            System.out.println("5 to exit");

            Scanner s=new Scanner(System.in);
            int ch=s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("add");
                    c.add();
                    break;

                    case 2:
                    System.out.println("sub");
                    c.sub();
                    break;

                    case 3:
                    System.out.println("mul");
                    c.mul();
                    break;

                    case 4:
                    System.out.println("div");
                    c.div();
                    break;

                    case 5:
                    System.exit(0);;
                    
                    break;
            
                default:
                System.out.println("enter number in between 1-5");
                    break;
            }
        }
    }
}
