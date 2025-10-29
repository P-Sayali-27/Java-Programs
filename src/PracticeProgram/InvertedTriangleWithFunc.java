package PracticeProgram;

public class InvertedTriangleWithFunc {

    public static void printSquare(int size)
    {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
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
