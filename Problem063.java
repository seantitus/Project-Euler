import java.math.BigInteger;
public class Problem063 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 10; i++) {
            int power = 1;
            BigInteger bg = BigInteger.valueOf(i);
            while (bg.pow(power).toString().length() == power) {
                total++;
                power++;
            }
        }
        System.out.println(total);
    }
}
