package Sorting;

public class LinearSearchWithoutFunction {

    public static void main(String[] args)
    {
        char[] arr = {'A', 'D', 'R', 'z', 'P'};

        char element = 'c';
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
}
