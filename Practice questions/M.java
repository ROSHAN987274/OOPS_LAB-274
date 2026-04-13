class EmployeeSalary {

    // Private array (data hiding)
    private int[] salary = new int[5];

    // Enter salaries
    public void setSalary(int[] s) {
        for (int i = 0; i < 5; i++) {
            salary[i] = s[i];
        }
    }

    // Display salaries
    public void displaySalary() {
        System.out.println("Employee Salaries:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ": " + salary[i]);
        }
    }

    // Find highest salary
    public void findHighest() {
        int max = salary[0];

        for (int i = 1; i < 5; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
        }

        System.out.println("Highest Salary: " + max);
    }
}

public class M {
    public static void main(String[] args) {

        EmployeeSalary e = new EmployeeSalary();

        int[] data = {30000, 45000, 25000, 60000, 40000};

        e.setSalary(data);
        e.displaySalary();
        e.findHighest();
    }
}