package Java8Features.lambda;

public class UsingThread  {
    public static void main(String [] args ){
        
        Runnable r = ()->{
           for(int i =0;i<=10 ; i++){
            System.out.println("hello"+i);
        } 
        };
        
        Thread t = new Thread(r);
        t.run();






        //old way
        // Thread t = new Thread(MyClass);
        // t.run();
        // for(int i =0;i<=10 ; i++){
        //     System.out.println("hello"+i);
        // }
    }
}


//old way
// public class MyClass implements Runnable{
//     public void run(){
//         for(int i =0;i<=10 ; i++){
//             System.out.println("hello"+i);
//         }
//     }
// }
