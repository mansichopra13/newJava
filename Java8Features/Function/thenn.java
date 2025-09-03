package Java8Features.Function;
//usage of andThen, compose, identity

import java.util.function.Function;

public class thenn {
    public static void main (String []args){
        Function<String, String> func1 = s -> s.toUpperCase();
        Function<String , String > func2 = s -> s.substring(0,3);
        
        Function<String,String > stringStringFunction  =func1.andThen(func2);
        System.out.println(stringStringFunction.apply("Vipul"));

        // or we can write directly ####
        System.out.println(func1.andThen(func2).apply("mansi"));

        // ex2
        Function<Integer,Integer> function1=x ->2*x;
        Function<Integer,Integer> function2=x ->x*x*x;

        System.out.println(function1.andThen(function2).apply(5)); //1000
        System.out.println(function2.andThen(function1).apply(5)); //250
        // or
        System.out.println(function1.compose(function2).apply(5)); //250

        Function<String,String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("null"));
    
    }
}
