import java.math.BigInteger;
public class Problem97 {
    public static void main(String[] args) {
        BigInteger bi = BigInteger.valueOf(2);
        bi = bi.pow(7830457);
        bi = bi.multiply(BigInteger.valueOf(28433));
        bi = bi.add(BigInteger.valueOf(1));
        String biString = bi.toString();
        System.out.println(biString.substring(biString.length() - 10));
    }
}
