import java.math.BigInteger;
public class Problem056 {
    public static int digSum(BigInteger bi) {
        int total = 0;
        for (char c : bi.toString().toCharArray()) {
            total += Integer.parseInt(String.valueOf(c));
        }
        return total;
    }
    public static void main(String[] args) {
        int largestTotal = 0;
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                BigInteger big = BigInteger.valueOf(a);
                big = big.pow(b);
                int sum = digSum(big);
                if (sum > largestTotal) {
                    largestTotal = sum;
                    System.out.println(sum);
                }
            }
        }
        System.out.println(largestTotal);
    }
}
