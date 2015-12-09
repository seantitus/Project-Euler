import java.util.Map;
import java.util.HashMap;
public class Problem14 {
    public static void main(String[] args) {
        Map<Integer, Integer> chains = new HashMap<Integer, Integer>();
        chains.put(1, 1);
        int largest = 1;
        int largestStart = 1;
        for (int i = 1; i < 1000000; i++) {
            double j = i;
            int length = 1;
            while (j != 1) {
                if (chains.containsKey(j)) {
                    length += chains.get(j);
                    j = 1;
                } else if (j % 2 == 0) {
                    j /= 2;
                    length++;
                } else {
                    j = 3 * j + 1;
                    length++;
                }
            }
            if (length > largest) {
                largest = length;
                largestStart = i;
            }
            chains.put(i, length);
        }
        System.out.println(largestStart + ": " + largest);
    }
}
