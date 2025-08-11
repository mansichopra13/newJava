import java.sql.SQLException;

import java.io.IOException;
//import java.sql.SQLException;
////user of throws keyword
public class Entry
{
	public static void main(String[] args) {
		
		//now we will surround this call of function within try catch block
			Sample s1=new Sample();
		
					try {
						s1.fun();
					} catch (IOException e) {
						
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
		
	}
}
class Sample
{
	//this function has capability to raise checked/unchecked exception.
	public void fun()  throws IOException
	{
		int age=9;
		if(age<18)
		{
			throw new IOException("age is too small");
		}
	}
}

////////////
//////////////////////USER DEFINED EXCEPTION
//public class Entry
//{
//	public static void main(String[] args) {
//		int age=9;
//		try
//		{
//			if(age<18)
//			{
//				throw new MyException("age is too small");
//			}
//		}
//		catch(MyException me)
//		{
//			System.out.println(me.getMessage());
//		}
//	}
//}
//class MyException extends Exception 
//{
//	public MyException()
//	{
//		super();
//	}
//	public MyException(String msg)
//	{
//		super(msg+" pls contact admin @ 347643874334");
//	}	
//}