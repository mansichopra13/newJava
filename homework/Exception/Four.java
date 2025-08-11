//////////
////////////////////////nested try catch
//public class Entry
//{
//	public static void main(String[] args) 
//	{
//		int age=900;
//		System.out.println("1");
//		try	
//		{
//			if(age<18)
//			{			System.out.println("2");	throw new IOException("age is too small");
//			}
//							try			
//							{	if(age>100)
//								{			System.out.println("3");	throw new Exception("age is too large");
//								}
//							}
//							catch(IOException ie)			
//							{				System.out.println("3.1 "+ie.getMessage());			}
//							finally			
//							{
//								System.out.println("inner finally");
//							}
//		}
//		catch(Exception ie)		
//		{
//			System.out.println("3.2 "+ie.getMessage());
//		}
//		finally 
//		{			System.out.println("*3.3*outer finally ");		
//		}			
//		System.out.println("4*");
//	}
//}
//age=900
//1
//3
//inner finally
//3.2 age is too large
//*3.3*outer finally 
//4***

//
////////
//public class Entry
//{
//	public static void main(String[] args) {
//		int age=900	;
//		System.out.println("1");
//		try
//		{
//		if(age<18)
//		{			System.out.println("2");
//			throw new IOException("age is too small");
//		}
//		if(age>100)
//		{			System.out.println("3");
//			throw new NullPointerException("age is too large");
//		}
//		}
////		catch(NullPointerException  e)
////		{			
////			System.out.println("3.1 "+e.getMessage());
////		}
//		catch(IOException ie)
//		{			System.out.println("3.2 "+ie.getMessage());
//		}
//		finally {			System.out.println("*3.3**finally ");			
//		}			
//		System.out.println("4*");
//	}
//}

//
//
////////////
//////////////////////////here order matter
//public class Entry
//{
//	public static void main(String[] args) {
//		int age=900; 		System.out.println("1");
//		try
//		{
//			if(age<18)
//			{
//				System.out.println("2"); 	throw new IOException("age is too small");
//			}
//			if(age>100)
//			{
//				System.out.println("3");	throw new Exception("age is too large");
//			}
//		}
//		catch(IOException ie)
//		{
//			System.out.println("3.1 "+ie.getMessage());
//		}
//		catch(Exception  e)
//		{			
//			System.out.println("4 "+e.getMessage());
//		}
//		
//			
//		System.out.println("6*");
//	}
//}

//
////
//