package StringHandling;

public class StringExample {
    public static void main(String[] args) {

        String s1 = "hello";  //String created using literals
        String s2 = "hello";  //String created using literals

        // Using == operator
        System.out.println("s1 == s2: " + (s1 == s2));
        //Using .equals() method
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        String s3 = new String("Sayali");  // String Created using keyword
        String s4 = new String("Sayali");  // String Created using keyword

        // Using == operator
        System.out.println("s1 == s2: " + (s3 == s4));
        //Using .equals() method
        System.out.println("s3.equals(s4): " + s3.equals(s4));





    }
}