package Methods;

public class MethodWithParams {
//Methode With One parameter
    void greet(String name)  //creating method with parameter
    {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args){

        MethodWithParams obj  = new MethodWithParams();//creating object
        obj.greet("Sayali Patil");      //calling function using object by giving argument
    }

}
