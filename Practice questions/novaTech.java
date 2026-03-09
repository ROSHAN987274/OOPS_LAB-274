public class novaTech {
    String name;
    int employeeId;
    double baseSalary;
    
    novaTech(String name , int employeeId, double baseSalary){
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }
// teamleader
static class employee extends novaTech{
    int teamSize;
    double bonous;

    employee(String name , int employeeId, double baseSalary,int teamSize , double bonous){
        super(name,employeeId,baseSalary);
        this.teamSize = teamSize;
        this.bonous = bonous;
    }
}

// Project manager
static class projectManager extends employee{
    String projectName ;
    double projectBudget;

    projectManager(String name , int employeeId, double baseSalary,int teamSize , double bonous,String projectName, double projectBudget){
        super(name,employeeId,baseSalary,teamSize,bonous);
        this.projectName = projectName;
        this.projectBudget = projectBudget;

    }
        void  displayInfo(){
         System.out.println("Personal Info:"+"\n"
            +"Name = " + name +"\n"
            +"Employee Id = " + employeeId+"\n"
            +"Base Salary = " + baseSalary +"\n" +"\n"
            +"Team Info:" +"\n"
            +"Team Size = " +teamSize +"\n"
            +"Bonous = " + bonous+"\n"+"\n"
            + " Project Info:"+"\n"+"\n"
            +"Project Name = " + projectName+"\n"
            +"Project Budget = "+projectBudget+"\n"
         );
    }
}

public static void main(String[] args){
    projectManager p = new projectManager("Roshan",110,999.999,4,1000,"Project",10000);
    p.displayInfo();
}
}
