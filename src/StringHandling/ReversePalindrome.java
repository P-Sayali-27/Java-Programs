package StringHandling;

public class ReversePalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        String reversed = "";

        // Reverse the string using charAt and length
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reversed);

        // Check if palindrome
        if (s.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}
