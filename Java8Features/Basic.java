package Java8Features;

import Java8Features.Employee;

// why java 8?
//1. concise and minimal code
//2. functional programming was missing so to utilise functions
//3. to enable parallel programming

// features- 
//lamda expression - kind of arrow function
//stream api - for do operations on bulk data and collections
//date and time api
//base 64 encode decode
//medthod reference and constructor reference - :: operator
//default methods in interface and static methods in interface
//functional interface- can have only one abstract method and can have any number of default and static methods
//optional class
//improvements in java input output
//collection api improvements





public class Basic {
    public static void main(String [] args)
    {
        // Employee emp= new SE();
        Employee emp= ()->"SOftware";
        System.out.println(emp.getName());
    }
}
