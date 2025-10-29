package Arrays;

public class MergeArray {
    public static void main(String[] args){
        int[] arr1 = {4,3,7,9,2};
        int[] arr2 = {4,3,7,9,2};

        int[] c = new int[arr1.length+ arr2.length];

        for(int i=0; i<arr1.length; i++) c[i]= arr1[i];
        for(int j=0; j<arr2.length; j++) c[arr1.length+j] =arr2[j];

        for (int k=0; k<c.length; k++)
            System.out.println("Elements in merged array is: "+ c[k]);


    }
}
