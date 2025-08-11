package homework.Exception;

// public class Three {
    //////////EXCEPTION CLASS CAN HANDLE ANY TYPE OF ERROR
//////Base b=new Derive();//allowed
//////Derive d=new Base();//error 

// 	public static void main(String[] args) {
// 		int age=900;
// 		System.out.println("1");
// 		try
// 		{
// 		if(age<18)
// 		{
// 			System.out.println("2");
// 			throw new IOException("age is too small");
// 		}
// 		if(age>100)
// 		{
// 			System.out.println("3");
// 			throw new SQLException("age is too large");
// 		}
// 		}
// 		catch(Exception  e)
// 		{
			
// 			System.out.println("4 "+e.getMessage());
// 		}
		
// 		System.out.println("6*");
// 	}
// }


// //////////////we can have multipal catch handler in our programe
// //io and sql exception calss are siblings
// public class Entry
// {
// 	public static void main(String[] args) {
// 		int age=900;
// 		System.out.println("1");
// 		try
// 		{
// 		if(age<18)
// 		{
// 			System.out.println("2");
// 			throw new IOException("age is too small");
// 		}
// 		if(age>100)
// 		{
// 			System.out.println("3");
// 			throw new SQLException("age is too large");
// 		}
// 		}
// 		catch(IOException  ie)
// 		{			
// 			System.out.println("4 "+ie.getMessage());
// 		}
// 		catch(SQLException se)
// 		{			System.out.println("5 "+se.getMessage());
// 		}
		
// 				System.out.println("6*");
// 	}
// }


// ////////////////////////////////////////////////////////////////////
// //
// //////////////////checked exception - try catch we must apply
// public class Entry
// {
// public static void main(String[] args) {
// 	System.out.println("1");
// 	int age=9;
// 		if(age<18)
// 		{
			
// 			System.out.println("2");
// 			try
// 			{
// 			throw new IOException("age is too small");//throw Exception
// 			}
// 			catch(IOException ie)
// 			{
// 				System.out.println(ie.getMessage());
// 			}
	
	
// 		}
// 		System.out.println("*");
// 	}
// }
// //////////////////checked exception - try catch we must apply
// public class Entry
// {
// 	public static void main(String[] args) {
// 		System.out.println("1");
// 		int age=9;
// 		if(age<18)
// 		{
// 			System.out.println("2");
			
// 				throw new IOException("age is too small");//throw Exception
			
		
			
// 		}
// 		System.out.println("*");
// 	}
// }


// // =================================================================
// ////unchecked exception - try catch we should apply
// //
// public class Entry
// {
// 	public static void main(String[] args) {
// 		System.out.println("1");
// 		int age=9;
// 		if(age<18)
// 		{
// 			System.out.println("2");
// 			try
// 			{
// 			throw new NullPointerException("kuldeep - age is too small");//throw Exception//new Emp();
// 			}
// 			catch(NullPointerException npe)
// 			{
// 				System.out.println(npe.getMessage());
// 			}
			
			
			
			
// 		}
// 		System.out.println("*3");
// 	}
// }



/*
1-in case of -  unchecked exception - try catch is not compulsory
*/
// public class Entry
// {
// 	public static void main(String[] args) {
// 		System.out.println("1");
// 		int age=9;
// 		if(age<18)
// 		{
// 			System.out.println("2");
// 			throw new NullPointerException("age is too small");//throw Exception--
// 			//unchecked exception - try catch optional
// 		}
// 		System.out.println("*");
// 	}
// }

