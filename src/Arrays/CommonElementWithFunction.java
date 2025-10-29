package Arrays;

public class CommonElementWithFunction {

    public static void commonElement(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++)

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i] + " ");
                }
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {4, 3, 7, 9, 2};
        int[] arr2 = {5, 1, 4, 8, 3};


        // Calling the function
        commonElement(arr1, arr2);
    }
}