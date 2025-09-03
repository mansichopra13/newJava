package Java8Features.methodReferences;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;

//method reference - ::
//it allow us to refer to  a method without invoking it
//can replace lambda when they only calls to existing method


public class Mr {

    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String []args){
        List<String> students = Arrays.asList("mannu","bob","ani");
        students.forEach(Mr::print); 

        // ex2
        // List<Student>st =students.stream().map(x -> new Student(x)).collect(Collectors.toList());
        //we can write above line as a 
        List<Student> st=students.stream().map(Student::new).collect(Collectors.toList());
    }
}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
