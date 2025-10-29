package Arrays;

public class JaggedArray {

    public static void main(String[] args)
    {
            int[][] jagged = new int[3][];

            jagged[0] = new int[2];
         jagged[1] = new int[4];
         jagged[2] = new int[1];

         jagged[1][2] = 10;

    }
}
