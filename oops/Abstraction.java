
public class Abstraction{
    public static void main(String [] args)
    {
       /*  Horse h= new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);*/
        Mustang myHorse=new Mustang();
        
    }
}
    abstract class Animal {
        String color;
        //why animal constructor is not called
        Animal()//check why color is not brown
        {
            //color = "brown";
            System.out.println("animal constructor called");
        }
        void eat()//non abstractt method
        {
            System.out.println("Animal eats");
        }

        abstract void walk();//abstract method dont have it implementation
    }

    class Horse extends Animal{
        Horse(){
            System.out.println("horse called");
        }
        void changeColor(){
            color="white";
        }
        void walk(){
            System.out.println("walks on 4 legs");
        }
    }
    class Mustang extends Horse
    {
        Mustang(){
            System.out.println("mustang called");
        }
    }
    class Chicken extends Animal{
        void changeColor(){
            color="yellow";
        }
        void walk() {
            System.out.println("walks on 2 legs");
        }
    }
