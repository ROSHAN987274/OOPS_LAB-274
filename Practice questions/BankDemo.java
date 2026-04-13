class InsufficentBalance extends Exception{
    public InsufficentBalance(String message){
        super(message);
    }
}

class Bank{
    double balance;

    Bank(double balance){
    this.balance =balance;
    }

   public void withdraw(double amt) throws InsufficentBalance{
          if(amt> balance){
            throw new InsufficentBalance("Invalid transcation.");
          }else{
            balance-=amt;
            System.out.println("Successful transcation.");
            System.out.println("New balance: "+ balance);
          }
    }
}

public class BankDemo{
    public static void main(String[] args){
        Bank a = new Bank(5000);
        
        try{
            a.withdraw(2000);
            a.withdraw(4000);
        }catch(InsufficentBalance e){
            System.out.println("Exception caught:" + e.getMessage());
        }
    
    }
}
