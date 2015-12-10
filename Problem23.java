import java.util.ArrayList;
public class Problem23 {
    public static void main(String[] args) {
        ArrayList<Integer> abundants = new ArrayList<Integer>();
        boolean[] abundBool = new boolean[28123];
        for (int i = 1; i < 28123; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > i) {
                abundBool[i] = true;
                abundants.add(i);
            }
        }
        int total = 0;
        for (int i = 1; i < 28123; i++) {
            boolean found = false;
            for (int j : abundants) {
                if (i - j >= 0 && abundBool[i - j]) {
                    found = true;
                }
            }
            total += found ? 0 : i;
        }
        System.out.println(total);
    }
}
