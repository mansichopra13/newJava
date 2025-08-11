// package oops;

// //emp sm
// public class Inheri {
//     public static void main(String [] args){
//         switch(1){

//             case 1:
//            Person p1=new Person();
// 			// Person p2=new Person("deepak",21,34);
// 			// Person p3=new Person(p2);
//             p1.setPerson("anu", 15, 30);
// 			p1.dispPerson();
// 			// p2.dispPerson();
// 			// p3.dispPerson();
			
//             break;

//             case 2:Emp e1=new Emp();
// 			// e1.dispEmp();
// 			e1.setEmp("null", 0, 0, 0);
// 			// Emp e2=new Emp("saksham", 21, 45, 85000);
// 			e1.dispEmp();
			
//             break;

//             case 3:
//             break;
//         }
//     }
// }

//     class Person{
//         String name;
//         int age;
//         float wt;

//         public void setPerson(String n, int a , float w){
//             name=n;
//             age=a;
//             wt=w;
//         }

//         public void dispPerson(){
//             System.out.println(name +" "+age+" "+wt);
//         }
//     }

//     class Emp extends Person{
//         int sal;
//         public void setEmp(String n, int a , float w, int sl){
//             super.setPerson(n, a, w);
//             sal=sl;
//         }

//         public void dispEmp(){
//             super.dispPerson();
//             System.out.println(sal);
//         }
//     }

//     class SM extends Emp{
//         int comm;
//         public void setSM(String n, int a , float w, int sl,int c){
//             super.setEmp(n, a, w, sl);
//             comm=c;
//         }

//         public void dispSM(){
//             super.dispEmp();
//             System.out.println(comm);
//         }
//     }

//example 2
// class Vehicle {
//   protected String brand = "Ford";
//   public void honk() {
//     System.out.println("Tuut, tuut!");
//   }
// }

// class Car extends Vehicle {
//   private String modelName = "Mustang";
//   public static void main(String[] args) {
//     Car myFastCar = new Car();
//     myFastCar.honk();
//     System.out.println(myFastCar.brand + " " + myFastCar.modelName);
//   }
// }