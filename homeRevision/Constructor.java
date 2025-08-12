package homeRevision;

public class Constructor {
    public static void main(String []args){

        switch(1){
            case 1:
            break;
        }
    }
}

class Person{
    String strEname;
    int age;
    float wt;

    public void setPerson(String s,int a,float w){
        strEname=s;
        age = a;
        wt=w;
    }
    public void dispPerson(){
        System.out.println(strEname+" "+age+" "+wt);
    }
}

class Emp extends Person{
    
}
