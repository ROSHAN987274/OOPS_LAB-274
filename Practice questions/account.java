public class account {
    double balance;

    account(double balance){
        this.balance = balance;
    }
    
    void deposit( double amt){
        balance += amt;
        System.out.println("deposited amt= "+amt);
        System.out.println("new balance = "+balance);
    }

    void withdraw( double amt){
        if( amt > balance){
            System.out.println("Insuffiecient balance");
        } else {
            balance -= amt;
            System.out.println("Withdrawn amt = "+amt);
            System.out.println("New balance ="+balance);
        }
    }
    

 static class saving extends account{
    
    saving( double balance){
        super(balance);
    }
    @Override
    void withdraw ( double amt){
        if ( amt > balance ){
            System.out.println("Insufficient amount");
        } else {
            balance -=amt ;
            System.out.println("Withdrawn amt = " + amt);
            System.out.println("new balance = " +balance);
        }
    }
}

static class current extends account{
    int overdraftLimit;
    current( double balance , int overdraftLimit){
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    void withdraw ( double amt){
        if ( amt > balance + overdraftLimit ){
            System.out.println("Insufficient amount");
        } else {
            balance = balance - amt  ;
            System.out.println("Withdrawn amt = " + amt);
            System.out.println("new balance = " +balance);
        }
    }
}


    public static void main (String[] args){
        saving s = new saving(10000);
        current  c = new current(100000, 1000);
        
        s.withdraw(1000);
        c.withdraw(10000);
        s.deposit(10000);
        c.deposit(1000);
    }
}
