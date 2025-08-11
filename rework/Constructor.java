package rework;

//one
public class Constructor {
    public static void main(String[] args) {
        switch (2) {
            case 1:
                Person p1 = new Person();
                p1.setPerson("Mannu", 25, 60);
                p1.dispPerson();

                break;

            case 2:
                Emp e1 = new Emp();
                e1.setEmp("knnu", 15, 30, 55000);
                e1.dispEmp();
                break;

            case 3:
                SM s1 = new SM();
                s1.setSM("piki", 20, 40, 60000, 1500);
                s1.dispSM();
                break;

            default:
                System.out.println("wrong input");
                break;
        }
    }
}

class Person {
    String name;
    int age, weight;

    public void setPerson(String n, int a, int w) {
        name = n;
        age = a;
        weight = w;
    }

    public void dispPerson() {
        System.out.println(name + " " + age + " " + weight);
    }
}

class Emp extends Person {
    int sal;

    public void setEmp(String n, int a, int w, int sl) {
        super.setPerson(n, a, w);
        sal = sl;
    }

    public void dispEmp() {
        super.dispPerson();
        System.out.println(sal);
    }
}

class SM extends Emp {
    int cm;

    public void setSM(String n, int a, int w, int sl, int c) {
        super.setEmp(n, a, w, sl);
        cm = c;

    }

    public void dispSM() {
        super.dispEmp();
        System.out.println(cm);
    }
}

// two
// public class Constructor {

// public static void main(String[] args) {

// // Base b1=new Base();
// Derive d1=new Derive();

// }
// }

// class Base
// {
// public Base()
// {
// System.out.println("Base class cer called");
// }
// }

// class Derive extends Base
// {
// public Derive()
// {
// System.out.println("derive class cer called");
// }
// }

// three
// public class Constructor {

// public static void main(String[] args) {

// switch(2)
// {
// case 2:
// Emp e1=new Emp();
// e1.dispEmp();

// Emp e2=new Emp("saksham", 21, 45, 85000);
// e2.dispEmp();
// break;
// case 1:
// Person p1=new Person();
// Person p2=new Person("deepak",21,34);
// Person p3=new Person(p2);

// p1.dispPerson();
// p2.dispPerson();
// p3.dispPerson();
// break;
// }
// }
// }

// class Person
// {
// String strEname;
// int age;
// float wt;

// public Person()
// {
// System.out.println("Person - Zero arg or default cer called ");
// age=0;
// strEname="abcd";
// wt=0;
// }
// public Person(String s,int a,float w)
// {
// System.out.println("Person - parameterise cer called");
// strEname=s;
// age=a;
// wt=w;
// }
// public Person (Person p)
// {
// age=p.age;//p3.age=p2.age
// wt=p.wt;
// strEname=p.strEname;
// System.out.println("Person - copy cer called");
// }
// public void dispPerson()
// {
// System.out.println(strEname+" "+ age+ " "+ wt);
// }
// }

// class Emp extends Person
// {
// int sal;
// public Emp()
// {
// super();//zero arg cer called Person
// sal=0;
// System.out.println("Emp - zero arg or default cer called");

// }
// public Emp(String s, int a,float w,int sl)
// {
// super(s, a, w);
// sal=sl;
// System.out.println("Emp - parameterise cer called");
// }

// public void dispEmp()
// {
// super.dispPerson();
// System.out.println(sal);
// }
// }