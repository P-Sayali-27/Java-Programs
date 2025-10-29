package Keywords;

public class Employee {

    String name;
    int id;

    // Constructor using 'this' keyword
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + this.name); // Using 'this' to refer current object
        System.out.println("Employee ID: " + this.id);
        this.showMessage(); // Calling another method using 'this'
    }

    // Method to be called
    void showMessage() {
        System.out.println("Welcome to the company!");
    }
    Employee() {
        this("Default Name", 0); // Calls parameterized constructor
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Sayali", 101);
        emp1.displayDetails();

    }
}
