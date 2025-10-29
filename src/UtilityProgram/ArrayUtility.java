package UtilityProgram;
import java.util.Arrays;

public class ArrayUtility {

        // bubble sorting
        public static void bubbleSort(int[] arr) {
            int a = arr.length;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < a - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        // Linear search
        public static String linearSearch(String[] arr, String target) {
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    index = i;
                }
            }
            System.out.println("Found at index: " + index);
            return target;
        }
        // Insertion
        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
        //Find maximum and minimum
        public static void printMaxMin(int[] arr){
            int max = arr[0];
            int min = arr[0];

            for (int i=0;i<arr.length;i++){
                if(arr[i]>max) max = arr[i];
                if(arr[i]<min) min = arr[i];
            }
            System.out.println("Print Maximum value: "+ max);
            System.out.println("Print Minimum value: " + min);
        }
        //Find second maximum and minimum
        public static void findSecondMaxMin(int[] arr)
        {
            Arrays.sort(arr);
            System.out.println("2nd Min: "+arr[1]);
            System.out.println("2nd Max: "+arr[arr.length-2]);
        }
        // Find duplicate
        public static void findDuplicate(int[] arr)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
    }



