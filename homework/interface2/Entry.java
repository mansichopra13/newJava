package homework.interface2;

//INTERFACE RESTRICTS VISIBILITY
public class Entry {

	public static void main(String[] args) {
		
		switch(3)
		{
		case 1:
			SM s1=new SM();	
			s1.setPerson();s1.dispPerson();s1.setSM();s1.dispSM();
			s1.setEmp();s1.dispEmp();
			
			break;
		case 2:
			//we can not create object of interface
			//we can create reference of interface
//			Person p1=new Person();//error 
			Person p1=new SM();
			//with the help of reference of interface we can call only those functions which are declared inside interafce
			p1.setPerson();
			p1.dispPerson();
//			p1.setSM();//errror 
			break;
		case 3:
			Emp e1=new SM();
			e1.setEmp();
			e1.dispEmp();
			e1.setPerson();
			e1.dispPerson();
			
			break;
		}
	}
}



