import java.math.BigInteger;
public class Problem48 {
    public static void main(String[] args) {
        BigInteger total = BigInteger.valueOf(0);
        for (int i = 1; i <= 1000; i++) {
            BigInteger power = BigInteger.valueOf(i);
            power = power.pow(i);
            total = total.add(power);
        }
        String totalString = total.toString();
        System.out.println(totalString.substring(totalString.length() - 10));
    }
}
