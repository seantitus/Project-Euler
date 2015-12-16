public class Problem058 {
    public static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        double primes = 0;
        double total = 1;
        int layer = 1;
        int last = 1;
        System.out.println(primes/total);
        do {
            for (int i = 0; i < 4; i++) {
                last += layer * 2;
                total++;
                if (isPrime(last)) {
                    primes++;
                }
            }
            if (layer % 1000 == 0) {
            System.out.println(primes / total);
            }
            layer++;
        } while (primes / total > .1);
        System.out.println(1 + 2 * (layer - 1));
    }
}
