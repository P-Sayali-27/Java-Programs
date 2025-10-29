package Methods;
//calling multiple methode in a single mail methode
// Create a static method greetMorning() that prints "Good Morning!".
//Create a static method displayLine() that prints a line of dashes like --------------.

public class MethodWithoutParams2A {

static void greetMorning()
{
    System.out.println("Good Morning!");
}
    static void displayLine()
    {
        System.out.println("--------------- ");
        System.out.println("################ ");
        System.out.println("@@@@@@@$$$$$$$$$$$");
        System.out.println("   ");
    }

public static void main(String[] args){
    //calling without object
    greetMorning();
    displayLine();

    //calling using object
    MethodWithoutParams2A obj = new MethodWithoutParams2A();// Creating object
    obj.greetMorning();                                     //calling function
    obj. displayLine();                                     //calling function

    //calling function using class name
    MethodWithoutParams2A.greetMorning();
    MethodWithoutParams2A.displayLine();

}
}
