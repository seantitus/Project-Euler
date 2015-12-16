/**
 * Finds the sum of all multiples of 3 or 5 under 1000
 * @author Sean Titus
 * @version 1.0
 */
public class Problem1 {
    /**
     * Calculates the sum of all multiples of 3 or 5 under 1000
     * @param args Arguments from the command line, not used
     */
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                total += i;
            } else if (i % 5 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
