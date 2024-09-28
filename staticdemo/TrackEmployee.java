package staticdemo;

class Employee {
    private int id;
    private String name;
    // Static variable to keep track of total employees
    private static int totalEmployees = 0;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        totalEmployees++; // Increment total employees when a new employee is created
    }

    // Static method to access the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Alice");
        Employee e2 = new Employee(2, "Bob");
        Employee e3 = new Employee(3, "Charlie");

        // Accessing static method without creating an instance
        System.out.println("Total Employees: " + Employee.getTotalEmployees()); // Output: Total Employees: 3
    }
}

