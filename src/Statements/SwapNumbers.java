package Statements;

public class SwapNumbers {

    public static void main(String[] args)
//Swap number without using third variable
    {
        int a = 1;
        int b = 2;

        a = a+b;  //a=3
        b = a-b;  //b=1
        a= a-b;    //a=2

        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }
}
