package Java8Features.consumer;

import java.util.function.BiConsumer;

//biconsumer
public class BiC {
    public static void main (String [] args){
        BiConsumer <Integer,Integer> bi = (x,y)->System.out.println(x+y);
        bi.accept(5, 2);
    }
}
