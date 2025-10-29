package Collections;

import java.util.HashSet;

public class FirstDuplicateUsingHashSet {

    public static void main(String[] args) {

        int[] arr = {11, 54, 38, 11, 48, 38};

        HashSet<Integer> obj = new HashSet<>();
        for(int i=0; i< arr.length; i++)
        {
            if(!obj.add(arr[i]))
            {
                System.out.println("First Duplicate Element: " +arr[i]);
                return;
            }
        }
        System.out.println("No Duplicate Found");
    }
}
