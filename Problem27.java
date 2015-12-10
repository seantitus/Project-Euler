public class Problem27 {
    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(10000000);
        int[] primes = pg.getFullPrimes();
        int longest = 0;
        int product = 0;
        for (int a = -999; a < 1000; a++) {
            for (int b = -999; b < 999; b++) {
                int n = 0;
                int chain = 0;
                boolean loop = true;
                while (loop) {
                    int val = n * n + a * n + b;
                    if (val >= 0 && primes[val] != 0) {
                        chain++;
                        n++;
                    } else {
                        loop = false;
                    }
                }
                if (chain > longest) {
                    longest = chain;
                    product = a * b;
                }
            }
        }
        System.out.println(product);
    }
}
