public class Bank {

    private int accNo;
    protected double balance;
    protected String name;

    public static final double i = 7.5;

    Bank(int accNo , double balance , String name){
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
    }

    public int getAccountNumber (){
        return accNo;
    }

    public double getBalance(){
        return balance;
    }

    void deposit(double amt){
        balance += amt;
    }

    void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double calculateInterest(){
        return balance*(i/100);
    }

    void displayInfo(){
        System.out.println("User Info:");
        System.out.println("Name = " + name);
        System.out.println("Acc No = " + accNo);
        System.out.println("Balance = " + balance);
        System.out.println("Interest Rate = " + i);
    }



static class savingAccount extends Bank {

    savingAccount(int accNo , double balance , String name){
        super(accNo , balance , name);
    }

    @Override
    public double calculateInterest(){
        return balance*(i/100)*1.1;
    }
}


static class CurrentAccount extends Bank {

    CurrentAccount(int accNo, double balance, String name){
        super(accNo , balance, name);
    }
}




    public static void main(String[] args){

        savingAccount sa = new savingAccount(10,1000,"Roshan");
        CurrentAccount ca = new CurrentAccount(100,1000.10,"Anuj");

        sa.deposit(10);
        ca.withdraw(100);

        sa.displayInfo();
        System.out.println("Savings Interest: " + sa.calculateInterest());

        System.out.println("----------------------------");

        ca.displayInfo();
        System.out.println("Current Interest: " + ca.calculateInterest());
    }
}