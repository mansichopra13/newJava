package homeRevision;
import java.util.Scanner;



public class Calculator {
    
	public static void main(String[] args) {
		
		while(true) {
		int ch;
        
		//object creation
        ConsoleIpOp objCI=new ConsoleIpOp();
		Calc  objCal=new Calc();
		
		System.out.println("enter 1 for add");
		System.out.println("enter 2 for sub");
		System.out.println("enter 3 for mul");
		System.out.println("enter 4 for div");
		System.out.println("enter 5 for exit");
		System.out.println("enter your choice");
		ch=objCI.getInt();
		switch(ch)
		{
		case 1:
			System.out.println("Add");
			objCal.add();
			break;
		case 2:
			System.out.println("sub");
			objCal.sub();
			break;
		case 3:
			System.out.println("mul");
			objCal.mul();
			break;
		case 4:
			System.out.println("div");
			objCal.div();
			break;
		case 5:
			System.exit(0);//it forcefully shutdown the jvm 
			default:
				System.out.println("pls enter val bw 1-5");
		}
		}
		
		
	}
}


class Calc
{
	ConsoleIpOp objCI=new ConsoleIpOp();
	
	public void add()
	{
		int a,b,c;
		System.out.println("enter val of a and bbbbbbbbbbbbbb ");
		a=objCI.getInt();
		b=objCI.getInt();
		c=a+b;
		System.out.println("res is "+ c);
		
	}
	public void sub()
	{
		int a,b,c;
		System.out.println("enter val of a and b ");
		a=objCI.getInt();
		b=objCI.getInt();
		c=a-b;
		System.out.println("res is "+ c);		
	}
	public void mul()
	{
		int a,b,c;
		System.out.println("enter val of a and b ");
		a=objCI.getInt();
		b=objCI.getInt();
		c=a*b;
		System.out.println("res is "+ c);		
	}
	public void div()
	{
		int a,b,c;
		System.out.println("enter val of a and b ");
		a=objCI.getInt();
		b=objCI.getInt();
		c=a/b;
		System.out.println("res is "+ c);		
	}
}




class ConsoleIpOp
{
	public int getInt()
	{
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		return x;
	}
}



