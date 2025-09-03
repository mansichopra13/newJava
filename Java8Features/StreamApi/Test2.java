package Java8Features.StreamApi;

import java.util.stream.Stream;

public class Test2 {
     public static void main(String [] args){
        Integer i= Stream.iterate(0, x -> x+1)
                    .limit(101)
                    .map(x ->x/20)
                    .distinct()
                    .peek(x->System.out.println(x))
                    .max((a,b) -> a-b)
                    .orElse(-1);
                    // .count();
        // System.out.println(i);
        System.out.println(i);
     }
}
