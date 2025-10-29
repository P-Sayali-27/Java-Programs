package Methods;

public class MethodWithoutParams1A {


    //creating multiple method and calling in a single main function

    void printName(){                                   //Method 1
        System.out.println("Sayali Patil");
    }
    void printWishLuck(){                               //Method 2
        System.out.println("All the best!");
    }
    void printStars(){                                  //Method 3
        System.out.println("*****");
    }
    /*public static void main(String[] args) //Creating Multiple object to call multiple object in a main methode
    {
        MethodWithoutParams1A obj1 = new MethodWithoutParams1A();  //Creating object 1
        obj1.printName();                                          //Calling Method 1

        MethodWithoutParams1A obj2 = new MethodWithoutParams1A();  //Creating object 2
        obj2.printWishLuck();                                      //Calling Method 2

        MethodWithoutParams1A obj3 = new MethodWithoutParams1A();  //Creating object 3
        obj3.printStars();                                         //Calling Method 3
    }
     */

public static void main(String[] args)//creating single object and calling Multiple objects
{
    MethodWithoutParams1A obj = new MethodWithoutParams1A();//Creating Object
    obj.printStars();  //Calling method
    obj.printName();  //Calling method
    obj.printWishLuck(); //Calling method
}
}