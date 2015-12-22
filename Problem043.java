import java.util.Arrays;
import java.util.ArrayList;
public class Problem043 {
    private static boolean isDiv(long l) {
        if (String.valueOf(l).length() < 10) {
            return false;
        }
        int[] primes = {2, 3, 5, 7, 11, 13, 17};
        String lStr = String.valueOf(l);
        boolean div = true;
        for (int i = 0; i < 7; i++) {
            int temp = Integer.parseInt(lStr.substring(i+1, i+4));
            if (temp % primes[i] != 0) {
                return false;
            }
        }
        return true;
    }
    private static ArrayList<String> permute(String str) {
        ArrayList<String> perms = new ArrayList<String>();
        if (str.length() == 1) {
            perms.add(str);
            return perms;
        }
        String head = str.substring(0, 1);
        for (String s : permute(str.substring(1))) {
            for (int i = 0; i <= s.length(); i++) {
                perms.add(s.substring(0, i) + head + s.substring(i));
            }
        }
        return perms;
    }
    public static void main(String[] args) {
        ArrayList<String> perms = permute("1234567890");
        long total = 0;
        for (String s : perms) {
            if (isDiv(Long.parseLong(s))) {
                total += Long.parseLong(s);
            }
        }
        System.out.println(total);
    }
}
