import java.math.BigInteger;
public class Problem055 {
    public static boolean isPalindrome(BigInteger bg) {
        if (bg.equals(reverse(bg))) {
            return true;
        }
        return false;
    }
    public static BigInteger reverse(BigInteger bg) {
        char[] c = String.valueOf(bg).toCharArray();
        String s = "";
        for (int i = c.length - 1; i >= 0; i--) {
            s += c[i];
        }
        return new BigInteger(s);
    }
    public static boolean isLychrel(BigInteger num) {
        for (int i = 0; i < 50; i++) {
            if (isPalindrome(num.add(reverse(num)))) {
                return false;
            }
            num = num.add(reverse(num));
        }
        return true;
    }
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 10000; i++) {
            if (isLychrel(BigInteger.valueOf(i))) {
                total++;
            }
        }
        System.out.println(total);
    }
}
