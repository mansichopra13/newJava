package Java8Features.lambda;
// import java.util.*;

// lambda expression is an anonymous function 
// no name , no return type , no modifier
// ### we can invoke lambda exp by using functional interface

// benefits
// 1 enable functional programming
// 2 makes code more readable , maintainable, concise
// 3 enable parallel processing
// 4 JAR file size reduction
// 5 Elimination of shadow variables 

interface FuncInterface{
    //An abstract function as it doesnt have ANY BODY
    void abstractFun(int x);

    default void normalFun(){
        System.out.println("Hello");
    }
}

class Test{
    public static void main (String [] args){
        //lambda exp to implement above functional interface
        FuncInterface fobj = (int x)->System.out.println(2*x);
        //this calls above lambda exp and prints
        fobj.abstractFun(5);
    }
}







