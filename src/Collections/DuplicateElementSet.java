package Collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementSet {

    public static void main(String[] args) {

        int [] arr = {24, 61, 52, 61, 84};

        Set<Integer> obj = new HashSet<>();
        for(int i =0; i< arr.length; i++)
        {
            if(obj.add(arr[i])){
                continue;
            }
            System.out.println("Duplicate Element: " + arr[i]);
        }

    }
}
