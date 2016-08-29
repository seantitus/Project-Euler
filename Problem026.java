import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Finds the longest recurring string of digits in a fraction 1/d, d < 1000
 * @author Sean Titus
 * @version 1.0
 */
public class Problem026 {
    /**
     * Finds how many recurring digits a BigDecimal has.
     * @param num The BigDecimal being checked for recurring digits
     * @return The length of the recurring sequence
     */
    private static int recur(BigDecimal num) {
        String numStr = num.toPlainString();
        int period = 2;
        int start = 2;
        while(period < (numStr.length() - 1)/2) {
            if (numStr.substring(start, start + period)
                .equals(numStr.substring(start + period, start + 2 * period))) {
                return period;
            }
            period++;
        }
        return -1;
    }

    public static void main(String[] args) {
        PrimeGen pg = new PrimeGen(1000);
        int longest = 0;
        int d = 0;
        for (int i : pg.getPrimesList()) {
            int r = recur(new BigDecimal(1.0).divide(
                new BigDecimal(i), 5000, RoundingMode.HALF_UP));
            if (r >= longest) {
                longest = r;
                d = i;
            }
        }
        System.out.println(d);
    }
}
