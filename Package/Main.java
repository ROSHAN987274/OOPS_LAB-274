import student.Student;
import result.Result;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Roshan Chaurasiya");
        s.setGrade(99);

        s.info();

        Result r = new Result();
        r.info(s);
    }
}