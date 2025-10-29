package Methods;

import java.util.Stack;

public class MethodWithoutParams2 {

    // Create a static method greetMorning() that prints "Good Morning!".

 /*static  void greetMorning()                            //Creating a static method
 {
        System.out.println("Good Morning!");
    }

    public static void main(String[] args){
        greetMorning();                                       //calling a method without creating object

        //Calling Method by creating object
        MethodWithoutParams2 obj = new MethodWithoutParams2(); //Creating object
        obj.greetMorning();                                    //Calling Method

        //Calling function using class name
        MethodWithoutParams2.greetMorning();
    }
*/
//Create a static method displayLine() that prints a line of dashes like --------------.

static void displayLine(){
    System.out.println("-----------------------------------------------------------------------");
}

public static void main(String[] args){
    //calling function by creating object
    MethodWithoutParams2 obj = new MethodWithoutParams2(); //creating object
    obj.displayLine();                                      //calling function

    //calling function without object
    displayLine();

    //calling function using class name
    MethodWithoutParams2.displayLine();

}
}
