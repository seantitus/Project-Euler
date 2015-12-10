import java.util.ArrayList;
/**
 * A class to generate prime numbers up to and including the given limit
 * @author Sean Titus
 * @version 1.0
 */
public class PrimeGen {
    private int limit;
    private int[] fullPrimes;
    private ArrayList<Integer> primesList;
    /**
     * Adds all the primes from Array fullPrimes into the ArrayList primesList
     */
    private void addPrimes() {
        for (int i : fullPrimes) {
            if (i != 0) {
                primesList.add(i);
            }
        }
    }
    /**
     * Generates all the primes up to and including the limit passed into the
     * constructor using a basic sieve
     */
    private void genPrimes() {
        int i = 2;
        fullPrimes[1] = 0; //1 is weird with primes
        while (i < (int) Math.sqrt(fullPrimes.length)) {
            if (i != 0) {
                int j = i;
                while (j < fullPrimes.length - i) {
                    j += i;
                    fullPrimes[j] = 0;
                }
            }
            i++;
        }
        addPrimes();
    }
    /**
     * Constructor
     * @param limit The largest number to check primes up to
     */
    public PrimeGen(int limit) {
        this.limit = limit + 1;
        fullPrimes = new int[limit];
        primesList = new ArrayList<Integer>();
        for (int i = 0; i < limit; i++) {
            fullPrimes[i] = i;
        }
        genPrimes();
    }
    /**
     * Gives primes in array where index corresponds to value
     * @return Array of ints with composite numbers replaced with zero
     */
    public int[] getFullPrimes() {
        return fullPrimes;
    }
    /**
     * Gives primes only in an ArrayList without composite numbers or zeros
     * @return ArrayList of prime numbers
     */
    public ArrayList<Integer> getPrimesList() {
        return primesList;
    }
}
