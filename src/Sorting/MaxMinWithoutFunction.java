package Sorting;

public class MaxMinWithoutFunction {

    public static void main(String[] args)
    {
        int[] arr = {4, 7, 2, 9, 1, 5 };
        int max = arr[0]; //max =4
        int min = arr[0]; //min =4

        for(int i=1; i< arr.length; i++ )
        {
            if(arr[i]> max)
            {
                max = arr[i];
            }
            if(arr[i]< min)
            {
                min = arr[i];
            }

        }
        System.out.println("Maximum Value is: " + max);
        System.out.println("Minimum Value is: " + min);
    }


}
