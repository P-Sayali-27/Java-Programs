package Arrays;

public class MissingElementWithFunction {


    public static int missingElement(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return(expectedSum-sum);

    }

    public static void main(String[] args){
        int[] arr = { 1, 2, 4, 5, 6, 7};
        System.out.println("Missing Elements is: " + missingElement(arr));

    }
}
