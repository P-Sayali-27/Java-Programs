package Methods;

public class SaticMethod {
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Main method
    public static void main(String[] args) {
        // Calling the static method without creating an object
        int result = multiply(5, 4);

        System.out.println("Multiplication result: " + result);
    }
}
