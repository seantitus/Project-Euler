import java.util.ArrayList;
/**
 * Finds the largest prime factor of num
 * @author Sean Titus
 * @version 1.0
 */
public class Problem3 {
    /**
     * Main class to find largest prime
     * @param args Command line argument not used
     */
    public static void main(String[] args) {
        long num = 600851475143L;
        PrimeGen pg = new PrimeGen((int)(Math.sqrt(num)));
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        ArrayList<Integer> primes = pg.getPrimesList();
        int i = 0;
        while (num > 1) {
            int prime = primes.get(i);
            while (num % prime == 0) {
                num /= prime;
                divisors.add(prime);
            }
            i++;
        }
        System.out.println(divisors.get(divisors.size()-1));
    }
}
