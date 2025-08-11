package homework;
    /*
 Person - nm,age,wt             A
 Emp    - nm,age,wt,sal         A+ 
 SM     - nm,age,wt,sal,comm    A++
 
 SM isa Emp
 
 Emp isa Person 
 
 ISA relationship
 
 
 
*/
// public class Constructor {
    
	// public static void main(String[] args) {
	
    //     switch(1)
	// 	{
	// 	case 1:
// 			Person p1=new Person();
// 			p1.setPerson("deepak", 21, 45);
// 			p1.dispPerson();
// 			break;
// 		case 2:
// 			Emp e1=new Emp();
// 			e1.setEmp("rohan", 21, 45, 85000);
//             e1.dispEmp();
// 			break;
// 		case 3:
// 			SM s1=new SM();
// 			s1.setSM("sohan", 21, 45, 85000, 1200);
// 			s1.dispSM();
// 			break;
// 		}
//     }
// }
//Base class or super class or parent class
//Drive class or sub class or child class.

// class Person{
// 	String strEname;
// 	int age;
// 	float wt;
// 	public void setPerson(String s,int a,float w)
// 	{
// 		strEname=s;
// 		age=a;
// 		wt=w;
		
// 	}
// 	public void dispPerson()
// 	{
// 		System.out.println(strEname+" "+ age+ " "+ wt);
//     	}
// }

// class Emp extends Person 
// {
// 	int sal;
// 	public void setEmp(String s,int a,float w, int sl )
// 	{
// 		super.setPerson(s, a, w);
		
// 		sal=sl;
// 	}
// 	public void dispEmp()
// 	{
// 		super.dispPerson();
// 		System.out.println(sal);
// 	}
// }


// class SM extends Emp
// {
// 	int comm;
// 	public void setSM(String s,int a,float w,int sl, int cm)
// 	{
// 		super.setEmp(s, a, w, sl);//to call function of base class , we use super keyword
// 		comm=cm;
// 	}
// 	public void dispSM()
	
//     {
// 		super.dispEmp();
// 		System.out.println(comm);
		
// 	}
// } 
   
// }


// public class Constructor {

// 	public static void main(String[] args) {
		
// 	//	Base b1=new Base();
// 		Derive d1=new Derive();
		
// 	}
// }


// class Base
// {
// 	public Base()
// 	{
// 		System.out.println("Base class cer called");
// 	}
// }

// class Derive extends Base
// {
// 	public Derive()
// 	{
// 		System.out.println("derive class cer called");
// 	}
// }



public class Constructor {

	public static void main(String[] args) {
		
		switch(2)
		{
		case 2:
			Emp e1=new Emp();
			e1.dispEmp();
			
			Emp e2=new Emp("saksham", 21, 45, 85000);
			e2.dispEmp();
			break;
		case 1:
			Person p1=new Person();
			Person p2=new Person("deepak",21,34);
			Person p3=new Person(p2);
			
			p1.dispPerson();
			p2.dispPerson();
			p3.dispPerson();
			break;
}
	}
}


class Person
{
	String strEname;
	int age;
	float wt;
	
public Person()
	{
		System.out.println("Person - Zero arg or default cer called ");
		age=0;
		strEname="abcd";
		wt=0;
	}
	public Person(String s,int a,float w)
	{
		System.out.println("Person - parameterise cer called");
		strEname=s;
		age=a;
		wt=w;
	}
public Person (Person p)
	{
		age=p.age;//p3.age=p2.age
		wt=p.wt;
		strEname=p.strEname;
		System.out.println("Person - copy cer called");
	}
	public void dispPerson()
	{
		System.out.println(strEname+" "+ age+ " "+ wt);
	}
}

class Emp extends Person
{
	int sal;
	public Emp()
	{
		super();//zero arg cer called Person
		sal=0;
		System.out.println("Emp - zero arg or default cer called");

	}
	public Emp(String s, int a,float w,int sl)
	{
		super(s, a, w);
		sal=sl;
		System.out.println("Emp - parameterise cer called");
	}
	
	
public void dispEmp()
	{
		super.dispPerson();
		System.out.println(sal);
	}
}