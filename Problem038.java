import java.util.Arrays;
public class Problem038 {
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
        int largest = 0;
        for (int i = 1; i < 10000; i++) {
            String s = String.valueOf(i);
            int j = 2;
            while (s.length() < 9) {
                s += i * j;
                j++;
            }
            if (s.length() == 9 && isPan(s) && Integer.parseInt(s) > largest) {
                largest = Integer.parseInt(s);
            }
        }
        System.out.println(largest);
    }
}
