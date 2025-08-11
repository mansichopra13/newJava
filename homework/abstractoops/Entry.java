package homework.abstractoops;


    
public class Entry {

	public static void main(String[] args) {
		
		switch(1)
		{
		case 1:
			Derive1 d1=new Derive1();
			d1.f1();d1.f2();d1.f3();
			break;
		case 2:
			//Base b1=new Base();//error - we can not create object of abstract class , but we can create its reference.
			Base b1=new Derive1();
			//with the help of reference of abstract class , we can call only those functions which are declared inside abstract class.
			b1.f1();b1.f2();
//			b1.f3();//error 
			break;
		}
	}
}
/*
 There are 2 type of classes in java
 1- Abstract class - is that class to which we can not create object
 To make any class abstract we need to use abstract keyword
 Abstract class - class contain 2 type of function - 
 a) Abstract function  - Function without body - to make any function abstract we need to use abstract keyword 
 b) Non Abstract function - Function with body
 
 
 2- Concrete class - is that class to which we can create object
  
  */

abstract class Base
{
	public void f1()
	{
		System.out.println("f1 called - Base");
	}
	abstract public  void f2();
}


class Derive1 extends Base
{

	@Override
	public void f2() {
		// TODO Auto-generated method stub
	  System.out.println("f2 called - Derive1");	
	}
	public void f3()
	{
		System.out.println("f3 called - derive1");
	}
	
}

