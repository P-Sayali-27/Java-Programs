package ExceptionHandling;

public class TryCatcFinally {

    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[5]);
        } catch (Exception e)
        {
          e.printStackTrace();
            System.out.println("Exception Occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Finally Block Text");
        }
        System.out.println("Program running...");
    }


}
