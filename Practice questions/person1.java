public class person1 {
    String name;
    int age;

    person1(String name, int age){
        this.name = name;
        this.age =age;
    }

public static class student extends person1{
    int studentId ;
    String course;

    student(String name, int age , int studentId , String course){
        super(name,age);
        this.studentId = studentId;
        this.course = course;
    }

    void displayInfo() {
        System.out.println("Students Details:"+"\n"
        + "Name : " +name +"\n"
        + "Age : " +age +"\n"
        + "Student Id : " +studentId +"\n"
        + "Course : " +course);
    };
}

public static void main(String[] args){
    student s1 = new student("Roshan " , 18 , 1001 ,"CSE");

    s1.displayInfo();
}
}
