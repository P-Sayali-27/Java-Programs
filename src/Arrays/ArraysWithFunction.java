package Arrays;


public class ArraysWithFunction {

    // Function to print a 1D array
    public static void printOneDArray(int[] arr)
    {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    // Function to print a 2D array
    public static void printTwoDArray(int[][] array)
    { for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
}



public static void main(String[] args) {

        //Calling 1D & 2D Arrays without anonymous
    System.out.println("Without Anonymous array");
// Declare and initialize a 1D array
        int[] numbers = {10, 20, 30, 40, 50};
        printOneDArray(numbers); // Calling the function

// Declare and initialize 2D array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        printTwoDArray(array);  // Call the function

    System.out.println("With Anonymous array");


    //Calling 1D & 2D anonymous array
    printOneDArray(new int[]{10, 20, 30, 40, 50}); //Calling 1D Anonymous array

    //Calling 2D Anonymous array
    printTwoDArray(new int[][]{
            {1, 2, 3},
            {4, 5, 6}
    });


    }


}


