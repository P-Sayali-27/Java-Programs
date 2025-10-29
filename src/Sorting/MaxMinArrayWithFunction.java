package Sorting;

public class MaxMinArrayWithFunction {

    public static void maxMinArray( int[] arr) //Creating function
    {
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
        System.out.println("Maximum Value is: " + max); //To print maximum value

        System.out.println("Minimum Value is: " + min); //To print minimum Value

    }

    public static void main(String[] args)
    {
        int[] arr = {4, 7, 2, 9, 1, 5 };
        maxMinArray(arr);  //Calling function

    }



}
