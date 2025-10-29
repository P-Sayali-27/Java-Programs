package Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        //Deletion at index 1

            for(int i = 1; i<arr.length-1; i++)

            {
                arr[i] = arr[i+1];
            }
//Retrieval
        for (int i =0; i<arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }


        }
    }
