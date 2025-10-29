package PracticeProgram;

public class ReverseNumber {
    public static void main(String[] args)
    {
        int num = 978697766;
        int reverse =0;

        while(num!=0)
        {
            int Digit = num % 10;
            reverse = reverse *10 + Digit;
            num = num/ 10;
        }
        System.out.println("Reversed Number: " + reverse);

    }

}
