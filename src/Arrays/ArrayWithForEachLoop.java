package Arrays;

public class ArrayWithForEachLoop {

    public static void main(String[] args) {

        String[] colors = {"Red", "Green", "Blue", "Yellow"}; //Array of String

        for (String str : colors) //Step 2: Retrieve data using for-each loop
        {
            System.out.println(str);
        }
    }
}
