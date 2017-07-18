package PrimeNumber1;

/**
 * Created by Profile on 12/05/2017.
 */
public class PrimeNumber1 {

    public int countPrimes(int n) {

        // it initialise an array to track prime numbers
        boolean[] primes = new boolean[n];

        for (int i = 2; i < n; i++)
            primes[i] = true;

        for (int i = 2; i <= Math.sqrt(n - 1); i++) {
            if (primes[i]) {
                for (int j = i + i; j < n; j += i)
                    primes[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i])
                count++;
        }

        return count;
    }

    public static void main(String args[])
    {
        PrimeNumber1 p = new PrimeNumber1();

        int n = 3000000;
        System.out.print("Here are the total number of prime number between 1 and 3 Million is ");

        System.out.println(p.countPrimes(n));
    }

}
