import java.util.ArrayList;
public class Problem50 {
    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(1000000);
        ArrayList<Integer> primes = pg.getPrimesList();
        int longestChain = 0;
        int longPrime = 0;
        for (int i = primes.size() - 1; i > -1; i--) {
            int j = 0;
            boolean found = false;
            while (j < i && found == false) {
                int total = 0;
                int chain = 0;
                int k = j;
                while (k < i && total < primes.get(i)) {
                    total += primes.get(k);
                    chain++;
                    if (total == primes.get(i) && chain > longestChain) {
                        found = true;
                        longestChain = chain;
                        longPrime = primes.get(i);
                        System.out.println(primes.get(i) + ": " + chain);
                    }
                    k++;
                }
                j++;
            }
        }
        System.out.println(longPrime);
    }
}
                        
            
