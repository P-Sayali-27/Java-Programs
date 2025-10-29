package Methods;

//Non static without parameter method
public class MethodWithoutParams1
{

    //Create a method printName() that prints your name.
 /*void printName() //Non-static method
 {
     System.out.println("Sayali Patil");
 }
 public static void main(String[] args){
     MethodWithoutParams1 obj = new MethodWithoutParams1(); //creating object
     obj.printName();
 }*/
 //Create a non-static method wishLuck() that prints "Best of luck for your journey!".

 /*   void wishLuck()//Non-static method
    {
        System.out.println(" Best of Luck for your Journey !");
    }

public static void main(String[] args)
{
    MethodWithoutParams1 obj1 = new MethodWithoutParams1();
            obj1.wishLuck();
}
*/
   // Create a method printStars() that prints 5 stars ***** in one line.
void printStars()
{
    System.out.println("*****");
}
public static void main(String[] args)
{
    MethodWithoutParams1 obj2 = new MethodWithoutParams1();//creating a object
    obj2.printStars();     //calling method

}
}
