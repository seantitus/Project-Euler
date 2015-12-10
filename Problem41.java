public class Problem41 {
    private static boolean isPandigital(int i) {
        String iString = String.valueOf(i);
        for (int j = 1; j < iString.length() + 1; j++) {
            if (!iString.contains(String.valueOf(j))) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean found = false;
        int i = 987654321;
        while (found == false) {
            if (isPandigital(i)) {
                if (isPrime(i)) {
                    System.out.println(i);
                    found = true;
                }
            }
            i -= 2;
        }
    }
}
