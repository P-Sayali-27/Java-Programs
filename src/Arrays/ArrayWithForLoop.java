package Arrays;

public class ArrayWithForLoop {


    public static void main(String[] args) {


        String[] fruits = {"Mango", "Apple", "Banana", "Orange"}; //Array of string

        System.out.println("List of Fruits:");

        for (int i = 0; i < fruits.length; i++)
        {
            System.out.println("Fruit at index " + i + ": " + fruits[i]); //Retrieving array using For Loop
        }
    }
}
