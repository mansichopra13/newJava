package homework.innterface;

 // Interface can contain function declaration but not function defition
   // we can not create object of interface
                // we can create reference of interface
                // Person p1=new Person();//error

   // with the help of reference of interface we can call only those functions
                // which are declared inside interafce  


 // One class extends other class but incase of interface
// one class implements other interface

// The class which implements the interface has to define all the functions
// declared inside interface.

// one class can implement multiple interface
// But one class can not extends with multiple classes
// There is no concept of multiple inheritance in java
//                            
public class Inter {

    public static void main(String[] args) {
System.out.println("helloooooooooooo");
        System.out.println(Emp.e);

        switch (2) {
            case 1:
                SM s1 = new SM();
                s1.setPerson();
                s1.dispPerson();
                s1.setSM();
                s1.dispSM();
                s1.setEmp();
                s1.dispEmp();

                break;
            case 2:
                // we can not create object of interface
                // we can create reference of interface
                // Person p1=new Person();//error
                Person p1 = new SM();
                // with the help of reference of interface we can call only those functions
                // which are declared inside interafce
                p1.setPerson();
                p1.dispPerson();
                // p1.setSM();//errror
                break;
            case 3:
                Emp e1 = new SM();
                e1.setEmp();
                e1.dispEmp();

                break;
        }
    }

}


// public interface Emp {
//     public void setEmp();

//     public void dispEmp();
// }

// public interface Person {
//     // Interface can contain function declaration but not function defition
//     public void setPerson();

//     public void dispPerson();
// }

// public class SM implements Person, Emp {

//     public void setPerson() {
//         System.out.println("set person called");
//     }

//     public void dispPerson() {
//         System.out.println("Disp person called");
//     }

//     public void setSM() {
//         System.out.println("set sm called");
//     }

//     public void dispSM() {
//         System.out.println("disp sm called");
//     }

//     @Override
//     public void setEmp() {
//         // TODO Auto-generated method stub
//         System.out.println("set emp called");
//     }

//     @Override
//     public void dispEmp() {
//         // TODO Auto-generated method stub
//         System.out.println("dispemp called");
//     }
// }



