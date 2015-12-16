import java.util.ArrayList;
public class Problem035 {
    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(10000000);
        ArrayList<Integer> primes = pg.getPrimesList();
        ArrayList<Integer> circles = new ArrayList<Integer>();
        for (int i = 0; primes.get(i) < 1000000; i++) {
            String primeString = String.valueOf(primes.get(i));
            boolean circ = true;
            for (int j = 0; j < primeString.length() - 1; j++) {
                primeString = primeString.substring(1) +
                    primeString.substring(0, 1);
                circ = circ && pg.isPrime(Integer.parseInt(primeString));
            }
            if (circ) {
                circles.add(primes.get(i));
            }
        }
        System.out.println(circles.size());
    }
}
