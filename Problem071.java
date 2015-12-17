import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class Problem071 {
    private static PrimeGen pg;
    private static HashMap<Integer, HashSet<Integer>> facts;
    private static boolean relPrime(int num, int denom) {
        if (pg.isPrime(denom)) {
            return true;
        }
        for (int i : facts.get(num)) {
            if (denom % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static void genFactors() {
        ArrayList<Integer> primes = pg.getPrimesList();
        for (int num = 1; num <= 1000000; num++) {
            int numCopy = num;
            HashSet<Integer> factors = new HashSet<Integer>();
            if (pg.isPrime(num)) {
                numCopy = 1;
                factors.add(num);
            }
            for (int factor = 0; primes.get(factor) < numCopy; factor++) {
                if (facts.containsKey(numCopy)) {
                    factors.addAll(facts.get(numCopy));
                    numCopy = 1;
                }
                while (numCopy % primes.get(factor) == 0) {
                    numCopy /= primes.get(factor);
                    factors.add(primes.get(factor));
                }
            }
            facts.put(num, factors);
        }
    }
    public static void main(String[] args) {
        pg = new PrimeGen(1001000);
        facts = new HashMap<Integer, HashSet<Integer>>();
        genFactors();
        double closest = 0;
        int closestNum = 0;
        for (int denominator = 1; denominator <= 1000000; denominator++) {
            int numerator = (int)(denominator * 3.0/7) + 1;
            while (((double) numerator) / denominator > closest) {
                if (relPrime(numerator, denominator)) {
                    double fraction = ((double) numerator) / denominator;
                    if (fraction > closest && fraction < 3.0/7) {
                        closest = fraction;
                        closestNum = numerator;
                    }
                }
                numerator--;
            }
        }
        System.out.println(closestNum);
    }
}
