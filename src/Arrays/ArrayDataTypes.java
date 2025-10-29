package Arrays;

public class ArrayDataTypes {

    public static void main(String[] args){

        // integer array
        int[] intArray = {10, 20, 30, 40};
        System.out.println("Int Array:");
        for (int i : intArray) {
            System.out.println(i);
        }

        //Float array
        float[] floatArray = {1.1f, 1.2f, 1.3f, 1.4f};
        System.out.println("float Array:");
        for (float i : intArray) {
            System.out.println(i);
        }

        //char array
        char[] charArray = {'A', 'B', 'C', 'D'};
        System.out.println("Char Array:");
        for (char c : charArray) {
            System.out.println(c);
        }

        //boolean array
        boolean[] booleanArray = {true, false, true};
        System.out.println("Boolean Array:");
        for (boolean bool : booleanArray) {
            System.out.println(bool);
        }

        //String Array
        String[] stringarray = {"pink", "Black", "Blue", "White"};
        System.out.println("String Array:");
        for (String c : stringarray) {
            System.out.println(c);
        }

    }

}
