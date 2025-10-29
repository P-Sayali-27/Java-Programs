package Sorting;
import java.util.Arrays;
public class SecondMaxMin {

    public static void main(String[] args){
        int[] arr ={5,3,9,1,7};
        Arrays.sort(arr);
        System.out.println("2nd Min: " +arr[1]);
        System.out.println("2nd Max: " +arr[arr.length - 2]);
    }

}
