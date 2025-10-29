package Methods;

public class NonStaticmethod {
    // NonStaticmethod: Greet a user
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        NonStaticmethod obj = new NonStaticmethod();

        // Call the non-static method using the object
        obj.greet("Sayali");
    }
}
