package homework.Exception;

public class One {
    
    
	public static void main(String[] args) {

		System.out.println("1");
		int age=9;
		try
		{
			if(age<18)
			{
				throw new NullPointerException("age is too small");//throw new Emp();
				
			}
			System.out.println("2");
		}
		catch(NullPointerException npe)//Emp e1=new Emp();//NullpointerException npe=new NullPointerException(msg);		
		{
			System.out.println(npe.getMessage());
		}
		System.out.println("");
}
}
	




//
//public class Entry {
//
//	public static void main(String[] args) {
//		
//		System.out.println("1");
//		Emp e1=null;
//		try
//		{
//		e1.setEmp("deepak", 21, 45000);
//		e1.dispEmp();
//		}
//		catch(NullPointerException npe)
//		{
//			System.out.println("something went wrong pls contact admin @5454859854");
//		}
//		System.out.println("");
//		
//		
//	}
//}
//
//class Emp
//{
//	String strEname;
//	int age;
//	float sal;
//	public void setEmp(String s,int a,float sl)
//	{
//		strEname=s;
//		age=a;
//		sal=sl;		
//	}
//	public void dispEmp()
//	{
//		System.out.println(strEname+" "+ age+" "+ sal);
//	}
//}

//
//public class Entry {
//
//	public static void main(String[] args) {
//		
//		System.out.println("1");
//		Emp e1=null;
//		e1.setEmp("deepak", 21, 45000);
//		e1.dispEmp();
//		System.out.println("");
//		
//		
//	}
//}
//
//class Emp
//{
//	String strEname;
//	int age;
//	float sal;
//	public void setEmp(String s,int a,float sl)
//	{
//		strEname=s;
//		age=a;
//		sal=sl;		
//	}
//	public void dispEmp()
//	{
//		System.out.println(strEname+" "+ age+" "+ sal);
//	}
//}

