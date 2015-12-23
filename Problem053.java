import java.math.BigInteger;
public class Problem053 {
    public static void main(String[] args) {
        BigInteger[] factorial = new BigInteger[101];
        factorial[0] = new BigInteger("1");
        for (int i = 1; i <= 100; i++) {
            factorial[i] = factorial[i - 1].multiply(BigInteger.valueOf(i));
        }
        int count = 0;
        BigInteger mil = BigInteger.valueOf(1000000);
        for (int n = 1; n <= 100; n++) {
            for (int r = 1; r <= n; r++) {
                BigInteger denom = factorial[r].multiply(factorial[n - r]);
                BigInteger com = factorial[n].divide(denom);
                if (com.compareTo(mil) > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
