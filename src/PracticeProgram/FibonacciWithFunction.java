package PracticeProgram;

public class FibonacciWithFunction {

static void printFibonacci(int n){
    int a = 0;
   int b = 1;
    System.out.print("Fibonacci: " + a+ " " +b+ " ");

    for(int i=2; i<=n; i++)
    {
        int next = a + b;
        System.out.print(next + " ");

        a = b;
        b = next;
    }
}
public static void main(String[] args){
    printFibonacci(12);
}

}
