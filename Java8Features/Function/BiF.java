package Java8Features.Function;

import java.util.function.BiFunction;

public class BiF {
    public static void main(String [] args){
        BiFunction <String,String,Integer> bi =(x,y) -> x.length() +y.length();
        System.out.println(bi.apply("hi","hello"));
    }
    
}
