public class Inheritance
{
    public static void main(String [] args)
    {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby= new Dog();
        dobby.eat();
    }
}
// base class
class Animal{
    String color;
    
     void eat()
     {
        System.out.println("eats");
     }
     void breathe()
     {
        System.out.println("breathes");
     }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
//derived class
class Fish extends Animal{
    int fins;

    void swim()
    {
        System.out.println("swims in water");
    }
}
