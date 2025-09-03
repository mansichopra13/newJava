package Java8Features;

// @FunctionalInterface // give err if someone add extra abstract method in this interface

//  interface Parent{
//     public void sayHello();
//     // public void sayHel(); // this will give err as only one abstract method is allowed

//     //default function
//     default void sayHey(){
//         System.out.println("hii");
//     }
// }

// class Child implements Parent{
//     public void sayHello(){
//         System.out.println("Hello");
//     }
//     public void sayHey(){
//         System.out.println("child says hiii");
//     }
// }

// public class DefaultMethod{
//     public static void main (String [] args){
//         Child c = new Child();
//         c.sayHello();
//         c.sayHey();
//     }
   
// }
interface A{
    default void sayhello(){
        System.out.println("A says hello");
    }
}

interface B{
    default void sayhello(){
        System.out.println("B says hello");
    }
}

public class DefaultMethod implements A, B{
    public static void main (String []args){
        DefaultMethod gg= new DefaultMethod();
        gg.sayhello();  //here compiler confuses between which function to execute

    }
    public void sayhello(){
        //
        A.super.sayhello();
        // or
        B.super.sayhello();
        // or
        System.out.println("my own implementation");
    }
}
