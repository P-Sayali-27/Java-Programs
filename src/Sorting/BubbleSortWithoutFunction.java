package Sorting;


public class BubbleSortWithoutFunction {

    public static void main(String[] args) {
        int[] arr = {53, 38, 9, 64, 87};
        int n = arr.length;

        //bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        for(int i:arr) System.out.println(i + " ");
    }


}



