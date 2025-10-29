package PracticeProgram;

public class TriangleWithFunction {
    public static void printSquare(int size)
    {
        for(int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printSquare(4);
    }
}
