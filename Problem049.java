import java.util.Arrays;
public class Problem049 {
    private static boolean isPerm(int i, int j) {
        char[] iArray = String.valueOf(i).toCharArray();
        char[] jArray = String.valueOf(j).toCharArray();
        Arrays.sort(iArray);
        Arrays.sort(jArray);
        return Arrays.equals(iArray, jArray);
    }
    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(10000);
        for (int i = 1000; i < 9998; i++) {
            for (int j = 1; 2 * j + i < 10000; j++) {
                if (pg.isPrime(i) && pg.isPrime(i + j) &&
                    pg.isPrime(i + 2 * j)) {
                    if (isPerm(i, i + j) && isPerm(i, i + 2 * j)) {
                        System.out.printf("%d%d%d\n", i, i + j, i + 2 * j);
                    }
                }
            }
        }
    }
}
