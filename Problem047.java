import java.util.ArrayList;
import java.util.HashSet;
public class Problem047 {
    private static ArrayList<Integer> primes;
    private static boolean hasFour(int num) {
        HashSet<Integer> factors = new HashSet<Integer>();
        int i = 0;
        int j = num;
        while (primes.get(i) <= num / 2 && primes.get(i) <= j) {
            while (j % primes.get(i) == 0) {
                j /= primes.get(i);
                factors.add(primes.get(i));
            }
            i++;
        }
        return factors.size() == 4;
    }
    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(1000000);
        primes = pg.getPrimesList();
        boolean found = false;
        int i = 2;
        while (!found) {
            if (hasFour(i) && hasFour(i+1) && hasFour(i+2) && hasFour(i+3)) {
                found = true;
                System.out.println(i);
            }
            i++;
        }
    }
}
