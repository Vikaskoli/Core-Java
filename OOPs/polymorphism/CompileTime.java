package OOPs.polymorphism;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 and 3: " + calc.add(2, 3)); // Calls the first add method
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3)); // Calls the second add method
        System.out.println("Sum of 1.5 and 2.5: " + calc.add(1.5, 2.5)); // Calls the third add method
    }
}

