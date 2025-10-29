package Sorting;

public class DuplicateElementBrute {

    public static void main(String[] args)
    {
        int[] arr = {4, 5, 6, 5, 4, 3 };

        System.out.print("Duplicate Elements are: ");

        for(int i = 0; i< arr.length; i++)
        {
            for (int j= i+1; j<arr.length; j++){

                if(arr[i]== arr[j])
                {
                    System.out.print(arr[i]+ ",");
                }
            }
        }


    }

}
