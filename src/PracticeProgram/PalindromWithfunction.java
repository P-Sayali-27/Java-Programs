package PracticeProgram;

public class PalindromWithfunction {

    static boolean isPalindrome(int num)
    {
        int original = num,    reverse = 0;
        while(num!=0)
        {
            int Digit = num % 10;
            reverse = reverse *10 + Digit;
            num = num/ 10;
        }
        return original == reverse;
    }
public static void main(String[] args)
{
    int num = 1441;
    System.out.println(num + " is " + ((isPalindrome(num)) ? " a palindrome" : "Not a Palindrome"));
}

}
