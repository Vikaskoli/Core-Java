package OOPs.abstraction;

// Abstract class
abstract class Payment {
    // Abstract method
    abstract void processPayment(double amount);

    // Concrete method
    void printReceipt() {
        System.out.println("Receipt printed.");
    }
}

// Subclass implementing abstract methods
class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Another subclass implementing abstract methods
class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        // Using abstract class references for polymorphism
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        payment1.processPayment(100.0); // Output: Processing credit card payment of $100.0
        payment1.printReceipt();        // Output: Receipt printed.

        payment2.processPayment(150.0); // Output: Processing PayPal payment of $150.0
        payment2.printReceipt();        // Output: Receipt printed.
    }
}
