import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
public class Problem073 {
    private static PrimeGen pg;
    private static HashMap<Integer, HashSet<Integer>> divisorMap;
    private static HashSet<Integer> getDivisors(int num) {
        if (divisorMap.containsKey(num)) {
            return divisorMap.get(num);
        }
        HashSet<Integer> divisors = new HashSet<Integer>();
        ArrayList<Integer> primes = pg.getPrimesList();
        int i = 0;
        int j = num;
        if (pg.isPrime(num)) {
            divisors.add(num);
            divisorMap.put(num, divisors);
            return divisors;
        }
        while (primes.get(i) <= j && primes.get(i) <= num / 2) {
            if (divisorMap.containsKey(j)) {
                divisors.addAll(divisorMap.get(j));
                j = 1;
            }
            while (j % primes.get(i) == 0) {
                divisors.add(primes.get(i));
                j /= primes.get(i);
            }
            i++;
        }
        divisorMap.put(num, divisors);
        return divisors;
    }
    private static boolean isRelPrime(int i, int j) {
        if (pg.isPrime(i)) {
            return true;
        }
        for (int div : getDivisors(j)) {
            if (i % div == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        pg = new PrimeGen(12100);
        divisorMap = new HashMap<Integer, HashSet<Integer>>();
        long total = 0;
        for (int i = 2; i <= 12000; i++) {
            for (int j = 1; j < i; j++) {
                double frac = ((double) j) / i;
                if (frac > 1.0 / 3 && frac < 1.0 / 2 && isRelPrime(i, j)) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
