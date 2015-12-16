import java.util.ArrayList;
public class Problem037 {
    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(1000000);
        ArrayList<Integer> primes = pg.getPrimesList();
        int sum = 0;
        int found = 0;
        int i = 4;
        while (found < 11) {
            boolean trunc = true;
            String iString = String.valueOf(primes.get(i));
            for (int j = iString.length() - 1; j > 0; j--) {
                trunc = trunc && pg.isPrime(Integer.parseInt(
                    iString.substring(0, j)));
            }
            for (int k = 0; k < iString.length(); k++) {
                trunc = trunc && pg.isPrime(Integer.parseInt(
                    iString.substring(k)));
            }
            if (trunc) {
                found++;
                sum += primes.get(i);
                System.out.println(iString);
            }
            i++;
        }
        System.out.println(sum);
    }
}
