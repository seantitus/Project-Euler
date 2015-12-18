import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
public class Problem069 {
    private static PrimeGen pg;
    private static HashMap<Integer, HashSet<Integer>> divisorMap;
    private static HashSet<Integer> getDivisors(int num) {
        HashSet<Integer> divisors = new HashSet<Integer>();
        ArrayList<Integer> primes = pg.getPrimesList();
        int i = 0;
        int j = num;
        if (pg.isPrime(num)) {
            divisors.add(num);
            divisorMap.put(num, divisors);
            return divisors;
        }
        while (primes.get(i) <= j && primes.get(i) < num) {
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
    private static double totient(int num) {
        Iterator<Integer> itr = getDivisors(num).iterator();
        double total = num;
        while (itr.hasNext()) {
            total *= (1 - 1.0 / itr.next());
        }
        return total;
    }
    public static void main(String[] args) {
        pg = new PrimeGen(1000100);
        divisorMap = new HashMap<Integer, HashSet<Integer>>();
        double max = 0;
        int maxI = 0;
        for (int i = 2; i <= 1000000; i++) {
            if (i % 10000 == 0) {
                System.out.println(i);
            }
            double tot = totient(i);
            if (i / tot > max) {
                max = i / tot;
                maxI = i;
            }
        }
        System.out.println(max);
        System.out.println(maxI);
    }
}
