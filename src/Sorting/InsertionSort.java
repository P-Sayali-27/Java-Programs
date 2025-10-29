package Sorting;

public class InsertionSort {

    //Insertion without Function
    public static void main(String[] args)
    {
        int[] arr = {5,6,3,9,2,1};

        int n = arr.length;

        for(int i=1; i<n; i++)
        {
            int key =arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key) //While loop
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }

for(int i:arr)
    System.out.println(i+ " "); //Printing Sorted values


    }


}
