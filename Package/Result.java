package result;
import student.Student;

public class Result {

    public void info( Student s){
        if( s.grade >= 90){
        System.out.println("Excellent grades.");
        }else{
            System.out.println("Good! Try harder");
        }
    }
}

