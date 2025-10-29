package Sorting;

public class LinearSearchWithFunction {

    public static void linearSearch(String[] arr, String element)
    {
        int index = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==element)
            {
                index = i;

            }
        }
        System.out.println("Found at index: " + index);
    }

public static void main(String[] args)
{
    String[] arr = {"Blue","Black", "Pink", "White", "Grey"};

    String element = "Pink";
    linearSearch(arr, element);
}


}
