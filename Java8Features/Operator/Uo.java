package Java8Features.Operator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Uo {
    public static void main (String [] args){
        UnaryOperator<Integer> uo =x->x*x;
        System.out.println(uo.apply(5));

        BinaryOperator<String> bo= (x,y) -> x+y;
        System.out.println(bo.apply("hello", "mannu")); 
    }
}
