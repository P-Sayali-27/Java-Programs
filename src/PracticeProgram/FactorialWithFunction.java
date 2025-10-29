package PracticeProgram;

public class FactorialWithFunction {

    public static void factnumber(int num)
    {
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of Number " +num + " is " +fact);
    }

public static void main(String[] args)
{
    FactorialWithFunction.factnumber(5);
}

}
