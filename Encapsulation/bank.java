class BankAccount{
    private double balance =10000 ;


    public void deposit(double amt){
        balance += amt;
        System.out.println("The amt desposited is:"+amt +"The new balance is :"+balance);
    }
    public void withdraw(double amt){
        if(amt <= balance){
            balance -= amt;
            System.out.println("The amt withdrawn is: "+ amt + "The new balance is :"+balance);
        }
    }

    public void checkBalance(){
        System.out.println("The available balance is:"+ balance);
    }
}

public class bank{
    public static void main(String[]args){
        BankAccount a = new BankAccount();

        a.deposit(20000);
        a.withdraw(5000);
        a.checkBalance();
    }
}