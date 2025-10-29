package ExceptionHandling;

public class ThrowsKeyword {

    public static void main(String[] args) throws Exception {
        int age = 17;

        if (age < 18) {
            throw new Exception("You are less than 18 years, you cannot have a driving license!");
        } else {
            System.out.println("You can have a driving license.");
        }
    }
}
