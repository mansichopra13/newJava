package Java8Features.lambda;

// lambda vs anonymous class 
// in the below example we are writing anonymous class as two abstract methods are needed to implementthrough an interface
//lambda exp is used with only functional interface



//define this in separate file
// public interface Employee{
//     String getSalary();
//     String Designation();
// }

// public class lambdaVSAnon {
//     public static void main (String []args){
//         Employee emp = new Employee(){

//             public String getSalary(){
//                 return "100";
//             }

//             public String getDesignation(){
//                 return "se";
//             }
//         };
//         System.out.println(emp.getSalary());
//     }
// }


// example 2
public class lambdaVSAnon{
    //instance  variable work with lambda
    // int a=2;

    // public static void main(String [] args){
    //     doSomething();
    // }
    private void doSomething(){
        // still local variable can't be changed in lambda as variables used in lambda are final
        //int a =2;
        Employee emp  = () -> {
            //variable used in lambda should be final
            // a=3;
            // int x=10;
            //here we cant access with this keyword as it is a function not a class
            // System.out.println(this.x);
            return "100";        
        };
        // System.out.println(emp.getSalary());

        //anonymous class
        Employee emp1 = new Employee() {
            //instance variable as it is in a class
            int x=10;

            public String getSalary(){
                //so we can access it with this keyword
                System.out.println(this.x);
                return "100";
            }
        };
    }
}
