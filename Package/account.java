package bank;

public class account{

    private void privateClass(){
        System.out.println("This is the private class can't be accesible.");
    }
    
    protected void protectedClass(){
        System.out.println("This is the protected class.");
    }

    public void publicClass(){
        System.out.println("This is the Public Class.");
    }
}