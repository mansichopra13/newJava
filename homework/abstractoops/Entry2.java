package homework.abstractoops;


    
public class Entry2 {

	public static void main(String[] args) {
		
		switch(3)
		{
		case 1:
			Derive2 d2=new Derive2();
			d2.f1();d2.f2();
			d2.f3();
			d2.f4();d2.f5();
			break;
		case 2:
			Derive1 d1=new Derive2();
			d1.f1();d1.f2();
			d1.f3();
			d1.f4();
			break;
		case 3:
			Base b1=new Derive2();
			b1.f1();b1.f2();
			b1.f3();
			break;
		}
	}
}
abstract class Base
{
	abstract	public void f1();
	abstract public void f2();
	public void f3()
	{
		System.out.println("f3 called base");
	}
	
}

abstract class Derive1 extends Base
{
	public void f1()
	{
	 System.out.println("f1 called derive1");	
	 
	}
	public void f4()
	{
		System.out.println("f4 called derive1");
	}
}

class Derive2 extends Derive1
{
	public void f2()
	{
		System.out.println("f2 called derive2");
	}
	public void f5()
	{
		System.out.println("f5 called derive2");
	}
}

