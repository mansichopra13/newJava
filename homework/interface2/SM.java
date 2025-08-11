package homework.interface2;

//One class extends other class but incase of interface
//one class implements other interface

//The class which implements the interface has to define all the functions declared inside interface.

//one class can implement multiple interface
//But one class can not extends with multiple classes
//There is no concept of multiple inheritance in java 
//
public class SM  implements Emp
{

	public void setPerson()
	{
		System.out.println("set person called");
	}
	public void dispPerson()
	{
		System.out.println("Disp person called");
	}
	public void setSM()
	{
		System.out.println("set sm called");
	}
	public void dispSM()
	{
		System.out.println("disp sm called");
	}
	@Override
	public void setEmp() {
		// TODO Auto-generated method stub
		System.out.println("set emp called");
	}
	@Override
	public void dispEmp() {
		// TODO Auto-generated method stub
		System.out.println("dispemp called");
	}
}

