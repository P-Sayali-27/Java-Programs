package Sorting;

import java.util.Arrays;

public class SecondMaxMinWithFunction {

    public static void secondMaxMin(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println("2nd Min: " +arr[1]);
        System.out.println("2nd Max: " +arr[arr.length - 2]);
    }
 public static void main(String[] args){

     int[] arr ={5,3,9,1,7};
     secondMaxMin(arr);
 }

}
