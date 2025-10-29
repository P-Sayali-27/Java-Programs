package PracticeProgram;

public class PalindromeNo {

    public static void main(String[] args)
    {
        int num = 14441;
        int temp = num;
        int reverse =0;

        while(num!=0)
        {
            int Digit = num % 10;
            reverse = reverse *10 + Digit;
            num = num/ 10;
        }
        if (temp == reverse) {
            System.out.println(temp + " is a palindrome number.");
        } else {
            System.out.println(temp + " is not a palindrome number.");
        }

    }

}
