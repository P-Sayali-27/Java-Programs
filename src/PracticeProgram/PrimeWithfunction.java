package PracticeProgram;

public class PrimeWithfunction {

    static boolean isPrime(int n){
        if (n<=1) return false;
        for(int i= 2; i <=n/2; i++){

            if(n % i == 0)
                return false;
        }

return true;

    }

    public static void main(String[] args)
    {
        int n = 13;
        System.out.println(n + " is " + (isPrime(n) ? "Prime" : "not prime"));
    }

}
