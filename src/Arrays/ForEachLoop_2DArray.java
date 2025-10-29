package Arrays;

import java.sql.SQLOutput;

public class ForEachLoop_2DArray {

    public static void main(String[] args){
  // Declare and initialize a 2D array
        int arr[][] = {
                {10, 20, 30},
                {40, 50, 60}
               };

        //Using for each loop

        for (int[] num : arr){
            for (int Element:num) {

                System.out.print(Element + " ");
            }
            System.out.println();
        }
    }
}
