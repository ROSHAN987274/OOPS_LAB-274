package bankingApp;
import bank.account;

public class output extends account{
    public static void main(String[] args){
           output a = new output();
        // a.privateClass(); this is not accessible since it is a private class 
        a.publicClass();
        a.protectedClass();
    }
}