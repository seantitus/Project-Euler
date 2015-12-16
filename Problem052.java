import java.util.Arrays;
public class Problem052 {
    public static void main(String[] args) {
        boolean found = false;
        int i = 1;
        while (!found) {
            char[] ch1 = String.valueOf(i).toCharArray();
            char[] ch2 = String.valueOf(i * 2).toCharArray();
            char[] ch3 = String.valueOf(i * 3).toCharArray();
            char[] ch4 = String.valueOf(i * 4).toCharArray();
            char[] ch5 = String.valueOf(i * 5).toCharArray();
            char[] ch6 = String.valueOf(i * 6).toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            Arrays.sort(ch3);
            Arrays.sort(ch4);
            Arrays.sort(ch5);
            Arrays.sort(ch6);
            if (Arrays.equals(ch1, ch2) && Arrays.equals(ch1, ch3)) {
                if (Arrays.equals(ch1, ch4) && Arrays.equals(ch1, ch5)) {
                    if (Arrays.equals(ch1, ch6)) {
                        System.out.println(i);
                        found = true;
                    }
                }
            }
            i++;
        }
    }
}
