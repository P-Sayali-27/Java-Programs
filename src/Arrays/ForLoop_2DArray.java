package Arrays;

public class ForLoop_2DArray {

    public static void main(String[] args) {

        //  // Declare and initialize a 2D array
        int arr[][] = {
                {10, 20, 30},
                {40, 50, 60}
        };

        //Using for loop

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}