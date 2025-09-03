package Java8Features.comparator;

import java.util.ArrayList;
import java.util.*;
// when we go to the comparator class in java then there would be a function named by compare 
// here we used it in collection sort after list 
//this shows that in a list we are comparing integers and sorting it in a respective order 

// public class Comparatorr {
//     public static void main (String []args){
//       List<Integer> list = new ArrayList<>();  
//       list.add(2);
//       list.add(6);
//       list.add(0);
//       list.add(99);
//       list.add(6);
//       Collections.sort(list,(a,b)->b-a);
//       System.out.println(list);
//     }
// }

// example 2

//define it in separate file
public class Student{
    public Integer id;
    public String name;

    public Student (Integer id , String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return this.id+": "+this.name;
    }
}

public class Comparatorr{
    public static void main (String [] args){
        Student s1=new Student(2,"Vipul");
        Student s2=new Student(3,"raj");
        Student s3=new Student(33,"Vipin");

        List<Student> li= new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        Collections.sort(li,(a,b)->b.id-a.id);
        System.out.println(li);
    }
}