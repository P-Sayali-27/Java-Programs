package PracticeProgram;

public class ReversenumberwithFunc {

    public static void reserveFunc(int num)
    {
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
