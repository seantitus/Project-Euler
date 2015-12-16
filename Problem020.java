import java.math.BigInteger;
public class Problem20 {
    public static void main(String args[]) {
        BigInteger bg = BigInteger.valueOf(1);
        for (int i = 1; i < 101; i++) {
            bg = bg.multiply(BigInteger.valueOf(i));
        }
        String bgString = bg.toString();
        int total = 0;
        for (String s : bgString.split("")) {
            total += Integer.parseInt(s);
        }
        System.out.println(total);
    }
}
