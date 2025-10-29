package UtilityProgram;

public class Functions {

    //static Methode with parameter and return Type
   public static int add(int a, int b)
   {
       return a + b;
   }

   //Non-static methode with no parameters and no return type

    void printMessage()
    {
        System.out.println("Hello! This is a non-static method with no parameters and no return type.");
    }

    //Main Method
    public static void main(String[] args)
    {
        // Calling  Function add()
       int  result = add(10, 20);
       System.out.println("Addition result: " + result);

       //calling function printMessage()
        Functions obj = new Functions();   //Creating Object
        obj.printMessage();                //Calling the function using Object

    }
}
