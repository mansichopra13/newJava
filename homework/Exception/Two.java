package homework.Exception;

public class Two {
 
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.setEmp("deepak", 21, 45000);
		e1.dispEmp();
		System.out.println(".......................");
		//int ,char,float - 
		//object --java print - toString();
		String str=e1.toString();//classname@hashcode
		System.out.println(str);
		/////////////String str=new String();//reference data type
	  System.out.println(e1);//e1.toString();//classnaem@hashcode
     	
		
	}
}
////////////////////super base class = object --toString()
class Emp
{
	String strName;
	int age;
	float sal;
	public void setEmp(String s,int a,float sl)
	{
		strName =s;
		age=a;
		sal=sl;
	}
	public void dispEmp()
	{
		System.out.println(strName+" "+ age+" "+ sal);
	}
	public String toString()
	{
	//	String x=super.toString();
		//System.out.println(x);
		String str=strName+" "+ age+" "+ sal;
		return str;
	}
//	
}

