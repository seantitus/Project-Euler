import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
public class Problem032 {
    private static boolean isPan(String s) {
        if (s.length() != 9) {
            return false;
        }
        String[] sArray = s.split("");
        String[] pan = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Arrays.sort(sArray);
        return Arrays.equals(pan, sArray);
    }
    public static void main(String[] args) {
        int sum = 0;
        HashSet<Integer> prods = new HashSet<Integer>();
        for (int i = 1; i < 9999; i++) {
            for (int j = 1; j * i < 9876543 && j < 9999; j++) {
                if (isPan(String.valueOf(i) + String.valueOf(j)
                    + String.valueOf(i * j))) {
                    prods.add(j * i);
                }
            }
        }
        Iterator<Integer> itr = prods.iterator();
        while (itr.hasNext()) {
            sum += itr.next();
        }
        System.out.println(sum);
    }
}
