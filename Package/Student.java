package student;

public class Student {
    public int grade;
    public String name;

    public void setGrade(int g) {
        grade = g;
    }

    public void setName(String n) {
        name = n;
    }

    public void info() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}