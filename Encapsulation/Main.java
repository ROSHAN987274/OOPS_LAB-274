interface Payment {
    void processPayment(double amount);
}

class CreditCard implements Payment {

    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {

    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Main {
    public static void main(String[] args) {

        double[] amounts = {1000, 2000, 1500};

        Payment p;

        // Using Credit Card
        System.out.println("Credit Card Payments:");
        p = new CreditCard();
        for (double amt : amounts) {
            p.processPayment(amt);
        }

        // Using UPI
        System.out.println("\nUPI Payments:");
        p = new UPI();
        for (double amt : amounts) {
            p.processPayment(amt);
        }
    }
}