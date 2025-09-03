package Java8Features.Predicate;

import java.util.function.BiPredicate;

//bipredicate
public class Bi {
    public static void main ( String [] args){
        BiPredicate<Integer,Integer> bi = (x,y) -> x%2==0 && y%2==0;
        System.out.println(bi.test(5, 2));
    }
}
