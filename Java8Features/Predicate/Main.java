package Java8Features.Predicate;
import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;

//predicate is a boolean valued functional interface - checks condition and return true or false
//simply it holds a condition

/*Methods available with Predicate:
test(T t):
The core abstract method that evaluates the condition and returns a boolean.

and(Predicate<? super T> other):
Returns a composed predicate that represents a logical AND of this predicate and another. Both predicates must evaluate to true for the combined predicate to be true.

or(Predicate<? super T> other):
Returns a composed predicate that represents a logical OR of this predicate and another. If either predicate evaluates to true, the combined predicate is true.

negate():
Returns a predicate that represents the logical negation (inverse) of this predicate. If the original predicate returns true, the negated one returns false, and vice-versa. 

isEqual(Object targetRef) (static):
Returns a predicate that tests for equality with a given target object using Objects.equals().  */

public class Main {
    public static void main(String []args){
        Predicate<Integer> predicate= x-> x>100000;
        

        System.out.println(predicate.test(1));

        // // example2
        Predicate <Integer> isEven = e ->e%2==0;
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(Integer i : numbers){
            if(isEven.test(i)){
                System.out.println(i);
            }
        }
        // int sum = numbers.stream().filter(n -> n%2 == 0).mapToInt(n -> n).sum();
    
        // ex3 using predicate function 'and'
        Predicate <String> startWithM= m ->m.toLowerCase().charAt(0)=='m'; 
        // System.out.println(startWithM.test("mansi"));
        Predicate <String> endsWithI= m ->m.toLowerCase().charAt(m.length()-1)=='i';
        
        Predicate <String> and = startWithM.and(endsWithI); 
        // System.out.println(and.test("mansi"));

        //same for the 'or' predicate but here only one thing needs to be true to get true
        Predicate <String> or = startWithM.or(endsWithI);
         // System.out.println(or.test("mansi"));

        // ' predicate negate is for inverse like t -> f , f ->t'
        System.out.println(startWithM.negate().test("mansi")); 

        Predicate <Object> pred=Predicate.isEqual(2);
        System.out.println(pred.test(3));

        
        
       

    }
}
