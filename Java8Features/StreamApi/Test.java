package Java8Features.StreamApi;
//Stream API is a way to express and process collections of objects.
// Enable us to perform operations like filtering, mapping, reducing, and sorting.
//promotes - readability ,flexibility, parallelism , encapsulation
// stream is a sequence of objects

//uses
// Data Processing
// For processing JSON/XML responses
// For database Operations
// Concurrent Processing

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
    public static void main(String [] args){
       //imperative approach
        int [] arr = {1,2,3,4,5};
       int sum =0;
       for(int i =0;i<arr.length ;i++){
        if(arr[i]%2==0){
            sum+=arr[i];
        }
       } 
       System.out.println(sum);

       //stream
       int [] arr2 ={1,2,3,4,5};
       int sum2=Arrays.stream(arr2).filter(x->x%2==0).sum();
       System.out.println(sum2);


       // how to make stream - just write list.stream
       List<String > list = Arrays.asList("apple","mango","banana");
       Stream<String> myStream =list.stream();
       
       //for array
       String [] array= {"apple","banana","mango"};
       Stream<String> newStream = Arrays.stream(array);
       
       // to make it directly
       Stream<Integer> inS=Stream.of(1,2,3,4,5);

       //we can iterate like we do in loops, if we dont apply limit then it run infinite times
       Stream<Integer> limit=Stream.iterate(0, n->n+1).limit(10);

       //to generate
       Stream<Integer> limit2= Stream.generate(()->(int)Math.random()*10).limit(10);

    //    ex2

    List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,4322,9,0,2,5,44,345,1,2,0);
    List<Integer> filteredList = mylist.stream()
                                .filter(x -> x % 2 == 0)
                                .map(x -> x/2)
                                .distinct()
                                .sorted((a,b) ->(b-a))
                                .limit(4)
                                .skip(1)
                                .collect(Collectors.toList());
           System.out.println(filteredList);   
    
           

    // ex3
    List<Integer> collect = Stream.iterate(0, x -> x+1)
                            .limit(101)
                            .skip(1)
                            .filter(x -> x%2==0)
                            .map(x ->x/10)
                            .distinct()
                            .sorted()
                            .peek(x ->System.out.println(x))
                            .collect(Collectors.toList());       
    

    //ex4
    Integer i= Stream.iterate(0, x -> x+1)
                    .limit(101)
                    .map(x ->x/20)
                    .distinct()
                    .peek(x->System.out.println(x))
                    .max((a,b) -> a-b)
                    .orElse(-1);
                    // .count();
                    //.min((a,b)->b-a)
        // System.out.println(i);
        System.out.println(i);
    }    
}
