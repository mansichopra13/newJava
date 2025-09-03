package Java8Features;

//contain complete definition of function
//cannot be overridden or changed in implementation class as they cannot find it


interface A{
    static void sayHello(){
        System.out.println("hello");
    }
}
public class StaticMethod implements A{
    public static void main (String []args){
        StaticMethod sm = new StaticMethod();
        // static interface method cannot be called like this
        // sm.sayHello();
        // StaticMethod.sayHello();

        A.sayHello();//only way to call static methods of interface -> interfacename.functionname


    }
}
