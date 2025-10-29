package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {
    public static void main(String[] args) {
//Creating array List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Array List " +list);
//Creating HashMap List
        HashMap<Integer, String> HM = new HashMap<>();
        HM.put(50, "w");
        HM.put(8, "x");
        HM.put(30, "y");
        HM.put(40, "z");
        System.out.println("HashMap List " +HM);

        boolean found = false;
        for(int i = 0; i <list.size(); i++)
        {
            int item = list.get(i);
            if(HM.containsKey(item))
            {
                found = true;
                System.out.println("Common Element in ArrayList and HashMap: " +item);
            }

        }
        if(!found)
        {
            System.out.println("No Common Element Found");
        }
    }
}
