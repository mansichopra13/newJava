package Java8Features.Function;
//apply usage
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Function;
//Function interface will perform given task 
//Function<T,R>
//T: denotes the type of the input argument
//R: denotes the return type of the function

//4 methods of it are 
// apply()
// andThen()
// compose()
// identity()

public class Main {
    public static void main(String [] args){
        Function <String,Integer> getLength = x -> x.length();
        System.out.println(getLength.apply("mansi"));
        
        Function <String,String> function2 = s -> s.substring(0,3);
        
        Function <List<Student>,List<Student>> studentsWithManAsPrefix = li->{
            List<Student> result = new ArrayList<>();
            for(Student s : li){
                if(function2.apply(s.getName()).equalsIgnoreCase("man")){
                    result.add(s);
                }
            }
            return result;
        };
        Student s1 = new Student(2,"Vipul");
        Student s2 = new Student(2,"Manan");
        Student s3 = new Student(2,"mansi");
        List<Student> students = Arrays.asList(s1,s2,s3);
        List<Student> filteredStudents = studentsWithManAsPrefix.apply(students);
        System.out.println(filteredStudents);

    }

    private static class Student{
         @Override
        public String toString() {
            return "Student [id=" + id + 
            ", name=" + name + "
            ]";
        }
         private int id;
         private String name;

         public Student(int id, String name) {
            this.id = id;
            this.name = name;
         }
         public int getId() {
             return id;
         }
         public void setId(int id) {
             this.id = id;
         }
         public String getName() {
             return name;
         }
         public void setName(String name) {
             this.name = name;
         }

    }
}
