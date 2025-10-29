package Variables;

public class Local_vs_Instance_vs_GlobalVar {


    // Instance variable (belongs to object)
    int instanceVar = 50;

    // Global variable (static → belongs to class)
    static int globalVar = 100;

    public static void main(String[] args) {
        // Local variable (belongs to main method only)
        int localVar = 10;

        // Create object to access instance variable
        Local_vs_Instance_vs_GlobalVar obj = new Local_vs_Instance_vs_GlobalVar();

        // Accessing variables
        System.out.println("Local Variable: " + localVar);       // no object needed
        System.out.println("Instance Variable: " + obj.instanceVar); // object needed
        System.out.println("Global Variable: " + globalVar);     // no object needed
    }
}
