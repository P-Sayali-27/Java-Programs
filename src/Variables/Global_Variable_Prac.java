package Variables;

public class Global_Variable_Prac {
/* //Example 1 - Printing Instance variable
    int a = 10;    // Initialization and Declaration -Global variable (instance variable)

    public static void main(String[] args) {
        // To access the global variable, we need an object
        Global_Variable_Prac obj = new Global_Variable_Prac();//className object = new className();

        System.out.println(obj.a); //// accessing global variable
    }
 */

    //Example 2 - Global variable using Method

    static String message;
    static int a;
    static int b;

    public static void display(){
        message = "printong message by creating global variable";

        System.out.println(message);
    }

    public static void addition(){

        a = 10;
        b = 20;
        int sum = a + b;

        System.out.println("Sum of a + b is: " + sum);
    }

    //creating a main method to call both the fuctions
    public static void main(String[] args) {
        //calling by class name
        Global_Variable_Prac.display();
        Global_Variable_Prac.addition();
        //calling directly by function name
        display();
        addition();

    }
}
