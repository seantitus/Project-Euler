/**
 * Finds the sum of even numbers in the fibonacci sequence smaller than 4000000
 * @author Sean Titus
 * @version 1.0
 */
public class Problem2 {
    /**
     * Sums even fibonacci numbers
     * @param args Command line arguments that aren't used
     */
    public static void main(String[] args) {
        int total = 0;
        int prev = 1;
        int current = 1;
        while (current <= 4000000) {
            if (current % 2 == 0) {
                total += current;
            }
            int placeholder = current;
            current += prev;
            prev = placeholder;
        }
        System.out.println(total);
    }
}
