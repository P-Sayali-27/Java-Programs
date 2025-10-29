package Methods;

public class MethodWithParam1 {

    // Method: printMessage(String msg), Prints the message passed to it. Example: "Hello, Java!"
 /* static void printMessage(String msg)
 {
     System.out.println(msg);
 }
public static void main(String[] args)
{
    //calling without using object
    printMessage("Hello, Java!"); //Calling static function with parameter

    //Calling function using class name
    MethodWithParam1.printMessage("Hello, Java!");

    //calling function by object
    MethodWithParam1 obj = new MethodWithParam1();//creating object
    obj.printMessage("Hello, Java!");        //calling function
}
 */


   //Method: add(int a, int b), Adds two numbers and prints the result. Example: add(5, 10) → Sum is: 15

/* static void addNumbers(int a, int b) //creating static method by providing two parameters
{
   int sum = a + b;
    System.out.println("Sum of a and b is : " + sum);
}
public static void main(String[] args)
{
    //calling function directly by method name
    addNumbers(4, 4);

    //calling function by using class name
    MethodWithParam1.addNumbers(8, 10);

    //calling function by object
    MethodWithParam1 obj = new MethodWithParam1(); //creating object
    obj. addNumbers(1567, 7899);
}
*/


    //Method: greet(String name), Greets the user with their name. Example: "Welcome, Sayali!"

/*static void printGreetings(String greet) //creating method with parameter
{
    System.out.println(greet);
}
   public static void main(String[] args){
       //calling function directly by method name
       printGreetings("Welcome,");
       printGreetings("Sayali!");

       //calling function by using class name
       MethodWithParam1.printGreetings("Welcome,");
       MethodWithParam1.printGreetings("Sayali!");

       //calling function by object
       MethodWithParam1 obj = new MethodWithParam1(); //creating object
       obj. printGreetings("Welcome,");
       obj. printGreetings("Sayali!");
   }
*/


    //
}
