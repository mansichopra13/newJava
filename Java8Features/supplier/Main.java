package Java8Features.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String [] args){
        Supplier<Integer> supplier= ()->1;
        System.out.println(supplier.get());
    }
}
